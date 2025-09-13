public class Student {
    // 可以定义一个学生类
    // 学生有一些属性
    String name;
    int age;

    // 顺便实现一些方法
    public void sleep() {
        System.out.println(this.name + "在睡觉");
    }

    public void eat() {
        System.out.println(this.name + "的年龄为" + this.age);
    }
}
