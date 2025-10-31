/**
 * "动手实验" (二)：一个简单的回声 (Echo) 工具
 * echo 是一个 Linux 命令，你给它什么，它就打印什么。让我们用 Bun 来复刻它
 */

const userArgs = Bun.argv.slice(2);
console.log(userArgs.join(" "));

/*
bun .\src\index2.ts 这是一段需要 被重复的话  
这是一段需要 被重复的话
 */
