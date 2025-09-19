import java.util.ArrayList;
import java.util.Collections;

/*
这是一个Java工具类, 提供了一些集合的常用方法

常用的API有, 批量添加元素, 还有打乱List集合元素的顺序
另外, 还有sort, copy, fill 等等各种方法, 需要用的时候都可以学习使用
 */
public class Test {
    public static void main(String[] args) {
        // 批量添加元素
        ArrayList<String> list1 = new ArrayList<>();

        // 批量添加
        Collections.addAll(list1, "Kaede", "Shimizu", "Lc", "YYt", "Goooooood");

        // 直接输出看看
        System.out.println(list1);

        // 也可以打乱数组, 实现洗牌的效果
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}