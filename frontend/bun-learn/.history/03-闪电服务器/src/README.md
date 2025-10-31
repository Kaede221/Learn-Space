# 第三课：启动服务 - Bun.serve() 闪电服务器

在 Node.js 中，要启动一个 Web 服务器，你通常需要 http 模块，或者更大概率会使用 Express, Koa, Fastify 这样的第三方框架。

Bun 再次“化繁为简”。它内置了一个极快（可能是最快）的 HTTP 服务器 API：Bun.serve。

- 它的目标就是成为地球上最快的 HTTP 服务器。在很多基准测试中，它的每秒请求处理量 (RPS) 是 Node.js (甚至 Go/Rust 的某些框架) 的数倍
- 它不使用 Node.js 那套 (req, res) 回调函数，而是完全基于现代的 Web 标准 API，如 Request 和 Response 对象。这意味着你今天写的代码，未来可以（或已经可以）在浏览器、Cloudflare Workers 等其他环境中“无缝”运行。

可以创建一个 `server.ts` 作为服务器的文件.