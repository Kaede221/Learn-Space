/**
 * 最简单的方法的定义与调用
 */

public class HelloWorld {
    // 最简单的方法定义的方式
    // 注意，定义方法需要写在main方法外面，但是需要在class的里面 就是这个中间的地方
    /*
    public static void 方法名() {
        程序代码写在里面就好
    }
     */
    public static void playGame() {
        System.out.println("呼叫YYT");
        System.out.println("YYT收到~");
        System.out.println("呼叫LC");
        System.out.println("LC收到~");
    }

    public static void main(String[] args) {
        // 什么是方法
        /*
        方法，就是把一些常用的代码打包，方便多次调用，进而提升代码的复用性和可维护性
        方法：程序中最小的执行单元
        同时，方法也是程序的基础，比如你看到的main函数，其实就是main方法，不过我们不需要手动调用它，程序运行的时候会自动调用这个方法
         */

        // 方法定义后，需要调用 直接写方法名();就好
        playGame();

        // 当然，方法可以多次调用，直接一行代码搞定
        playGame();
    }
}
