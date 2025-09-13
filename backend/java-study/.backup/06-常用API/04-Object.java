import java.util.ArrayList;
import java.util.Objects;

public class Test {
    /*
    Object(s) 顶级父类
    所有的类都直接或者间接的继承自这个类

    Object没有成员变量，自然没有带参的构造方法
    Object有11个成员方法 最常见的就三个 后面的再说

    toString 就是转换为字符串，对象可以重写对应的方法
     */
    public static void main(String[] args) {
        // 比如创建一个ArrayList对象
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        // 就可以使用toString了 官方实现了这个方法
        System.out.println(arrayList.toString());

        // 普通的Object也是有的
        Object obj = new Object();
        // java.lang.Object@723279cf
        // 至少可以看出来这个类是什么东西，在哪里定义
        System.out.println(obj.toString());

        // 对于打印来说，其实out是一个静态变量 点后就是一个对象了
        // 调用的就是输出对象的一个方法而已

        // 另外，对象还有一个方法 equals 用来判断两个对象是否相同 这个方法也是可以重写的
        Student s1 = new Student(16, "A");
        Student s2 = new Student(15, "A");
        System.out.println(s1.equals(s2));

        // 最重要的 对象克隆
        // 可以把A对象的数据，完全拷贝给B对象
        // 这个方法也是直接存在的 使用就好
        Student s3 = new Student(10, "A");

        /*
        这里需要注意一下深克隆还是浅克隆
        深克隆 就是基本数据类型的数据都是拷贝，但是字符串是复用的，引用数据类型则是重新创建新的数据
        浅克隆 就是所有的数据，都是直接拷贝的，不会创建新的东西出来
         */

        // 另外可以判断一个对象是否为空
        System.out.println(Objects.isNull(s3));
    }
}

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }
}