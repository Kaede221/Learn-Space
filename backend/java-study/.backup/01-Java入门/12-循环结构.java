/**
 * 循环结构
 */

public class HelloWorld {
    private static void f1() {
        // for循环 记住格式即可
        /*
        for(初始化语句; 终止条件; 循环一次后执行的内容){
            循环体
        }
         */
        // 下面可以打印0~9 这就是for循环了
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // for循环也可以和前面的判断结合使用
        // 比如我要打印1~20所有的偶数
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                // 这里用另一个输出语句，不用换行输出了
                System.out.printf(i + " ");
            }
        }
        // 换行
        System.out.printf("\n");
    }

    private static void f2() {
        // while也是循环 直接while条件就好，条件不成立则退出循环
        int i = 1;
        // 下面这样子，输出1~10即可
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }
        // 换行
        System.out.printf("\n");
    }

    private static void f3() {
        /*
        其实，就是初始化语句不一样，for循环也可以当作while循环来写就是了
        总之，while循环和for循环其实完全等价，只是使用习惯不同
         */
        // 比如，输出1~10
        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        // 那么也可以用while循环实现
        int i = 1;
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }
        System.out.printf("\n");

        // for循环如果不知道范围，问题不大，因为三个参数其实可以空着
        i = 1;
        for (; i <= 10; ) {
            // 可以看出来，这个和while循环几乎一摸一样了
            System.out.printf(i + " ");
            i++;
        }
        System.out.printf("\n");

        // 总之，记住：for循环绝对可以和while循环互相转换，只是使用习惯的不同而已
    }

    private static void f4() {
        // do while 其实就是先运行一下，再判断循环条件
        // 总结来说，特点就是：先执行，后判断
        int num = 1;
        do {
            System.out.printf(num + " ");
            num++;
        } while (num <= 10);
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        // for循环
        f1();

        // while循环
        f2();

        // for和while的区别对比
        f3();

        // do while循环
        f4();
    }
}
