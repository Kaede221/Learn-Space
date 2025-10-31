// NOTE 这个可以修复编译器导致的报错
export {};
/**
 * 小练习
 * 创建一个名为 input.txt 的文件，里面写上几行你喜欢的英文诗句或歌词 小写字母
 * 读取 input.txt 的内容
 * 将所有内容转换为大写 (提示: 使用 JavaScript 的 .toUpperCase() 字符串方法)
 * 将转换后的内容写入到一个新文件 processed.txt
 * 最后，检查 processed.txt 文件的内容是否正确
 */

const targetFile = Bun.file("input.txt");

await Bun.write(targetFile, "good job kaede");

// 读取文件内容
let fileContent = await targetFile.text();
console.log("input.txt 文件内容为", fileContent);

// 转换为大写
fileContent = fileContent.toUpperCase();
// 写入新的文件中
await Bun.write("processed.txt", fileContent);

const newFile = Bun.file("processed.txt");
console.log("文件写入完毕, 内容为: " + (await newFile.text()));
