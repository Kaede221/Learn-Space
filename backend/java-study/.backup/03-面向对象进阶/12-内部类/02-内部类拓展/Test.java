public class Test {
    /*
    内部类其实分为四种：成员，静态，局部，匿名
    我们要写，一般就是写匿名内部类，其他的我们一般不写 只会看到而已
     */

    /*
    成员内部类 是写在成员位置的，属于外部类的成员 比如上一个Phone的Core 内部类
    成员内部类，和成员是平起平坐的，所以也可以用到对应的修饰符 规则一样 不变
     */

    /*
    静态内部类 就是只能访问外部类的静态变量和静态方法的类，如果需要访问非静态的则需要创建对应的对象
    直接在class前面给一个static即可
     */

    /*
    局部内部类，就是在方法里面定义一个类出来
    本质上就是你定义了一个临时的类，这个类和变量是一样的，可以访问外部的属性之类的东西
     */

    private static void test() {
        // 这是一个方法 我可以在这里定义一个类 这个类就是局部内部类了
        class Inner {
            public static void show() {
                System.out.println("局部内布类的方法调用咯");
            }
        }

        Inner.show();
    }

    public static void main(String[] args) {
        // 使用静态方法 是需要一直点的，不需要实例化
        Outer.Inner.show();

        // 调用有局部内部类的方法
        test();
    }
}
