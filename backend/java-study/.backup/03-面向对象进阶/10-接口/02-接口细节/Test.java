public class Test {
    /*
    后续的所有测试类 都按照Test命名
     */

    /*
    接口中成员的特点
    - 成员变量
    - - 只能是常量
    - - 默认的修饰符为public static final

    - 构造方法
    - - 没有

    - 成员方法
    - - 只能是抽象方法（JDK7以前）
    - - 默认修饰符为public abstract
    - - JDK8中 接口中可以定义有方法体的方法了
    - - JDK9中 接口中可以定义私有方法
     */
    public static void main(String[] args) {
        // 我们可以访问接口的变量 这代表是public的
        // 同时也代表了这个是静态的东西
        System.out.println(Inter.a);

        // 我们无法修改 表示这个东西是final的
        // Inter.a = 20;
    }

    /*
    类和类之间：继承关系，并且只能是单继承，不过可以多层嵌套
    类和接口之间：可以单实现，也可以多实现，并且可以在继承的时候实现多个接口
    接口和接口之间：可以单继承，也可以多继承
     */
}
