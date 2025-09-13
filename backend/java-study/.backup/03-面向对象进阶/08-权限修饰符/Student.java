public class Student {
    // 这里的private 就是私有权限修饰符
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    // 实现一些 public的内容
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
}
