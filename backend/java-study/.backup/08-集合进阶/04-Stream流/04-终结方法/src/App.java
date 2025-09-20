import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
终结方法 常见的有下面这些:
1. forEach 就是遍历
2. count 统计
3. toArray 收集流中的数据, 放在数组中
4. collect 收集流中的数据, 放到集合中
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 7, 9, 2, 4, 6, 8, 0);

        // 遍历, 就是遍历, 没啥说的
        list.stream().forEach(i -> System.out.print(i * 2 + " "));
        System.out.println();

        // 可以获取一个列表
        // 但是这样的话, 只能使用 Object
        // Object[] list2 = list.stream().filter(i -> i > 5).toArray();
        // System.out.println(list2.toString());

        // 如果我们需要指定类型, 则需要下面这样写
        String[] list3 = list.stream().map(i -> "good " + i).toArray(value -> new String[value]);

        System.out.println(Arrays.toString(list3));

        // collect 就是保存在集合, 使用差不多
    }
}
