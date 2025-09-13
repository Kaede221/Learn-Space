import java.io.IOException;

public class Test {
    /*
    Runtime
    这个表示的是虚拟机的运行环境是什么
     */
    public static void main(String[] args) throws IOException {
        // 可以通过实例化，获取当前操作系统下的运行环境对象
        Runtime runtime = Runtime.getRuntime();

        // 可以获取CPU的运行线程是多少
        System.out.println("当前设备CPU线程数量为：" + runtime.availableProcessors());

        // 也可以获取当前这个虚拟机下，获取到的设备总内存的大小是多少 byte类型
        // max就是表示一个最大值
        System.out.println("系统内存大小为：" + runtime.maxMemory());

        // 也可以获取当前虚拟机已经获取到的的内存数量为多少
        // 这个就是表示目前获取了多少
        System.out.println("当前内存已经占用：" + runtime.totalMemory());

        // 当然，就可以获取剩余的内存大小是多少
        System.out.println("剩余内存大小为：" + runtime.freeMemory());

        // 还有最重要的 exec 直接运行cmd代码 或者说当前系统的一些命令
        // 不能直接运行，这里需要判断异常，因为执行的代码可能是错的，所以需要修改一下
        runtime.exec("notepad");

        // 以及退出，不过这个东西和System是一样的，没区别
        runtime.exit(12311);
    }
}
