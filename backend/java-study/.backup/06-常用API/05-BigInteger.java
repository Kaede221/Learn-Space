import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Test {
    /*
    BigInteger 大整数类型
    Java中 整数有四种类型 byte int short long
    但是，我们可能会遇到 超出long长度的数据
    这个时候，我们可以选择自己实现一个整数类型，也可以直接使用Java自带的大整数类型
    比如这个东西 就可以直接使用了
     */

    // 分割线函数
    private static void Divider() {
        System.out.println("---分割线---");
    }

    // BigInteger的定义
    private static void f1() {
        // 可以创建一个long类型的数据
        // 这个最大值 就是long可以储存的最大值了
        long a = Long.MAX_VALUE;
        System.out.println(a);

        // 如果我还要更大
        a++;
        // 栈溢出了，直接变成负数 这个时候我们就需要使用自定义的整数类型了
        System.out.println(a);

        // 这个是一个类 那么我们就可以创建对象了
        // 获取一个随机的大整数 [0, 2^n)
        // 第一个表示，这个整数的范围是0~2的多少次方，第二个参数就是一个random对象而已
        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println(bd1);

        // 不过我们一般用的都是指定的数据
        // 根据字符串来获取就是了
        // 这里的字符串 必须是一个整数 否则报错
        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

        // 第三种 就是获取指定进制的一个大整数
        // 第二个参数就是进制是什么 但是这里需要注意，进制需要满足规则，否则报错 比如二进制只有0和1
        BigInteger bd3 = new BigInteger("100", 2);
        // 输出的时候，是按照10进制输出的
        System.out.println(bd3);

        // 当然 还可以把数字转换为BI对象
        // 这里需要注意一下，这个范围比较小，是long的取值范围以内的，超出去了就不行了
        // 如果超出去了 直接报错
        BigInteger bd4 = BigInteger.valueOf(11123);
        System.out.println(bd4);

        // 另外有一个细节 对于-16~16的数据，内部是有对应的对象的，如果多次获取，不会创建新的对象 所以获取速度会非常快
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        // 可以对比一下 看看内存是否一样
        // == 比较的是地址值 如果需要比较内容 用的是equals
        System.out.println(bd5 == bd6);

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        // 17 超出了范围 就没有优化了 内存不一样了
        System.out.println(bd7 == bd8);

        // 对于计算 不会修改原来的值，这个能理解吧
        // 返回的东西是一个新的对象，内存是完全不一样的！
        bd7 = bd7.add(bd8);
        System.out.println(bd7);
    }

    // BigInteger的常用方法
    private static void f2() {
        // 它既然是一个数字，那么自然就存在加减乘除
        // 当然 这个除法还是普通的获取整数部分，还有一个除法可以获取商和余数
        // 另外，自然存在判断是否相等，以及进行次方运算的函数，以及max和min
        // 当然 BigInteger也是可以转换为int类型的，也是使用方法接收即可
        BigInteger bd1 = new BigInteger("11123");
        BigInteger bd2 = new BigInteger("123");

        // 下面就直接演示对应的计算规则了
        // 基础的加减乘除
        {
            BigInteger bd = bd1.add(bd2);
            System.out.println(bd);
            System.out.println(bd1.subtract(bd2));
            System.out.println(bd1.multiply(bd2));
            System.out.println(bd1.divide(bd2));

            // 还有特殊的除法，获取商和余数是什么
            // 这里使用一个后面的方法包装 其实意思就是把列表转换为可见的数字而已
            System.out.println(Arrays.toString(bd1.divideAndRemainder(bd2)));
        }

        // 还可以判断是否相同
        System.out.println(bd1.equals(bd2));

        // 以及次方运算
        // 注意，这里传入的是一个int类型 不能传入其他的东西
        System.out.println(bd1.pow(10));

        // 另外，也可以获取小和大的数字是多少
        // 这里的max 返回的是对象，是大的对象，所以如果判断地址，地址是一摸一样的
        System.out.println(bd1.max(bd2));
        System.out.println(bd1.min(bd2));

        // 对于转换 需要符合数据的范围 否则会超出去的
        bd1 = BigInteger.valueOf(Integer.MAX_VALUE);
        // 输出看看
        System.out.println(bd1);

        // 反过来也是可以的
        int num = bd1.intValue();
        System.out.println(num);
    }

    public static void main(String[] args) {
        f1();
        Divider();
        f2();
    }
}