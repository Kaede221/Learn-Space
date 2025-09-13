/**
 * 类和对象
 * <p>
 * 什么是面向对象
 * 世间任何东西，都可以被抽象为一个对象，只要这个东西存在属性，就一定可以
 * <p>
 * 类 就是一个设计图，是一切的根本
 * 类存在一些东西：
 * 成员变量，成员方法，构造器，代码块，内部类
 */

public class HelloWorld {
    /*
    注意事项
    用来描述一类事物的类 叫做Javabean类 在这种类里面，是没有main方法的
    而存在main方法的类，叫做测试类，我们可以在测试类中，创建对应的对象，并且进行赋值，调用

    同时，一个文件中，只能有一个public修饰的类，并且这个类名称必须和文件名称一摸一样
    实际开发中，一个文件只写一个类

    类中，成员属性是可以不初始化的，因为这个类本身就不是一个特定的东西，是需要后期设定的；另外也会默认初始化，问题不大
     */
    public static void main(String[] args) {
        // 每个类都是一个单独的文件，这就是为什么Java编译东西的结果都是.class文件
        // 我们在另外一个文件中定义了类，那么就可以在这里进行实例化了
        Phone p = new Phone();

        // 可以通过对象名.属性 或者方法来使用它
        p.brand = "X Mi";
        p.price = 1999;

        // 使用也是可以的
        System.out.println(p.brand + " " + p.price);

        // 调用这个手机的相关方法
        p.call();
        p.playGames();

        // 同理，可以实例化另外一个对象
        Phone p2 = new Phone();
        p2.brand = "Apple";
        p2.price = 9999;
        System.out.println(p2.brand + " " + p2.price);

        // 学生类也是一样的，直接使用即可
        Student s = new Student();
        s.name = "11";
        s.age = 18;
        s.eat();
        s.sleep();
    }
}
