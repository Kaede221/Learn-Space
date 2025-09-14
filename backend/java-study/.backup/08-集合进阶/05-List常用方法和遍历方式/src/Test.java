import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List 集合继承了Colleaction的所有方法
 * 由于有索引, 所以多了很多索引操作的方法
 * add(index, E) 某个位置插入元素
 * remove(int index) 移除某个索引的元素
 * set(index, E) 修改某个索引的元素
 * get(index) 获取某个索引的元素
 * <p>
 * 这么看就是多了增删改查.
 */
public class Test {
    public static void main(String[] args) {
        // 基础使用
        demo1();

        // 遍历方式
        demo2();
    }

    private static void demo1() {
        // 创建一个List集合
        List<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        System.out.println(arr);

        // 指定位置添加元素
        // 原来的元素往后走一位
        arr.add(1, "qqq");
        System.out.println(arr);

        // 删除指定位置的元素
        // 返回被删除的元素
        String remove = arr.remove(2);
        System.out.println("被删除的是" + remove + ", " + arr);

        /*
        这里注意, 如果是Integer类型, 则会出现冲突问题, 不知道是索引还是元素
        不过有一个规律: 如果出现冲突问题, 则优先调用实参和形参类型一致的方法

        由于int到Integer需要转换, 但是索引就不需要, 所以优先调用索引的那个方法
        如果希望调用另外一个, 则需要包装一下.
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("---");
        System.out.println(list);

        // 调用索引的移除数据
        int remo = list.remove(1);
        System.out.println("删除的是 " + remo + ", " + list);

        // 手动装箱, 删除元素
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        // set 就是修改, 没什么说的
        list.set(0, 999);
        System.out.println(list);

        // get就是直接获取数据, 等效于使用括号
        System.out.println(list.get(1));
        // System.out.println(list.get(2)); 报错, 不存在元素
    }

    private static void demo2() {
        System.out.println("---");
        List<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");

        // 所有的COllection方法都能用, 除此之外, 还有别的两种方式:
        // 列表迭代器和普通for循环遍历.

        // 1. 普通for循环
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // 2. 列表迭代器
        // 这里提供了add和remove方法, 迭代的时候修改数组
        // 另外还提供了previos和nextPrevios, 就是前一个和是否有前一个, 反过来next
        // 这样就可以往前走元素了(存在局限性)
        System.out.println("---");
        ListIterator<String> it2 = arr.listIterator();
        while (it2.hasNext()) {
            // 可以进行判断 如果是某个元素, 添加元素
            String s = it2.next();
            if (s.equals("bbb")) {
                it2.add("qqq");
            }
        }
        System.out.println(arr);
    }
}