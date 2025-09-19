import java.util.Comparator;
import java.util.TreeMap;

/*
TreeMap 是最后一个Map集合, 剩下的有IO方法, 这里不进行学习
TreeMap 底层也是红黑树, 不重复, 无索引, 可排序
这里的排序是可以对key进行排序.
默认的排序方式是按照key的从小到大, 也可以自定义规则

这里的排序可以实现Comparable接口, 或者传递对应的对象
 */
public class Test {
    public static void main(String[] args) {
        /*
        需求1
        key: 整数, 表示ID
        value: 字符串, 表示商品名称
        要求: 按照id的升序排列和按照id的降序排列
         */
        demo1();

        /*
        需求2
        key: 学生对象
        value: 籍贯
        要求: 按照学生年龄排序, 年龄一样按照姓名的字母排列, 否则视为一个人
         */
        demo2();

        /*
        需求3
        统计一个字符串中每个字符出现的次数, 按照一定格式进行输出
         */
        demo3();
    }

    static void demo1() {
        TreeMap<Integer, String> mp = new TreeMap<>();

        // 插入数据
        mp.put(1, "Kaede");
        mp.put(3, "Shimizu");
        mp.put(5, "Lc");
        mp.put(4, "YYt");
        mp.put(2, "Good");

        // 默认是升序排列 看看
        System.out.println(mp);

        // 需要一开始进行构建
        TreeMap<Integer, String> mp2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        mp2.put(1, "Kaede");
        mp2.put(3, "Shimizu");
        mp2.put(5, "Lc");
        mp2.put(4, "YYt");
        mp2.put(2, "Good");

        System.out.println(mp2);
    }

    static void demo2() {
        // 添加自定义对象作为key
        TreeMap<Student, String> mp = new TreeMap<>();

        // 添加元素
        mp.put(new Student("Kaede", 18), "ChangSha");
        mp.put(new Student("YYT", 18), "ChangSha");
        mp.put(new Student("Lc", 19), "ChangSha");
        mp.put(new Student("ZH", 20), "ChangSha");
        mp.put(new Student("YYt", 19), "Zhongguo");

        System.out.println(mp);
    }

    static void demo3() {
        String s = "aabbbddddddccbbbbbddddddddaaaaaa";

        // 创建集合
        TreeMap<Character, Integer> t = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            // 判断是否存在 存在加1 不存在设置为1
            if (t.containsKey(s.charAt(i))) {
                t.put(s.charAt(i), t.get(s.charAt(i)) + 1);
            } else {
                t.put(s.charAt(i), 1);
            }
        }

        // 输出结果
        System.out.println(t);
    }
}
