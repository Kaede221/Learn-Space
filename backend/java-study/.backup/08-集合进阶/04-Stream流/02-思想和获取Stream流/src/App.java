import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/*
什么是流?

可以简单的理解为流水线 一般来说都会用来简化集合和数组的操作

一般的操作步骤如下:

1. 得到Stream流
2. 利用Stream的各种API进行操作 (包括中间方法和终结方法)

中间方法就是还可以继续操作的流, 终结方法就是不能继续调用的方法

获取方法如下:
1. 单列集合 stream() 这是Collection中的默认方法
2. 双列集合 无法直接获取Stream流
3. 数组 stream(T[] array) 这是 Arrays 工具类中的静态方法
4. 零散数据 of(T...values) Stream接口中的静态方法
 */
public class App {
    public static void main(String[] args) {
        // 单列集合
        demo1();

        // 双列集合
        demo2();

        // 数组
        demo3();

        // 零散数据
        demo4();
    }

    static void demo1() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(list);

        // 获取Stream流
        Stream<Integer> stream = list.stream();

        // 可以使用终结方法打印流水线上的数据
        // 这里也可以链式编程
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    static void demo2() {
        // 不能直接获取, 需要进行转换操作
        HashMap<String, Integer> mp = new HashMap<>();

        // 添加数据
        mp.put("aaa", 111);
        mp.put("bbb", 222);
        mp.put("ccc", 333);
        mp.put("ddd", 444);

        // 获取Stream流
        mp.keySet().stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 第二种获取stream流的方式
        mp.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " - " + s.getValue()));
    }

    static void demo3() {
        // 创建数组
        int[] arr = {1, 3, 5, 7, 9};
        // 获取stream流
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 引用数据类型也是可以的
        String[] arr2 = {"Kaede", "Lc", "YYt", "Good"};
        Arrays.stream(arr2).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    static void demo4() {
        // 对于零散数据, 只能使用这个方法进行输出
        Stream.of(1, "Kaede", true).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
