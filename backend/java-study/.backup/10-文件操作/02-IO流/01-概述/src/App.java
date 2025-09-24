/*
什么是IO流? 其实就是存取数据的解决方案
我们需要能够永久化存储一些数据, 则需要使用到IO流了.

另外, IO流和File息息相关. 所以我们先研究File, 再研究IO流.
程序从文件读取数据, 程序向文件写入数据

IO流有很多的分类:

- 输入流 读取本地文件
- 输出流 写入本地文件

或者

- 字节流 所有类型的文件
- - InputStream 字节输入流 读取数据
- - OutputStream 字节输出流 写入数据
- 字符流 纯文本文件 (能够直接使用记事本打开的文件)
- - Reader 字符输入流
- -  Writer 字符输出流

无论如何, 这些都不能直接创建对象, 需要使用子类.
 */
public class App {
    public static void main(String[] args) {
    }
}
