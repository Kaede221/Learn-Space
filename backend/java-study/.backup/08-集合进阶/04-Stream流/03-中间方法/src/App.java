import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
中间方法有下面这些:
1. filter 过滤
2. limit 获取前几个元素
3. skip 跳过前几个元素
4. distinct 元素去重 基于 hashCode 和 equals 方法, 如果是自定义对象, 需要重写方法
5. concat 合并a和b为一个流
6. map 转换流中的数据类型
 */
public class App {
    public static void main(String[] args) {
        // 准备一个数组
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 7, 9, 2, 4, 6, 8, 10);

        // filter
        list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                // 这里进行筛选集合, 返回一个bool类型的值 false就是不符合的
                return integer >= 5;
            }
        }).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // limit 获取前几个数据
        list.stream().limit(3).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // skip 跳过前几个数据
        list.stream().skip(3).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // concat 合并两个流
        // 合并的时候, 默认合并到最后面
        Stream.concat(list.stream(), list.stream()).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // map 转换流中的原有的数据类型
        // 第一个是原有类型, 第二个是目标类型
        list.stream().map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "Number is " + integer;
            }
        }).forEach(s -> System.out.println(s));

        // 或者直接lambda表达式
        list.stream().map(i -> "Good Num " + i).forEach(s -> System.out.println(s));
    }
}
