public class HelloWorld {
    /*
    权限修饰符，就是控制一个成员能够被访问的范围的
    可以修饰变量 方法 构造方法以及内部类

    Java中有四种权限修饰符 分别如下
    - private 只能在一个类中使用
    - 空着不写 + 可以在同一个包中使用，也叫做默认或者缺省
    - protected + 不同包下的子类可以使用
    - public + 不同包下的无关类也可以使用

    作用范围从小到大

    一般来说，我们都使用的是private和public最常用
     */
    public static void main(String[] args) {
        // 对于私有 我们无法直接调用
        Student s = new Student("Kaede", 18);

        // 但是public的就可以了 剩下的用的少
        s.eat();
    }
}
