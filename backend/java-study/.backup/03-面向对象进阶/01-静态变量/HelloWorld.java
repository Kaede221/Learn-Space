import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        // 根据学生列表，创建一些学生出来
        String[] names = {"Kaede", "YYt", "Lc"};
        int[] ages = {19, 18, 18};
        int[] genders = {1, 2, 1};
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student s = new Student(names[i], ages[i], genders[i]);
            students.add(s);
        }

        // 对于一个class的多个实例化来说，我们可能希望有一些公用的属性
        // 就是所有的对象，共享同一个值 这个时候就需要静态属性了
        // 加了一个i属性，我们可以直接输出看看
        System.out.println(students.get(0).i);
        // 我们修改一下
        students.get(0).i = 2;
        // 然后调用另外一个对象看看
        System.out.println(students.get(1).i);
        // 成功修改了！

        // 同时，由于是静态的了，所以我们可以直接使用类名来调用，而不是使用实例化的对象进行调用了
        System.out.println(Student.i);

        // 这就是静态变量了，所有对象公用同一个值
        /*
        内存中，是如何实现的呢？
        其实这个静态的储存的就是一个指针了，这个指针是不会变的
        所以，调用的时候，这个东西其实不属于一个对象，而是直接属于类，使用的时候推荐直接使用类名来调用
         */
    }
}
