public class HelloWorld {
    /*
    什么是接口
    可以这么理解，青蛙，狗狗，兔子都可以继承于动物类
    但是青蛙，狗狗会游泳，兔子不会
    这里如果我们给狗狗和青蛙单独写，就有点多余了

    这里就可以使用接口了 直接表示这个接口，可以游泳，这个时候让狗狗和青蛙能够使用接口，就可以了！
    接口，表示的不是一类事物，而是一种行为的抽象
     */

    /*
    如何定义接口
    其实就是把class换成interface
    接口是不能实例化的，接口和类之间是实现关系 在类后面，使用一个新的关键字表示 implements 接口名
    同时，接口可以实现多个，用逗号分开即可
    另外，也可以在继承一个类的时候，实现接口 先继承，后实现 extends + implements
     */

    /*
    演示 实现青蛙 狗狗 和兔子
     */
    public static void main(String[] args) {
        // 创建对应的对象即可
        Frog f = new Frog("小蛙", 1);
        System.out.println(f.getName() + " - " + f.getAge());
        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小白", 2);
        System.out.println(r.getName() + " - " + r.getAge());
        r.eat();

        Dog d = new Dog("小黑", 3);
        System.out.println(d.getName() + " - " + d.getAge());
        d.eat();
        d.swim();
    }
}
