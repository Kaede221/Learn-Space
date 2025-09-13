import java.util.ArrayList;

public class HelloWorld {
    /*
    其实 被static修饰的成员方法就是静态方法
    也是可以通过类名调用的

    什么是工具类呢？
    工具类，就是帮我们做一些事情，但是不描述任何事物的事情
    比如说，有一个工具类，用来获取集合中学生最大的年龄是多少
     */
    public static void main(String[] args) {
        // 构建学生集合
        String[] names = {"Kaede", "YYt", "Lc"};
        int[] ages = {18, 17, 16};
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student s = new Student(names[i], ages[i]);
            students.add(s);
        }

        // 使用工具类获取最大年龄
        System.out.println("集合中的最大年龄为：" + StudentUtil.getStudentsMaxAge(students));
    }
}
