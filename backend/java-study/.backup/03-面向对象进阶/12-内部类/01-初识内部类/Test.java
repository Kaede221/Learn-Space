public class Test {
    /*
    内部类 是类的五大成员之一
    五大成员是：属性，方法，构造方法，代码块和内部类
    内部类 就是一个类里面，定义一个其他的类
    这里就实现一个手机的内部类格式
     */

    /*
    其实Java中的迭代器就是ArrayList的一个内部类
    可以理解为，有了ArrayList，才有迭代器，集合都没有，哪来的迭代器
     */
    public static void main(String[] args) {
        // 使用的时候，差不多
        Phone p = new Phone("XMi", 1999);

        // 使用内部类
        p.show();
    }
}
