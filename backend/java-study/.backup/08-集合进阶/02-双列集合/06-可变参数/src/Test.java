/*
可变参数, 就是参数是不固定的, 可以根据需要改变
比如, 计算多个数据的和, 我们可能不确定多少个数据, 那么就可以使用可变参数了
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(getSum(arr));

        // 按照新的方法, 就可以直接传入多个参数了
        System.out.println(getSum2(10, 20, 30, 40, 50));
    }

    // 之前 我们会传入一个数组进行求和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 但是这样不太好, 首先需要定义数组, 还需要传递数组, 很麻烦
    // 简单应该按照下面这样写 数据类型...名字
    // 底层其实还是数组, 不过不需要我们创建数组, 这里的args本质上也是按照数组的方式使用
    public static int getSum2(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    /*
    另外, 可变参数有一些细节:
    1. 一个函数只能有一个可变参数
    2. 可变参数需要写在最后面
     */
}
