import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/*
HashMap 其实就是Map的最简单使用
几乎不需要学习新的方法, 学习一下特点就行:
1. HashMap是Map的实现类, 没有额外方法
2. 特点都是由key决定的: 无序, 不重复, 无索引
3. HashMap 和 HashSet 的底层一样, 都是哈希表实现的 (JDK8 后面还有红黑树)

- 如果 key 存储的是自定义对象, 则需要重写hashCode和equals方法
- 如果 value 存储的是自定义对象, 则不需要重写上述方法
 */
public class Test {
    public static void main(String[] args) {
        // 小练习1
        demo1();
        System.out.println();

        // 小练习2
        demo2();
        System.out.println();
    }

    private static void demo1() {
        /*
        需求
        key是学生 Student, value是籍贯 String
        储存三个键值对元素, 并遍历
        要求 同姓名, 同年龄被认为是同一个学生
         */
        HashMap<Student, String> map = new HashMap<>();

        // 添加学生
        map.put(new Student("Kaede", 18), "China");
        map.put(new Student("Kaede", 19), "China");
        map.put(new Student("Lc", 20), "USA");
        map.put(new Student("YYt", 19), "China");
        map.put(new Student("Jack", 18), "Japan");

        // 添加重复学生
        map.put(new Student("Kaede", 19), "China");
        map.put(new Student("Lc", 20), "USA");

        // 遍历集合
        map.forEach((Student s, String area) -> {
            System.out.println(s + " -> " + area);
        });
    }

    private static void demo2() {
        String[] arr = {"A", "B", "C", "D"};
        /*
        需求
        80个学生, 班长提供四个景点 ABCD, 每个学生选择一个, 统计最终哪个景点选择的人最多
         */
        HashMap<String, Integer> map = new HashMap<>();

        // 利用随机数模拟投票
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);

            // 使用hashSet的方法 判断添加即可
            if (map.containsKey(arr[index])) {
                map.put(arr[index], map.get(arr[index]) + 1);
            } else {
                map.put(arr[index], 0);
            }
        }

        // 找到最多人数的地方
        int maxVisited = 0;
        String maxType = "";
        Set<String> keys = map.keySet();

        for (String key : keys) {
            if (map.get(key) > maxVisited) {
                maxType = key;
                maxVisited = map.get(key);
            }
        }

        // 输出
        System.out.println("统计结果为 " + map);
        System.out.println("最多的地方为 " + maxType);
    }
}
