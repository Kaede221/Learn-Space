import java.util.Scanner;

/**
 * 数组
 */

public class HelloWorld {
    private static void f01() {
        // 数组有两种定义方式
        /*
        数据类型[] 数组名称;
        数据类型 数组名称[];
        这里的方括号和数组名称的前后不重要，不过一定得有，不然就是一个普通的变量了
        推荐使用第一种，第二种C++用的多
         */

        // 数组有两种初始化类型，静态初始化和动态初始化
        // 数据类型[] 数据名 = new 数据类型[]{元素1，2，3，4}
        int[] arr1 = new int[]{1, 2, 3, 4};
        // 不过可以简写 后面直接写大括号 花括号就好
        int[] arr = {1, 2, 3};

        // 其他类型差不多
        String[] names = {"Kaede", "YYt", "Lc"};
        double[] scores = {1.1, 2.2, 3.3};

        // 需要注意，数组一旦定义，长度不可变，比如上面这个，长度为3，不可以改变了
    }

    private static void f02() {
        // 这里随便定义一个数组
        int[] arr = {1, 2, 3};
        // 我们可以和变量一样，输出一下这个数组看看
        System.out.println(arr);
        // 可以看到输出了一个乱码，其实这个就是数组的地址了 [I@723279cf

        // 这个地址可以分析一下
        /*
        [ 代表了这个东西是一个数组
        I 代表这个数组是int类型的
        @ 表示一个间隔符号
        后面的才是数组的真正地址，是一个十六进制的数据
         */

        // 这个地址，就是这个数据在内存中储存的具体位置，是一个唯一的位置

        // 我们如果需要访问数组的元素，则需要使用索引来访问
        // 也就是下标就是 从0开始的索引 一直往后排列 比如有3个元素 则索引下表分别是0 1 2
        // 比如，访问数组的第一个元素
        System.out.println("数组的第一个元素是：" + arr[0]);
    }

    private static void f03() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // 我们知道，数组下标从0开始 到长度-1
        // 长度我们是直接可以获取的，数组有这个属性
        // 所以遍历就很简单了，for循环即可
        // 那么遍历这个数组就很简单了
        // 这里可以使用一个数组自带的属性，长度 数组名.length即可
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();

        // 或者使用新的遍历方式
        for (int num : arr) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }

    private static void f04() {
        // 数组是可以动态初始化的
        // 其实数组本质上是一个对象，那么自然可以使用实例化的形式 新建一个固定长度的数组
        // 比如，我现在有一个案例，输入数组长度，然后输入n个数字，最后遍历输出
        Scanner sc = new Scanner(System.in);
        System.out.println("输入n，代表新数组的长度：");
        int n = sc.nextInt();
        // 创建动态长度的数组
        int[] arr = new int[n];
        // 随后，就可以输入内容 这里不做演示了
        System.out.println("数组定义成功，长度为：" + arr.length);
    }

    private static void f05() {
        // 如果是一个整数类型，那么默认初始化就是0
        int[] arr = new int[10];
        System.out.println("int默认为:" + arr[0]);
        // 小数 就是0.0
        double[] arr2 = new double[10];
        System.out.println("double默认为:" + arr2[0]);
        // 字符类型，默认就是空格
        char[] arr3 = new char[10];
        System.out.println("char默认为:" + arr3[0]);
        // 布尔类型 默认是false
        boolean[] arr4 = new boolean[10];
        System.out.println("boolean默认为:" + arr4[0]);
        // 引用数据类型 默认是null 默认理解，引用就是除了那八个基本数据类型之外的数据类型
        String[] arr5 = new String[10];
        System.out.println("String默认为:" + arr5[0]);
    }

    private static void f06() {
        /*
        如果是一个静态数组，那么是直接放在栈里面的，太大就会栈溢出
        不过，如果是使用new创建的，则是储存在堆里面的，动态申请的内存
         */

        // 如果出现下面这种情况
        int[] arr1 = {11, 123};
        int[] arr2 = arr1;
        // 则arr1和arr2是同一个东西，内存相同，只要修改其中一个，另外一个也会发生变化
        arr2[0] = 1111;
        System.out.println(arr1[0]); // 1111
        // 这里就需要注意一下了，arr1本质上是地址，你让arr2等于地址了，相当于是一个指针，直接保存了同一个内存的东西
        // 如果非要进行数组的复制，则需要使用方法，不能直接这样子运行 这里先不说着
    }

    public static void main(String[] args) {
        /*
        数组，就是储存一堆数据的一个容器，一个箱子
        这个箱子储存的东西的类型是固定的，int的话只能储存int，如果非要存的话，还是满足隐式转换规则
        建议保证容器的类型和存入的数据类型保持一致
         */

        // 数组的定义
        f01();

        // 访问数组
        f02();

        // 遍历数组
        f03();

        // 数组的动态初始化
        f04();

        // 数组初始化规律
        f05();

        // 数组的内存图
        f06();
    }
}
