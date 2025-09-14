import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * lambda 是 JDK8+ 的新技术, 提供了一种更简单的方式
 */
public class Test {
    public static void main(String[] args) {
        // 基础使用
        demo1();
    }

    private static void demo1() {
        // 定义集合 添加元素
        Collection<String> arr = new ArrayList<>();
        arr.add("Kaede");
        arr.add("Lc");
        arr.add("YYt");

        // 使用匿名内部类, 可以下面这么写
        arr.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("---");

        // 转化为lambda就会简单很多了
        arr.forEach((String s) -> System.out.println(s));
    }
}