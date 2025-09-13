import java.util.ArrayList;

public class StudentUtil {
    // 实现工具类
    public static int getStudentsMaxAge(ArrayList<Student> students) {
        // 寻找数组中的最大值
        int max = -1;
        // 通过参照物，直接遍历这个集合即可 这里使用增强型循环 更加方便
        for (Student s : students) {
            if (s.getAge() > max) max = s.getAge();
        }
        return max;
    }
}
