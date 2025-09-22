/*
学习异常, 不是为了不出异常
而是为了知道, 程序出现异常的时候, 我们应该怎么处理
 */
public class App {
    public static void main(String[] args) {
        // 异常, 就是代码出现的问题
        int[] arr = {10, 20, 30};

        // 比如下面这个, 会爆出越界异常
        System.out.println(arr[3]);

        /*
        Java中的异常, 属于 java.lang.Throwable 类, 分为 Error 和 Exception
        Exception是异常, 里面分为 RuntimeException 和其他异常
        空指针之类的异常都是Runtime Exception的子类 -> 运行时异常

        Error则是严重的问题, 是硬件问题, 代码层面不需要管
         */
    }
}
