import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
为什么我们要引用构造方法?
当然是用来创建对象.

格式: 类名::new
Student::new
 */
public class App {
    public static void main(String[] args) {
        // 需求 集合中储存字符串, 需要封装成Student对象, 并且收集到list集合中
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "AAA,15", "BBB,17", "CCC,19");

        // 从stream开始
        // 类型转换, 所以需要使用map
        List<Student> collect = arr.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                Integer age = Integer.parseInt(s.split(",")[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());

        // 直接输出
        System.out.println(collect);

        // 但是上面这个还是太复杂了.
        // 引用构造方法, 需要写一个另外的构造方法, 满足参数类型一致
        // 另外, 构造方法的话 不需要有返回值, 因为自己就是一个对象了
        List<Student> collected = arr.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collected);
    }
}
