/**
 * 小练习
情况一： 如果用户没有输入任何参数 (即 userArgs 数组为空)，程序应打印：你好, 陌生人。 (提示: 输入你的名字试试看 'bun run cli.ts 你的名字')
情况二： 如果用户输入了 1 个参数 (例如 bun run cli.ts Kaede)，程序应打印：你好, Kaede!
情况三： 如果用户输入了 多个参数 (例如 bun run cli.ts Kaede Wang)，程序应把它们当作一个完整的名字，打印：你好, Kaede Wang!
 */

const userArgs = Bun.argv.slice(2);
if (userArgs.length === 0) {
  console.log("你好, 陌生人");
} else if (userArgs.length === 1) {
  console.log(`你好, ${userArgs[0]}!`);
} else {
  console.log(userArgs.join(" "));
}
