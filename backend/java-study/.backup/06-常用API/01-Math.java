public class Test {
    /*
    Math 就是专门用来数学计算的一个 工具类
    这个类里面的所有方法都是静态方法
    所以如果需要使用，直接使用类名就好
    Math数据lang包 不需要导入
     */
    private static void f1() {
        // 绝对值函数
        // 可以获取传入内容的绝对值是多少
        System.out.println(Math.abs(-15));
        System.out.println(Math.abs(-3.1415926));
        System.out.println(Math.abs(3.1415926));

        // 但是这个方法存在Bug 如果没有正数和负数对应 就爆了，显示的是自己
        // 这里直接使用数据的一个最小值，不写那么长的一个数据了
        System.out.println(Math.abs(Integer.MIN_VALUE));

        // 如果遇到了这个问题，建议使用另外一个abs 会好用一些
        // 原本的是压根没有提示，这个会直接报错 告诉你数据超出范围了
        // System.out.println(Math.absExact(Integer.MIN_VALUE));
    }

    private static void f2() {
        // 向上取整
        // 往数轴的正方向 找到最近的一个整数即可
        // 就是ceil
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.ceil(1));
        System.out.println(Math.ceil(-1.1));
    }

    private static void f3() {
        // 向下取整
        // 其实就是去尾法 往数轴的负方向，找到最近的一个整数
        System.out.println(Math.floor(1.1));
        System.out.println(Math.floor(0.1));
        System.out.println(Math.floor(-1.1));
    }

    private static void f4() {
        // 四舍五入
        System.out.println(Math.round(1.55));
        System.out.println(Math.round(1.45));
        System.out.println(Math.round(-1.55));
        System.out.println(Math.round(-1.45));
    }

    private static void f5() {
        // 获取两个数据之中的最大值是多少
        System.out.println(Math.max(10, 20));
        System.out.println(Math.max(11, 123));

        // 最小值也是一样的
        System.out.println(Math.min(10, 20));
        System.out.println(Math.min(11, 123));
    }

    public static void main(String[] args) {
        f1();
        Divider();
        f2();
        Divider();
        f3();
        Divider();
        f4();
        Divider();
        f5();
        Divider();
        f6();
        Divider();
        f7();
        Divider();
        f8();
    }

    private static void f8() {
        // Java 自带随机数函数
        // 区间是左闭右开
        // 这个随机数是0~1之间的 不过不怎么常用，一般用的是一个Random库 这个会好一些
        System.out.println(Math.random());

        // 同理，如果我要获取1~100的，那么就是乘以100即可
        // 对于前端来说，其实获取随机数都是这么写的就是了
        for (int i = 0; i < 10; i++) System.out.println(Math.floor(Math.random() * 100 + 1));
    }

    private static void f7() {
        // 对于平方根立方根，有直接使用的函数，可以不使用pow来实现
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(4));
    }

    private static void f6() {
        // 获取a的b次方 直接使用pow即可
        System.out.println(Math.pow(10, 2));
        // 也可以进而实现开根号
        System.out.println(Math.pow(4, 0.5));
        // 负数也是可以的
        // 2的-2次方是啥意思 是2的平方分之一 那么就是1/4了
        System.out.println(Math.pow(2, -2));
    }

    private static void Divider() {
        System.out.println("---分割线---");
    }
}
