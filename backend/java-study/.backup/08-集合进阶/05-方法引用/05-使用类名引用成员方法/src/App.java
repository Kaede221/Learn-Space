import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/*
使用类名, 就是 类名::方法名
 */
public class App {
    public static void main(String[] args) {
        /*
        需求: 把一个字符串的所有小写字母转换为大写
         */
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "aaa", "bBc", "DDDdd", "absoLute");

        // 变成大写, 可以使用String的方法
        arr.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 无论如何, 可以继续简化
        // 这里就是直接使用类名::方法名了
        arr.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        // 但是toUpperCase没有参数 这里没有对应!
        // 这里有一些特定规则:
        /*
        1. 需要有函数式接口
        2. 被引用的方法必须已经存在
        3. 被引用的方法的形参需要和抽象方法的第二个形参到最后一个形参保持一致
        4. 需要满足需求

        3中, 第一个参数其实就是引用方法的调用者
        在stream流中, 第一个参数一般都是流的每个数据
        如果流的数据是String, 那么只能使用String的方法

        如果没有第二个参数, 则代表使用的是没有参数的函数
         */
        System.out.println();
    }
}
