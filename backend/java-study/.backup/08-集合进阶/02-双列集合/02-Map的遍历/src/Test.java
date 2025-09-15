import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/*
Map集合有三种遍历方式:
1. 通过key找value
2. 通过键值对进行遍历
3. lambda 表达式
 */
public class Test {
    public static void main(String[] args) {
        // 第一种遍历方式
        demo1();
        System.out.println();

        // 第二种
        demo2();
        System.out.println();

        // 第三种
        demo3();
        System.out.println();
    }

    private static void demo1() {
        // 创建 map 对象
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("LC", "YYT");
        map.put("Kaede", "Shimizu");
        map.put("Good", "Test");

        // 通过键找值的方法
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.printf("key is " + key);
            // 通过get 获取值
            System.out.println(", value is " + map.get(key));
        }
    }

    private static void demo2() {
        Map<String, String> map = new HashMap<>();
        map.put("LC", "YYT");
        map.put("Kaede", "Shimizu");
        map.put("Good", "Test");

        // 使用键值对进行遍历
        // 首先获取所有的键值对 可以使用ctrl + alt + v 快速生成前面的东西
        Set<Map.Entry<String, String>> entries = map.entrySet();

        // 遍历entries就行
        for (Map.Entry<String, String> entry : entries) {
            // 利用方法获取key和value
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static void demo3() {
        Map<String, String> map = new HashMap<>();
        map.put("LC", "YYT");
        map.put("Kaede", "Shimizu");
        map.put("Good", "Test");

        // 使用lambda遍历
        // 普通的话, 还是使用了一个函数式的类, 也因为这样, 可以使用lambda遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " -> " + value);
            }
        });

        // 简化后才是lambda哦
        System.out.println();
        map.forEach((String key, String value) -> System.out.println(key + " <-> " + value));
    }
}
