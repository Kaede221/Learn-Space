import java.util.Optional;

public class HelloWorld {
    public static void main(String[] args) {
        // 字面量
        // 其实就是告诉程序员 数据在程序中的特定格式
        // 比如18，就是一个数字类型，Kaede，就是一个字符串类型

        // 下面记录字面量的使用方法

        // 整数类型
        // 其实就是没有小数点的数字，比如下面这样子
        System.out.println(18);
        System.out.println(11);
        System.out.println(123);
        System.out.println(-99);

        // 小数类型，就是带小数点的数字
        System.out.println(-3.14159);

        // 字符串，就是用双引号括起来的内容
        System.out.println("Hello World");
        // 即使字符串里面没东西，这个东西也是一个字符串类型
        System.out.println("");

        // 字符，就是用单引号括起来的内容
        // 只能有一个字符，否则报错
        System.out.println('A');
        System.out.println('我');

        // 布尔类型 其实就是真或假 同时也只有这两个值
        System.out.println(true);
        // 任何判断的结果都是一个boolean类型
        System.out.println(1 > 2);
        System.out.println(false);

        // 空类型 什么都没有
        // null 你不能直接输出这个东西，好比：你要输出，输出什么都没有，那么就是没有输出，不可能这样子。
        // System.out.println(null);
        // 下面是代码提示给的一个输出方法，看看就行
        System.out.println(Optional.ofNullable(null));

        // 转义字符
        // 其实就是回车之类的特殊字符，我们不可能直接用回车代表回车，而是要使用特殊的符号
        // \n 代表回车
        // \t 代表制表符，会把前面的字符补齐到8或者8的整数倍，用空格自动补齐
        System.out.println("Hello, your name is\nKaede");
        System.out.println("LC\t18\nYYT\t18");
    }
}
