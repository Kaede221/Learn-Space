public class HelloWorld {
    public static void main(String[] args) {
        // final 其实就是一个静态修饰符
        // 对于修饰的变量 是不能改变的 比如下面这样子
        final int a = 10;
        // a = 20;
        System.out.println(a);

        // 但是对于引用数据类型，则是地址不可改变 但是里面的值是可以改变的
        final Student s = new Student();
        // s = new Student();
    }
}

class Student {

}