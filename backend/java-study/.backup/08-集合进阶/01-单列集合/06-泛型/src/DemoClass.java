/**
 * 如果一个类中, 某个变量的数据类型不确定, 可以定义具有泛型的类
 */
public class DemoClass<E> {
    // 这里的E 就是一个类型, 也可以写作其他的东西, T 或者 E 或者其他都行.
    // 提供一个方法
    public void func(E e) {
        // 这里的e 就是指定类型的东西了
        // 类型不对就会报错
        System.out.println(e);
    }
}
