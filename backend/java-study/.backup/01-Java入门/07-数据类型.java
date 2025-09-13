/**
 * 数据类型
 */

public class HelloWorld {
    public static void main(String[] args) {
        // Java中，存在两种数据类型，基本数据类型和引用数据类型
        // 目前学习基本数据类型即可
        // 大一点区分，其实就是四个：整数，浮点数，字符以及布尔类型
        // 整数有byte short int long 四种，取值范围逐渐变大，空间也变得越来越大 一般用int即可
        // 浮点数有float和double 一般用double即可

        // 定义一个byte 最大128，最小-127，如果超了是不行的
        byte b = 10;
        System.out.println(b);
        // b = 128; 报错
        b = 30;
        System.out.println(b);

        // 定义整数类型
        int i = 255;
        System.out.println(i);

        // 定义long类型
        // 这里需要注意，不能直接long一个数据为很大的数字，比如下面这样
        // long l = 9999999999999; 整数过大 报错了
        // 需要在数据后面加一个L字符，表示这个数据是long类型
        long l = 9999999999999L; // 大写小写都可以，推荐大写，小写容易弄混了
        System.out.println(l); // 输出是不会报错的，没有任何问题

        // 对于小数，float也是需要有后缀的，F/f
        // 这里最好大写，如果不写的话也会报错
        float f = 3.14F;

        double d = 3.14;
        System.out.println(f);
        System.out.println(d);

        // 字符的定义就是正常
        char c = '殷';
        System.out.println(c);

        // 布尔类型 比较长
        boolean bo = true;
        System.out.println(bo);

        // 取值范围中：
        // double > float > long > int > short > byte
        // 没错，double是最大的！！
    }
}
