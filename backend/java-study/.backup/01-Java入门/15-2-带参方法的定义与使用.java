/**
 * 带参方法的定义与调用
 */

public class HelloWorld {
    // 参数，说的就是你给方法传入的数据，比如我要写一个方法，计算两个数据的和
    // 我们不可能给他写死了，只能计算某两个数据的和
    // 所以，就需要给方法动态传入参数
    // 直接在基础上，小括号里面给参数就好，这里必须每个参数都说明类型，用逗号隔开
    public static void add(int num1, int num2) {
        // 括号里面的num1 和 num2，叫做形式参数 外面调用的时候，传入的叫做实参
        int res = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + res);
    }

    public static void main(String[] args) {
        // 调用方法，就是方法名，不过这里需要传入两个数据而已
        // 传入数据的类型必须和要求传入的一一对应，否则报错
        add(10, 20);
        add(20, 30);
        add(11, 123);
    }
}
