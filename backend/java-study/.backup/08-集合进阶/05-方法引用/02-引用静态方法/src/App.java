import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/*
格式: Integer::parseInt
其实就是用::代替.的作用
 */
public class App {
    public static void main(String[] args) {
        // 小练习 有一个字符串数字的数组, 需要转换为数字的数组
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 直接遍历, 普通的方法如下
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 但是还是比较麻烦, 我们试试使用方法引用
        // 方法, 其实Integer已经提供了, 我们可以直接使用Integer的方法
        // 这就是方法引用了, 引用一个静态方法
        list.stream().map(Integer::parseInt).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
