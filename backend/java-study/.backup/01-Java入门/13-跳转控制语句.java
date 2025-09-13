/**
 * 跳转控制语句
 */

public class HelloWorld {
    private static void f1() {
        // for循环的无限循环
        // 只要里面什么都不写，就是一个无限循环了

        // 可以取消注释，运行试试
        // for (; ; ) {
        //     System.out.println("无限循环");
        // }

        // 不过呢，一般无限循环用的都是while 这样比较方便
        // while (true){
        //     System.out.println("循环ing");
        // }

        // 无限循环后面不能存在其他代码，因为已经无限了，后面的代码就没用了，是不会执行的
        // 所以这里的代码我直接注释了
    }

    private static void f2() {
        /*
        continue: 跳过本次循环，继续执行下次循环
        break: 跳出循环语句
         */
        // 比如说，我现在循环，跳过偶数
        // 就可以使用控制语句的continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        // 或者，我想要循环几次后，结束循环，就可以用break了
        int i = 1;
        while (true) {
            if (i == 4) break;
            System.out.printf(i + " ");
            i++;
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        // 无限循环
        f1();

        // 跳转控制语句
        f2();
    }
}
