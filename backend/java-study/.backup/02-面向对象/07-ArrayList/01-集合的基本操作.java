import java.util.ArrayList;

/**
 * ArrayList
 */

public class HelloWorld {
    /*
    数组的长度是固定的，但是有的时候，我们需要动态变化
    这个时候，就要使用集合 Array List了
    长度会自动改变且方便使用 自动扩容

    并且，数组可以储存基本数据类型，也可以储存引用数据类型
    但是，集合不能直接储存基本数据类型 如果非要，必须实现包装类
     */
    private static void f01() {
        // 创建集合对象
        // 这里需要指定类型，不能直接啥都没有
        // 这个指定的方式就叫做泛型 后面有一个尖括号，表示里面东西的类型是什么
        // 如果写int会报错 但是String可以
        // 注意 后面的尖括号必须有，可以空，但是得有
        ArrayList<String> list = new ArrayList<>();

        // 直接输出看看 [] 直接就是一个空的列表
        // 打印这个东西，输出的不是地址，而是里面储存的东西的内容是什么
        System.out.println(list);
        // 可以看看长度
        System.out.println(list.size());

        // 容器，一般都是四个方法 增删改查
        // 直接在这里展示对应的使用方法
        list.add("Kaede");
        list.add("yyt");
        list.add("lc");
        // 对于add方法，永远返回true 所以返回值一般不管
        System.out.println(list);

        // 删除元素一样，直接删除东西即可
        // 如果删除成功，返回true 否则false
        System.out.println(list.remove("Kaede"));
        System.out.println(list);
        // 如果像删除的元素不存在 就会false
        System.out.println(list.remove("Kaede"));

        // 当然，也可以通过索引进行删除，返回的就是被删除的元素是什么了
        System.out.println(list.remove(1));
        System.out.println(list);

        // 修改 传入的是一个索引 直接覆盖原来对应位置的值
        // 同时，这个方法会返回被覆盖的元素是什么
        System.out.println(list.set(0, "LC&YYT"));
        System.out.println(list);

        // 查询元素 就是返回对应index的元素
        System.out.println(list.get(0));

        // 遍历元素是一样的，因为有size 知道总共有多少了 遍历就很简单咯
        list.add("YYt");
        list.add("Lc");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        // 集合的基本使用
        f01();
    }
}
