import java.util.ArrayList;

/*
假如有一个工具方法的话
那么就可以使用泛型类了
 */
public class DemoFunc {
    private DemoFunc() {
    }

    // 定义泛型方法, 需要写在最后一个修饰符后面
    public static <E> void add(ArrayList<E> list, E element) {
        list.add(element);
    }
}
