import java.util.LinkedHashMap;

/*
对于 Linked Hash Map 会保证顺序是一致的, 别的和普通的Map一样
它是用哈希表+双向链表实现的, 这就保证了存取顺序的一致性.
 */
public class Test {
    public static void main(String[] args) {
        // 基础使用
        demo1();
    }

    static void demo1() {
        // 创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // 添加元素
        lhm.put("a", 111);
        lhm.put("b", 222);
        lhm.put("c", 333);
        lhm.put("d", 444);

        // 重复添加的key会覆盖
        lhm.put("a", 666);

        // 打印集合
        // 可以看到顺序是和插入的顺序一样的
        System.out.println(lhm);
    }
}
