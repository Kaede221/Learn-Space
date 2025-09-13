import java.util.Scanner;

/**
 * 字符串基础学习
 */

public class HelloWorld {
    private static void f01() {
        // 最常见的，就是直接赋值，或者使用new关键字即可
        // 都尝试一下吧
        String name1 = "Kaede";
        System.out.println(name1);

        // 空参构造
        String s2 = new String();
        // 默认什么都没有，直接就是一个空的东西
        System.out.println("@" + s2 + "@");

        // 有参构造
        String s3 = new String("Name");
        System.out.println(s3);

        // 或者通过字符数组实现字符串
        // 可以用来修改字符串用的 先拆分为数组，再进行修改字符串
        char[] chars = {'a', 'b', 'c'};
        String s4 = new String(chars);
        System.out.println(s4);

        // 另外，由于字符本质可以是byte 所以在网络中，也可以使用byte实现
        // 因为网络上都是字节信息 字节信息转字符串，所以使用这个
        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }

    private static void f02() {
        // 字符串，可以是new的，也可以是直接创建的
        // 这里需要注意一下 一般的等于是== 可以试试
        String s1 = "abc";
        String s2 = "abc";
        // true
        System.out.println(s1 == s2);

        // 但是如果有一个是new出来的呢？
        String s3 = new String("abc");
        // false
        System.out.println(s3 == s1);

        // 因为基本数据类型，比较的是数据值，但是引用数据类型比较的是地址

        /*
        因为，如果直接使用字符串，那么使用的是字符串池里面的东西，这些东西的地址都是不变的，所以直接使用等号是没问题的
        不断复用同一个内存
        但是第二个，使用new，则是堆中开辟的新的内存，两个内存不一样了，所以false 不相同
         */

        // 不过，字符串提供了两个方法 专门用来比较字符串的内容
        String str1 = "Kaede";
        String str2 = new String("Kaede");
        // 直接使用自带的方法即可 这个方法是字符串的方法 所以需要使用字符串点方法
        System.out.println(str1.equals(str2));
        // 还可以忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    private static void f03() {
        // 加入我输入一个abc字符串，进行比较呢
        // String s1 = "abc";
        // Scanner sc = new Scanner(System.in);
        // String s2 = sc.next();
        // // 如果使用== 也是false
        // System.out.println(s1 == s2);

        // 因为本质上，sc.next其实也存在一个new的步骤，只是看不到而已
        // 这个字符串 本质也是new出来的，可以查看一下源代码就知道了
    }

    private static void f04() {
        // 这里需要使用索引来遍历 使用一个方法就可以获取某个地方的字符了
        // 另外就是获取长度 这个是一个方法，不是属性了
        String str = "Lc love YYt Forever!";
        // 开始遍历即可 正常使用for循环
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        // 创建字符串对象
        f01();

        // 字符串的比较
        f02();

        // 注意点
        f03();

        // 遍历字符串
        f04();
    }
}
