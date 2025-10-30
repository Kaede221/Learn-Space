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

// === 同时, bun也可以写入文件操作 ===
// 直接通过 Bun.write() 即可写入文件内容
const newContent = "我正在学习 Bun.JS!";

// Bun.write(路径, 内容)
await Bun.write("output.txt", newContent);

// 可以组合使用, 锻炼一下
const newFile = await Bun.file("./output.txt");
console.log("刚刚写入的内容为: " + (await newFile.text()));
