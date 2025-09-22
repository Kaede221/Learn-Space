/*
Java中有不同的异常处理方式.
1. JVM默认的处理方式
    如果代码中没有写任何的处理方案, 则自动处理
2. 自己处理
3. 抛出异常 (交给调用者处理)

注意事项:
1. 如果有没有捕获的异常, 则会交给虚拟机JVM自动处理 (爆红, 停止程序)
2. 在try里面, 如果代码遇到问题, 后面的代码也是不会继续运行的
 */
public class App {
    public static void main(String[] args) {
        // JVM 默认处理方式
        // demo1();

        // 自己处理
        demo2();

        // 多种异常如何处理呢
        demo3();
    }

    static void demo1() {
        /*
        默认来说, 虚拟机会直接把异常的原因, 错误的位置直接输出在控制台
        于此同时, 程序停止运行.
         */
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        // 如果中间出现异常, 后续的东西都不会执行了
        /*
        Hello 1
        Hello 2
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        	at App.demo1(App.java:22)
        	at App.main(App.java:11)
         */
        System.out.println(2 / 0);
        System.out.println("Hello 3");
        System.out.println("Hello 4");
    }

    static void demo2() {
        // 需要使用try进行错误的捕获
        // 好在不会停止程序
        int[] arr = {1, 2, 3};
        try {
            // 我们一般在try里面写可能出现异常的代码
            System.out.println(arr[10]);

            // 这里的异常就是上面语句中可能出现的异常类型
        } catch (ArrayIndexOutOfBoundsException e) {
            // 如果出现了越界错误, 应该如何处理
            System.out.println("索引越界了!");
        }

        System.out.println("我会正常执行");
    }

    static void demo3() {
        // 其实就是多个catch的事情
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
            System.out.println(1 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界啦");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为 0 哦");
        }
    }
}
