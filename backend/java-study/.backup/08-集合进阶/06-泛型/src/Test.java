import java.util.ArrayList;

/**
 * 泛型是JDK5引入的特性, 可以在编译的时候约束数据类型, 进行检查
 * 泛型只能使用引用数据类型
 * <p>
 * Java中的泛型其实是一个伪泛型
 * 就算类型是String, 其实也仅仅是判断了一下, 保存还是按照Object保存的 (这也是为什么不能使用基本数据类型)
 * 保存为字节码文件的时候, 泛型就没了, 这叫做 "泛型的擦除"
 * <p>
 * 这是为了兼容, 因为老版本没有泛型, 但是不能直接改源码, 太复杂了.
 * <p>
 * 我们是可以自己写泛型的
 * 如果泛型写在类后面, 就是泛型类 DemoClass
 * 如果写在方法上面, 就是泛型方法 DemoFunc
 * 如果写在接口后面, 就是泛型接口 DemoInterface
 *
 * 另外需要记住, 泛型不具备继承性, 但是数据具备继承性
 * 泛型的通配符就是 ?, 这个这里不多说了
 */
public class Test {
    public static void main(String[] args) {
        // 基础使用
        demo1();

        // 泛型类
        demo2();

        // 泛型方法
        demo3();

        // 泛型接口
        demo4();
    }

    private static void demo1() {
        // 没有泛型的时候, 我们按照下面这样添加数据
        ArrayList list = new ArrayList();

        // 这个时候可以添加任意的数据类型, 而不会报错
        list.add(123);
        list.add("Good");
        list.add(true);

        System.out.println(list);
        // 显然, 我们不希望这样, 我们没法正常使用其中元素的某个方法

        // 于是, 我们需要使用泛型进行规范.
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(11);
        System.out.println(arr);
    }

    private static void demo2() {
        // 调用泛型类
        DemoClass<String> demoClass = new DemoClass<>();
        demoClass.func("Hello World");

        // 因为使用泛型固定了类型, 所以不能这样, 会报错
        // demoClass.func(123);
    }

    private static void demo3() {
        // 提供一个数组
        ArrayList<String> arr = new ArrayList<>();

        // 调用泛型类的方法
        DemoFunc.add(arr, "Good");
        System.out.println(arr);
    }

    private static void demo4() {
        DemoInterface list = new DemoInterface();
        // 这里就规定好类型了
        list.add("Good");
        // list.add(1); 报错, 类型不符合要求
    }
}
