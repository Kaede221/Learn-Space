# 第一课：初识 Bun - 安装与 "Hello World"

对于一个 *.ts 文件来说, 只要安装了bun, 那么不需要配置任何的ts, 就可以直接编译运行!

对于当前目录下的 `index.ts` 来说, 直接运行 `bun run index.ts` 就可以直接在控制台看到效果! 这就是 bun 的一大魅力: 原生的TS支持!

## 什么是 bun

可以类比于一个 瑞士军刀:

在以前（使用 Node.js）的时代，你可能需要：

- node (来运行 JS)
- npm / yarn (来装依赖)
- jest (来跑测试)
- webpack / esbuild (来打包代码)
- tsc (来编译 TypeScript)

现在, bun直接就都可以做到了, 不需要安装别的东西!

## 为什么 bun 可以这么快?

1. JavaScriptCore (JSC) 引擎： 相比 V8，JSC 在“启动时间”上优化得更好。
2. Zig 语言编写： Bun 的底层不是像 Node.js 那样用 C++ 写的，而是用一个叫 Zig 的现代底层语言，这让它能进行更精细的内存控制和并发处理。
3. 内置标准： 它在内部原生实现了许多 Web API（如 fetch, Response, WebSocket），以及 Node.js API（如 fs, path），无需外部依赖，效率极高。