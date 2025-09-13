import java.util.Arrays;
import java.util.Comparator;

/**
 * Lambda 最基本的作用就是简化匿名内部类的书写方式
 */
public class Test {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    public static void demo1() {
        // 之前, 我们的匿名内部类是这样写的
        Integer[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        // 通过sort进行排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(arr));

        // 无论如何, 这样不够优雅.
        // 使用lambda, 可以这样写:
        Integer[] arr2 = {1, 3, 5, 7, 9, 8, 6, 4, 2, 10};
        Arrays.sort(arr2, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        System.out.println(Arrays.toString(arr2));

        /*
        简单说, 就是 JS 的箭头函数的意思. () => {}
        不过, 需要注意:
        只能简化函数式接口的匿名内部类的写法
           即 有且仅有一个抽象方法的接口
         */
        // 可以调用一下下面的接口
        method(() -> System.out.println("游泳ing"));
    }

    public static void demo2() {
        // 规则: 可推导, 可省略
        // 参数类型可以不写, 括号也可以省略, 一行语句的时候, return 也可以不写
        Integer[] arr = {1, 3, 5, 4, 2};
        // 这里因为类型对应, 所以参数类型可以不写
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }

    public static void demo3() {
        // 写一个小练习 根据字符串长短排序
        String[] arr = {"a", "bbb", "cc", "dddd", "ffffff", "ggggg"};

        // 通过lambda排序
        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(arr));
    }

    // 定义一个方法
    public static void method(Swim s) {
        s.swiming();
    }
}

// 假设提供一个接口
// 需要是函数式接口 可以使用注解验证
@FunctionalInterface
interface Swim {
    public abstract void swiming();
}