/**
 * 带返回值方法的定义与调用
 */

public class HelloWorld {
    // 有的时候，我们并不需要一个方法始终把结果输出，因为我们可能在方法外面需要这个结果，并且进行一些处理
    // 这个时候，我们就需要这个方法返回一个数据了
    // 先正常实现一个相加的函数吧

    // 注意，原来是void，因为没有返回值，这里有了，所以就是int类型了
    public static int add(int num1, int num2) {
        // 返回，return 直接返回两个数据的和即可
        return num1 + num2;
    }

    public static void main(String[] args) {
        // 我们可以定义一个数字，等于10和20的和
        int res = add(10, 20);
        // 然后输出即可
        System.out.println(res);

        // 或者直接输出这个返回值
        System.out.println(add(11, 123));
    }
}
