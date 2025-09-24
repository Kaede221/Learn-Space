import java.io.File;

/*
如果我们需要存储一下进度, 或者是访问本地的一些东西
则需要使用到文件模块了.

我们需要知道, 文件的路径 File, 以及如何保存, IO 流.

首先学习File, 也就是路径, 随后再学习 IO 流.
路径分为相对路径和绝对路径.
 */
public class App {
    public static void main(String[] args) {
        /*
        File类, 就是表示了一个路径, 可以是文件的路径, 也可以是文件夹的路径
        这个路径可以存在, 也可以不存在

        File类常见的构造方法有:
        File(String pathname) 根据文件路径创建文件对象
        File(String parent, String child) 根据父路径名字字符串和子路径字符串创建文件对象
        File(File parent, String child) 同上, 不过父路径为对象
         */

        // 根据文件路径 创建路径对象
        String str = "./test.txt";

        // 随后 就可以创建文件路径对象了
        File f1 = new File(str);

        // 可以打印看看
        // 其实这里打印出来和上面的字符串是一样的
        System.out.println(f1);

        // 为什么要定义File对象呢? 当然是为了操作文件, 使用方法
        // 因为字符串就是字符串, 和本地的文件是没有关联的.

        // 另外的定义方法 就是说明父路径和子路径
        String parent = "./";
        String child = "test.txt";

        // 拼接
        File f2 = new File(parent, child);
        System.out.println(f2);
    }
}
