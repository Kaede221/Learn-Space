/**
 * 方法的重载
 */

public class HelloWorld {
    // 比如说，我现在有一个求和，求和两个整数，或者两个小数的和
    // 这个时候，可以有重复名称的方法，不过参数类型必须不一样，要么个数不同，要么类型不同
    // 如果只是返回值不同，无法构成重载关系
    // 比如下面这样子
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // 这样就实现重载了，可以分别调用这两个函数
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
    }
}
