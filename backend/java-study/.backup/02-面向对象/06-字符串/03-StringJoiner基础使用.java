import java.util.StringJoiner;

/**
 * String Joiner
 */

public class HelloWorld {
    /*
    假如说，我现在有一个整数列表，我要输出如下格式
    [1, 2, 3, 4, 5]
    这个时候，如果要来回判断，就很麻烦
    所以就可以使用自带的一个joiner
     */
    public static void main(String[] args) {
        // 创建构造方法即可
        // 默认可以传入一个参数，作为间隔符号
        // 或者三个参数 间隔符号，开始符号，结束符号
        // 下面直接记录两种创建方式
        StringJoiner sj = new StringJoiner("---");

        // 使用元素，添加方法
        sj.add("aaa");
        // 可以链式编程
        sj.add("bbb").add("ccc");

        // 可以输出长度和结果
        // 由于存在toString 所以可以直接输出结果
        System.out.println(sj.length() + " " + sj);

        // 同理，在这里实现输出一个数组
        int[] arr = {1, 2, 3, 4, 5, 6};
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        // 遍历 加入即可
        for (int i = 0; i < arr.length; i++) {
            sj2.add("" + arr[i]);
        }
        // 输出结果
        System.out.println(sj2);
    }
}
