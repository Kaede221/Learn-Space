public class Student extends Person {
    // 子类中，有一个方法，可以访问父类的无参构造
    public Student() {
        // 上面不能写任何东西 否则报错
        super();
        // 但是后面可以写
        System.out.println("子类的无参构造");
    }

    // 如果非要实现带参构造 就需要手动写出来
    // 这就是继承的构造方法了
    // 其实原理是一样的，就是调用父类的带参构造 还是super的使用
    public Student(String name, int age) {
        super(name, age);
    }
}
