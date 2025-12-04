import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流 FileInputStream
 * 可以把本地的文件读取到程序里面
 */
public class App {
    public static void main(String[] args) throws IOException {
        // 创建对象
        // 我们需要告诉他 我想要从哪个文件读取
        FileInputStream fis = new FileInputStream("./src/test.txt");

        // 直接获取读取到的内容
        // 调用一次 仅仅读取第一个字符 a就是97 所以输出 97
        int b1 = fis.read();
        System.out.println(b1);
        System.out.println((char) b1);

        // 释放资源
        fis.close();

        // 如果需要直接获取 则需要一直循环获取或者是按照下面的方法
        // 如果读取不到 则返回 -1 的字符串
    }
}
