import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合分为单列集合和双列集合
 * 单列就是添加数据是一个一个添加, 双列就是一对一对的添加.
 * 先学习单列集合 这里分为下面这个结构:
 * Collection*
 * - List*
 * - - ArrayList
 * - - LinkedList
 * - - Vector(淘汰了)
 * - Set*
 * - - HashSet
 * - - - LinkedHashSet
 * - - TreeSet
 * 带 * 的是接口, 其他的是类.
 * List 系列中, 规律是: 有序 (存储和获取的顺序一致), 可重复, 有索引
 * Set 系列中, 规律是: 无序, 不重复, 不可索引; 相当于和List相反了
 * <p>
 * 这里, 先学习Colleaction, 这是所有单列集合都可以使用的.
 * 常见方法:
 * - add()
 * - clear()
 * - remove()
 * - contains()
 * - isEmpty()
 * - size()
 */
public class Test {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        // Collection 是接口, 我们不能直接创建对象, 只能创建一个实现类的对象
        Collection<String> coll = new ArrayList<>();

        // 调用添加方法
        // 这里会返回一个值, true就是成功, false就是失败.
        // 对于单列集合, 永远返回true
        // 对于双列集合, 如果元素不存在, 返回true, 但是如果元素存在了, 则返回false
        coll.add("LC");
        System.out.println(coll);

        // 可以清空集合
        coll.clear();
        System.out.println(coll);

        coll.add("Test");
        coll.add("Me");
        // 可以使用remove 传入的是要删除的东西, 不是索引
        // 同理, 返回的是bool, true则删除成功, false则删除失败
        coll.remove("Test");
        System.out.println(coll);

        // contains 判断是否包含元素
        /*
        底层代码如下:
        public boolean contains(Object o) {
            return indexOf(o) >= 0;
        }

        这里的indexOf还是for循环, 依次调用.
        如果存储的是自定义对象, 则需要重写equals方法
         */
        System.out.println(coll.contains("aaa"));
        System.out.println(coll.contains("Me"));
    }

    private static void demo2() {
        // 自定义类型的contains判断
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("kaede", 19);
        Student s2 = new Student("yyt", 18);
        Student s3 = new Student("lc", 20);

        // 添加元素到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        // 判断某个学生对象是否包含
        Student s4 = new Student("kaede", 19);
        // 如果啥都不写, 就是false
        // 需要覆盖equals方法
        System.out.println(coll.contains(s4));

        // 判断是否清空 就是isEmpty了
        System.out.println("是否为空: " + coll.isEmpty());
        System.out.println("大小为: " + coll.size());
        coll.clear();
        System.out.println("是否为空: " + coll.isEmpty());
        System.out.println("大小为: " + coll.size());
    }
}