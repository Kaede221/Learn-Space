# 第二课：读写世界 - Bun.file() 与 Bun.write()

在 `Node.js` 中，如果你想读写文件，你需要 `import fs from 'fs'` (文件系统模块)。

Bun 极大地简化了这个操作。它将最常用的 I/O (输入/输出) 操作直接内置到了 Bun 这个全局对象上。

## 代码笔记

对于代码 `index.ts` 的文件读取部分来说:

```ts
// bun 可以直接引用文件, 这个东西存在于一个全局对象上面.
// 为了能够避免类型报错, 我在根目录中执行了 `bun init` 进而把当前的项目初始化, 以提供更好的类型提示.

// 这一步不会直接读取文件, 而是创建了一个文件引用
const file = Bun.file("welcome.txt");

// 读取的时候才会真的进行读取
// 不过读取文件是异步的, 需要加上await
const content = await file.text();

// 可以输出看看
console.log(`文件内容为:  ${content}`); // 文件内容为:  Bun is awesome!

// 另外, 也可以直接获取这个文件的大小和文件的类型
console.log(`文件的类型为: ${file.type}`);
console.log(`文件的大小为: ${file.size} 字节`);
```

await：我们使用了 await 关键字。Bun 原生支持顶层 await。你不需要把代码包在一个 async function 里，这在编写脚本时极其方便。

Bun.file()：它返回一个 BunFile 对象，这个对象非常轻量。只有当你调用 .text(), .arrayBuffer(), .json() 等方法时，它才真正去从磁盘读取内容。

性能： Bun.file() 背后是高度优化的原生代码，读取大文件时比 Node.js 的 fs.readFile 快得多。