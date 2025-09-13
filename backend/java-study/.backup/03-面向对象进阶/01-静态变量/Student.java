public class Student {
    // 实现一个最简单的学生类
    private String name;
    private int age;
    private int gender;

    // 实现一个静态的属性
    public static int i;

    public Student() {
    }

    public Student(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    // 行为
    public void study() {
        System.out.println(this.name + "正在学习");
    }

    // 实现打印方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
