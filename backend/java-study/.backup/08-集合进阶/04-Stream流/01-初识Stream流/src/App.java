import java.util.ArrayList;

/*
Stream流
 */
public class App {
    public static void main(String[] args) {
        /*
        从一个案例开始
        创建一个集合, 存储多个字符串元素
        随后, 把所有以A开头的元素放到一个新的集合
        再把所有A开头的, 长度为5的元素放在一个新的集合
        最后, 打印最终的集合
         */
        demo1();
    }

    static void demo1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Aside");
        list1.add("Good");
        list1.add("Applicate");
        list1.add("Approve");
        list1.add("Ais");
        list1.add("Kaede");

        // 首先, 完成第一步
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("A")) {
                list2.add(s);
            }
        }

        System.out.println("A 开头的单词 " + list2);
        // 然后, 第二步 判断长度
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 5) {
                list3.add(s);
            }
        }
        System.out.println("长度为5 " + list3);

        // == == == == == //
        // 无论如何, 这都太麻烦了
        // 所以, 我们要使用stream流, 只需要下面这 一行(展开了四行) 就足够了.
        list1.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.length() == 5)
                .forEach(s -> System.out.print(s + " "));
    }
}
