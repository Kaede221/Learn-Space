public class HelloWorld {
    /*
    Static注意事项如下
    - 静态方法只能访问静态变量和静态方法
    - 非静态方法可以访问静态变量，也可以访问非静态的内容
    - 静态方法中没有this关键字
     */

    // 对于main方法来说
    // public 说明了，这个东西会被JVM调用，访问权限足够大
    // static 代表不需要创建对象，直接调用即可
    // 因为main是静态的，所以测试类中的其他方法也应当为静态的
    // void说明不需要返回值
    // 只有main方法会被识别，其他的方法虚拟机是不会直接获取的
    // 另外还有一个参数 这个参数目前没用，不用在意
    // 这个参数主要是在运行程序的时候直接传参的，不是在控制台中传参的
    public static void main(String[] args) {
        // 长度为0 默认是没有数据的
        System.out.println(args.length);
        // 不过我们可以尝试读取这个数据
        for (String s : args) {
            // 查看有哪些东西
            System.out.println(s);
        }
    }
}
