public class Student extends Person {// 我们继承这个抽象类
    // 啥都不写直接报错 要实现所有的抽象方法

    @Override
    public void work() {
        System.out.println("学生在学习");
    }

    // 构造函数，直接使用父类的即可
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
