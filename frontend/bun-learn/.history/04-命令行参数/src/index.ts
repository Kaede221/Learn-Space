// 通过 bun.argv 获取所有的命令行参数
console.log("Bun.argv 的内容是:");
console.log(Bun.argv);

// NOTE 如果我们直接运行 bun index.ts 会出现如下输出:
/*
Bun.argv 的内容是:
[ "C:\\Users\\Kaede\\AppData\\Roaming\\npm\\node_modules\\bun\\bin\\bun.exe", "D:\\Documents\\WorkSpace\\Learn-Space\\frontend\\bun-learn\\src\\index.ts" ]
*/

// 其实这里的第一个内容就是bun的可执行文件路径, 第二个是正在运行的脚本路径.
// 我们真正需要关心的参数, 是从第二项开始的参数, 所以可以进行一个分割
const userArgs = Bun.argv.slice(2);
console.log("用户的参数为", userArgs);

// bun .\src\index.ts hello world kaede
/*
Bun.argv 的内容是:
[ "C:\\Users\\Kaede\\AppData\\Roaming\\npm\\node_modules\\bun\\bin\\bun.exe", "D:\\Documents\\WorkSpace\\Learn-Space\\frontend\\bun-learn\\src\\index.ts",
  "hello", "world", "kaede"
]
用户的参数为 [ "hello", "world", "kaede" ]
*/

// 这样就获取了用户的参数!
