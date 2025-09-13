import java.util.Scanner;

/**
 * 分支结构
 */

public class HelloWorld {
    private static void f01() {
        // 顺序结构
        // 其实就是从上往下运行程序，一行一行走，这个也是程序的基本运行顺序
        System.out.println("你好啊，这是yyt");
        System.out.println("收到，这里是lc");
    }

    private static void f02() {
        // 比如，定义一个变量
        int num = 10;
        // 我需要判断，如果这个数字大于等于2，就输出Ok 反之没有任何回应
        // 这里就需要用到if语句了 下面是基本的代码结构
        /*
        if (关系表达式){
            语句体内容
        }
         */
        if (num >= 2) {
            // 只有条件成立，才会执行，否则不会执行
            System.out.println("Ok");
        }

        // 这里需要注意，括号里面不要写赋值表达式，如果判断是否等于，注意是两个等号
        boolean flag = true;
        // 对于布尔类型，这个时候是不会报错的！
        if (flag = false) {
            System.out.println("False");
        }
    }

    private static void f03() {
        // 分支-if-else语句
        // 加入又一个数字，大于2的时候，输出Yes，否则输出No 就是要么，要么的结构
        // 如果 否则 这样的意思
        int num = 10;
        if (num > 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 同时if是可以进行嵌套的 比如下面这样子，根据题目需求即可
        if (num >= 10) {
            if (num == 10) {
                System.out.println("Num == 10");
            } else {
                System.out.println("Num > 10");
            }
        }
    }

    private static void f04() {
        // 输入一个成绩，判断这个成绩的区间
        // 其实就是多个判断语句并列就好
        System.out.println("输入成绩：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

    private static void f05() {
        // switch 是判断一个变量的等于情况用的，可以适用于多个等于的数值
        // 比如输入一个内容 判断等级，没有的话，使用默认分支即可
        /*
        基本格式就是
        switch(变量){
            case 字面量1:
                执行对应语句
                break;
            case 字面量2:
                执行对应语句
                break;
            ....
            default:
                默认执行语句
                break;
        }
        需要注意，字面量不能重复，switch里面的必须是一个变量，否则报错
        break是必须要有的，否则会不断地往后运行
         */
        Scanner sc = new Scanner(System.in);
        // 输入一个名字 判断名字是否存在
        System.out.println("输入你的名字：");
        String name = sc.next();
        switch (name) {
            case "Kaede":
                System.out.println("你好，Kaede");
                break;
            case "YYT":
                System.out.println("你好，yyt！");
                break;
            case "LC":
                System.out.println("你好！LC！");
                break;
            default:
                System.out.println("什么？不认识你");
                break;
        }

        // 存在case穿透 这里需要注意一下
        // 常见用法就是判断月份有多少天
        int num = 1;
        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            default:
                System.out.println("二月份不知道哦");
        }
    }

    private static void f06() {
        // switch是可以简写的
        int num = 1;
        switch (num) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有哦");
        }

        // 或者，可以继续简化，JDK12的新特性
        // 对于只有一行语句的情况，可以使用箭头的形式，省略break
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个日期");
        }
    }

    public static void main(String[] args) {
        // 顺序结构
        f01();

        // 分支-if语句
        f02();

        // 分支-if-else语句
        f03();

        // 分支-if-else if-else ...
        f04();

        // 分支-switch
        f05();

        // switch扩展
        f06();
    }
}
