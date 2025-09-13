public class HelloWorld {
    /*
    多态 就是多种形态 同种对象，表现得不同形式

    比如，之前我们可以用Student s = new Student() 创建学生对象
    但是，我们现在 可以把学生，给一个人了 Person p = new Student()

    假设现在有三个角色，老师，学生和管理员，但是只有一个注册方法，那么应该传入什么类型？
    这个时候，就需要用到多态了，直接传入一个共有的父类即可

    另外，如果传入的东西，直接调用一个方法，而且这个方法子类进行了重写，则会直接调用传入类型的方法！

    下面会实现这个情况
     */

    // 实现多态方法
    public static void showInfo(Person p) {
        p.show();
    }

    // 测试部分
    public static void main(String[] args) {
        // 创建学生和老师的对象
        Student s = new Student(20241050, "Kaede");
        Teacher t = new Teacher(20241049, "YYt");

        // 调用多态方法
        showInfo(s);
        showInfo(t);
    }
}
