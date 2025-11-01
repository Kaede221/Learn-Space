# Elysia 框架

之前, 我们通过下面这种方式实现路由:

```ts
if (path === "/") {
  // ...
} else if (path === "/api") {
  // ...
} else {
  // 404
}
```

然而, 这样是非常不优雅的. 框架 (Framework) 就是来解决这个问题的。 框架提供了一套优美的“规则”和“工具”，让你专注于业务逻辑，而不用操心底层的 if/else 路由、参数解析等。

Elysia.js 是什么？ 它是一个 Web 框架，就像 Express 或 Fastify 之于 Node.js 一样。 但 Elysia 的特殊之处在于：

1. 为 Bun 而生： 它的设计完全基于 Bun.serve，因此它能发挥出 Bun 100% 的性能，是目前世界上最快的 Web 框架之一。
2. 类型安全： 它与 TypeScript 深度集成，能自动推断你的请求体 (Body)、参数 (Params) 的类型，极大减少 Bug。
3. API 优美： 它的 API 设计得非常直观和易于上手。