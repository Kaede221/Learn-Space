import java.util.ArrayList;

/**
 * ArrayList 包装类
 */

public class HelloWorld {
    /*
    因为集合不能直接放入一些基本数据类型
    所以需要包装
    对于基本数据类型，有一个规律：byte的包装类为Byte short为Short
    但是有两个特殊的  Integer 和 Character 其他的都是大写首字母即可
     */
    public static void main(String[] args) {
        // 比如，我现在要创建一个整数集合
        ArrayList<Integer> list = new ArrayList<>();

        // 对于整数来说，直接用就好，默认会存在自动转化关系
        list.add(1);
        list.add(11);
        list.add(123);

        // 输出看看
        System.out.println(list);

        // 对于字符类型来说，也是一样的
        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add('K');
        characterArrayList.add('S');
        characterArrayList.add('Y');
        characterArrayList.add('Y');
        characterArrayList.add('T');

        // 输出之类的操作都是一样的
        System.out.println(characterArrayList);
    }
}
