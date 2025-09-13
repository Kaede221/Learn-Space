import java.util.ArrayList;

/**
 * 添加自定义对象并遍历
 * 注意，这里需要使用到Student类 请一起复制过来
 */

public class HelloWorld {
    public static void main(String[] args) {
        // 这里首先实现自定义类型 也就是学生
        ArrayList<Student> list = new ArrayList<>();

        // 创建学生对象 这里为了方便，直接使用数组了
        String[] names = {"Kaede", "YYT", "Lc", "Perfect"};
        int[] ages = {18, 18, 18, 1314};

        // 遍历 构建学生对象
        for (int i = 0; i < names.length; i++) {
            Student s = new Student(names[i], ages[i]);
            // 放入集合中
            list.add(s);
        }

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
