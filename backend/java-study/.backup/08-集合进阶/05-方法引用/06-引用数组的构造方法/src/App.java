import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/*
和普通的构造方法差不多, 不过类似于下面
数据类型[]::new
int[]::new

这个可以帮助我们收集元素到数组
因为Java有一个类专门用来描述数组, 构建数组其实就是创建这个类
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 3, 5, 7, 9);

        // 可以创建数组, 收集到数组当中
        Integer[] array = arr.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));

        // 方法引用可以按照下面这样
        /*
        细节:
        创建数组的类型需要和流中数据的类型保持一致.
         */
        Integer[] array1 = arr.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
