import java.util.List;
import java.util.Set;

/*
不可变集合 就是不可以修改的集合
这里不可修改有两个方面, 长度和内容都不能改
类似于Python的元组, 不可修改

它有一个固定的写法:
static <E> List<E> of(E...elements)
static <E> Set<E> of(E...elements)
static <K, V> Map<K, V> of(E...elements)
 */
public class App {
    public static void main(String[] args) {
        // 创建一个不可变List
        List<String> list = List.of("Kaede", "Shimizu", "YYt", "Lc");

        // 仅仅可以获取 不能修改
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        // 修改报错
        // list.set(0, "Good");

        // 对于set来说, 不能有重复元素
        Set<Integer> set = Set.of(1, 3, 5, 7, 9);
        System.out.println(set);

        // 对于Map来说, 元素不能重复, 键值对数量最多10个 如果需要更多, 则需要使用 ofEntries 方法
    }
}
