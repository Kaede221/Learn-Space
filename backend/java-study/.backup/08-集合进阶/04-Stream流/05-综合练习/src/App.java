import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        /*
        定义一个集合, 添加一些整数 1~10;
        过滤奇数, 留下偶数, 将结果保存起来
         */
        demo1();

        /*
        创建集合, 并且添加类似于 "Kaede, 18" 的字符串
        保留年龄大于等于24的人, 放入Map集合中, 姓名为key, 年龄为value
         */
        demo2();

        /*
        两个ArrayList集合, 分别储存了男演员和女演员的信息
        姓名和年龄用逗号隔开
        1. 男演员只要名字长度为3的, 前两个人
        2. 女演员只要姓杨的, 并且不要第一个
        3. 组合过滤后的男演员和女演员
        4. 封装成Actor对象
        5. 把所有演员保存在List集合中
         */
        demo3();
    }

    static void demo1() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        // 过滤 保留偶数, 就是 i % 2 == 0
        arr.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 不过我们需要保存这个结果 就是收集的操作
        List<Integer> collect = arr.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }

    static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        // 添加多个字符串
        Collections.addAll(list, "zhangSan, 23", "liSi, 20", "wangWum, 25", "liusi, 29");

        // 获取
        Map<String, String> collected = list.stream().filter(s ->
                // 需要切割
                Integer.parseInt(s.split(", ")[1]) >= 24
        ).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(", ")[0];
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(", ")[1];
            }
        }));

        // 可以改成lambda表达式, 直接输出就行
        System.out.println(collected);
    }

    static void demo3() {
        // 定义初始字符串
        ArrayList<String> man = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();
        Collections.addAll(man, "AAA,24", "BBB,23", "CCC,22", "DD,24", "EE,30", "FFF,27");
        Collections.addAll(women, "AA1,24", "杨B1,23", "CC1,22", "D1,24", "E1,30", "杨F1,27");

        // 第一步, 就是过滤男演员
        Stream<String> manStream = man.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);

        // 随后, 过滤女演员
        Stream<String> womenStream = women.stream().filter(s -> s.startsWith("杨")).skip(1);

        // 第三步, 合并两个流
        // 这里需要进行类型转换 所以使用Map
        Stream<Actor> actorStream = Stream.concat(manStream, womenStream).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                // 构建一个Actor出来即可
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);

                // 直接返回新的对象即可
                return new Actor(name, age);
            }
        });

        // 随后, 还需要进行保存
        List<Actor> collect = actorStream.toList();
        System.out.println(collect);
    }
}
