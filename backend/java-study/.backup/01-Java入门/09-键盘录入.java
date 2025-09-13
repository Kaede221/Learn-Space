/**
 * 键盘录入
 */

// 导包需要写在最上面，至少是类的前面，否则报错
// 这个是java自带的工具类，那么就是java的util的Scanner，的其实就是. 那么就记住了

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // 最简单的，我用户要输入用户名，那么自然需要用户输入一些东西，否则怎么拿到呢
        // 这里就需要用到Java自带的输入方法了
        // 需要导入Scanner这个类，然后创建对象，最后使用这个对象，让他开始接收数据

        // 实例化这个对象，这是一个基本的语法，记住就好
        Scanner sc = new Scanner(System.in);

        // 接收数据 首先定义一个数据，用于接收
        int num = 0;
        // 然后接收即可
        num = sc.nextInt();
        // 输出输入的东西是什么就好
        System.out.println(num);

        // 输入两个整数，输出两个数据的和是什么
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        // 这里需要注意运算顺序，如果直接+a+b 那么就是直接字符串拼接了
        // 这里先不细说 可以用一个c变量先计算a + b，然后再传回即可
        System.out.println("a + b = " + (a + b));
    }
}
