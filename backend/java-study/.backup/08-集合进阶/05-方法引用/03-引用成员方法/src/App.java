import java.util.ArrayList;
import java.util.Collections;

/*
成员方法差不多, 使用 对象::成员方法即可
1. 如果引用其他类: 其他类对象::方法名
2. 本类: this::方法名
3. 父类: super::方法名
 */
public class App {
    public static void main(String[] args) {
        // 假设有需求, 过滤一个集合, 找到长度为3并且以A开头的内容
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "AA", "AAA", "ABC", "DDD", "FAA", "C");

        // 方法是成员方法 需要先创建对象 然后调用
        StringOperation s = new StringOperation();
        list.stream().filter(s::stringJudge).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 对于本类, 因为这里是一个静态方法, 静态方法中没有this对象, 所以直接用会报错
        // 非静态方法中才能调用; 否则需要创建本类的对象.
    }
}
