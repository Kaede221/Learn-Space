import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection 的遍历方式有很多
 * - 迭代器遍历
 * - 增强for遍历
 * - Lambda 表达式遍历
 * 这里没有普通的for循环, 因为Collection下的Set是没有索引的, 无法使用索引遍历.
 * 这里从第一个开始看
 * <p>
 * 迭代器, 就是不依赖索引的一个遍历东西, Iterator
 * 使用 iterator() 方法获取迭代器
 * 使用 hasNext() 判断当前位置是否有元素
 * 使用 next() 获取当前位置的元素
 */
public class Test {
    public static void main(String[] args) {
        // 基础使用
        demo1();

        // 注意事项
        demo2();
    }

    private static void demo1() {
        // 定义一个简单的列表
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arr.add(i);

        // 获取一个迭代器
        Iterator<Integer> it = arr.iterator();

        // 直接遍历即可
        while (it.hasNext()) {
            // 一旦调用了next方法, 迭代器会自动往后走一步
            // 可以说, next方法做了两件事:
            // 1. 获取元素
            // 2. 移动指针
            System.out.println(it.next());
        }
    }

    private static void demo2() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arr.add(i);
        // 需要注意, 指针不会自动复位, 只能重新获取迭代器
        // 如果报错, 则代表迭代器没有元素了
        // 循环中只能使用一次next方法
        // 使用迭代器遍历的时候, 不能删除元素或者添加元素
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 尝试进行继续移动, 则报错
        /*
        Exception in thread "main" java.util.NoSuchElementException
	        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1052)
	        at Test.demo2(Test.java:59)
	        at Test.main(Test.java:23)
         */
        // it.next();

        // 循环中如果用多次next, 会出现未定义的错误.
        Iterator<Integer> it2 = arr.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
            it2.next();
        }
    }
}