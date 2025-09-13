/**
 * String Builder
 */

public class HelloWorld {
    public static void main(String[] args) {
        // 我们都知道，普通的字符串是不可变的，效率太低了，所以就有了这个
        // 这个相当于一个容器，不过里面的内容是可变的
        // 既然都是容器了，那么自然是一个引用数据类型
        // 所以 这里就需要使用new关键字了
        StringBuilder sb = new StringBuilder();

        // 空参构造是可以的 由于是一个对象，所以需要转换为String才能打印
        // 但是，string builder有特殊处理，这里直接输出就是字符串了，不是地址值
        System.out.println(sb);

        // 追加字母 反正啥都可以append
        sb.append("abc");
        sb.append(true);
        System.out.println(sb);

        // 有一个翻转方法
        // 这个直接反转就好，不需要让某某等于这个东西
        sb.reverse();
        System.out.println(sb);

        // 也可以获取长度
        System.out.println(sb.length());

        // 存在一个toString函数 这个函数其实就是让sb转换为字符串的东西
        // 默认输出调用的就是这个方法，等效于直接输出sb
        System.out.println(sb.toString());
    }
}
