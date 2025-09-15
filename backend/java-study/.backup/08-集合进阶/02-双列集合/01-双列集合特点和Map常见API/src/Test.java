/*
单双列集合的对比

单列集合, 每次添加元素, 一次添加一个元素
但是双列集合, 每次可以添加一对元素, 可以添加多对元素. 左边的就是 key (唯一), 右边的就是 value (值)

这里的键值对就不多说了, 不过, 一个键值对叫做一个 Entry 对象.

双列集合的特点:
1. 一次需要存储一对数据, 分别为key value
2. key 不能重复
 */

import java.util.HashMap;
import java.util.Map;

/*
另外, 有一些常见的API.
对于双列集合来说, Map就是顶层接口了, 下面的实现类都有它具有的方法.

所以, 让我们学习 Map 常见的API吧~
- put() 添加
- remove() 删除
- clear() 清空
- containsKey() key是否存在
- containsValue() value 是否存在
- isEmpyu() 是否为空
- size() 键值对个数
 */
public class Test {
    public static void main(String[] args) {
        // 首先 需要创建一个Map 但是Map是接口, 所以需要使用实现类
        // 这里用多态的形式创建对象 方便演示
        Map<String, String> map = new HashMap<>();

        // 首先 添加元素
        System.out.println(map.put("name", "Kaede Shimizu"));
        System.out.println(map.put("age", "18"));
        System.out.println(map.put("class", "2"));

        // 尝试覆盖添加
        System.out.println(map.put("name", "yyt"));

        // 如果需要打印集合, 直接sout即可
        // {name=Kaede Shimizu, class=2, age=18}
        System.out.println(map);

        // put 有一个特性
        // 不存在就是添加, 存在就是覆盖, 并且Put会返回覆盖的值.
        // 如果没有覆盖, 则返回null

        // ============================================ //

        // 对于remove, 移除对应的元素即可
        // 这里返回的值是删除的值的内容
        System.out.println(map.remove("name"));
        System.out.println(map.remove("age"));
        System.out.println(map);

        // ============================================ //

        // clear就是清空, 没啥说的 并且没有返回值
        map.clear();
        System.out.println(map);

        // ============================================ //

        // 判断包含有两种, 判断key是否存在和判断value是否存在
        map.put("name", "Kaede Shimizu");
        map.put("age", "18");
        map.put("class", "2");
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsKey("name2"));
        System.out.println(map.containsValue("18"));
        System.out.println(map.containsValue("Kaede"));

        // ============================================ //

        // 可以判断是否为空
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());

        // ============================================ //

        // 也可以查看集合大小
        System.out.println(map.size());
    }
}
