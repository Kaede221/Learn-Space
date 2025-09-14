import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for, 就是一个迭代器, 底层就是使用迭代器实现的 (JDK5+)
 * 使用它可以更加方便的遍历.
 * 所有的单列集合和数组都可以使用增强for遍历, 其他的不行.
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

        // 使用增强for遍历
        // IDEA快捷键: 集合名字.for
        for (String s : arr) {
            // 这里的s就是一个变量, 直接输出即可
            System.out.println(s);

            // 这里需要注意一下, 如果修改s的话, 不会修改原有数据
            // 因为s就是一个临时变量, 不储存原有的地址
            s = "test";
        }
        System.out.println(arr);
    }
}