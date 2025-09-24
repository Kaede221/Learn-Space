import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字节输出流 FileOutputStream
可以操作本地文件的字节输出流, 可以把程序的数据写入到本地文件中

基本的使用步骤:
1. 创建字节输出流对象
2. 写入数据
3. 释放资源
 */
public class App {
    public static void main(String[] args) {
        // 基础使用
        demo1();

        // 细节部分
        demo2();

        // 字节输出流的三种输出方式
        demo3();

        // 换行和续写
        demo4();
    }

    static void demo1() {
        // 比如, 把一段文本写入到本地文件
        try {
            // 创建的时候, 需要指定创建的文件的相对路径
            FileOutputStream fos = new FileOutputStream("./src/a.txt");

            // 随后, 写入数据
            fos.write(97);

            // 释放资源
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("创建错误 " + e.getMessage());
        } catch (IOException e) {
            System.out.println("写入或释放错误 " + e.getMessage());
        }
    }

    static void demo2() {
        /*
        细节:
        参数为File对象或者字符串都是可以的 创建对象会自动转换
        如果文件不存在, 会创建新的文件, 但是父目录必须存在, 否则报错
         */
        try {
            // 这个代码会抛出异常, 因为父目录不存在
            // 但是它无法创建嵌套目录的文件
            FileOutputStream fos = new FileOutputStream("./src/a/b/a.txt");
        } catch (IOException e) {
            System.out.println("错误 " + e.getMessage());
        }

        // 另外, 写入数据的时候, 参数为整数, 但是其实写入的这个数据会转换为ASCII的对应字符
        // 所以 97 -> a 字符.

        // 如果多次write, 则会进行追加, 不过每次都会覆盖之前的文件内容
        try {
            FileOutputStream fos = new FileOutputStream("./src/a.txt");

            // 写入多个字符
            fos.write('9');
            fos.write('7');

            // 关闭文件
            fos.close();
            // 现在, 文件的内容就是97了
        } catch (IOException e) {
            System.out.println("错误 " + e.getMessage());
        }

        /*
        如果没有释放资源, 这个时候文件是占用的
        如果想要删除文件, 或者别的进程操作文件, 则会被拒绝
        因为资源没有释放
        所以 还是需要释放资源的.
         */
    }

    static void demo3() {
        // 一个一个字节的写入太麻烦了, 耗费时间, 写的也多 这不好
        // 所以我们可以使用别的方式进行写入, 比如写入一个数组
        try {
            // 如果文件不存在, 创建文件; 如果文件存在, 则清空文件
            FileOutputStream fos = new FileOutputStream("./src/a.txt");
            // 创建一个字节数组
            byte[] bytes = {97, 98, 99, 100, 101};
            // 写入这个字节数组 abcde 成功写入了
            fos.write(bytes);
            fos.close();

            // 另外可以写入一个数组的一部分 三个参数:
            // 数组, 起始索引, 长度
            // 这里的长度就是个数的意思
            FileOutputStream fos2 = new FileOutputStream("./src/a.txt");
            // 从索引1开始, 写入两个内容
            // 也就是 bc
            fos2.write(bytes, 1, 2);
            fos.close();
        } catch (IOException e) {
            System.out.println("文件操作异常 " + e.getMessage());
        }
    }

    static void demo4() {
        try {
            FileOutputStream fos = new FileOutputStream("./src/a2.txt");

            // 我们不可能一直写数组 我们要换一个方法
            String str = "Good morning, Kaede!";
            // 可以通过一个方法直接获取字节数组
            fos.write(str.getBytes());

            // 如果需要换行, 使用 \r\n 即可, 不过Java进行了优化, 可以直接写 \n
            fos.write("\nYou Can See Me!!!".getBytes());

            fos.close();
        } catch (IOException e) {
            System.out.println("文件操作失败 " + e.getMessage());
        }
    }
}
