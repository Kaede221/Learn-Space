import java.util.Arrays;
import java.util.Comparator;

/*
什么是方法引用?
方法, 就是方法; 引用, 就是把之前写好的方法拿过来用
怎么用呢? 就是把已有的方法当作函数式接口中的方法体进行引用.

其实这就是lambda的进一步简化, 相当于传了一个回调函数进去
无论如何, 还有一些规则:
1. 引用处必须是函数式接口
2. 被引用的方法必须已经存在
3. 被引用的方法的形参和返回值需要和抽象方法保持一致
4. 被引用的方法要能满足当前需求
 */
public class App {
    public static void main(String[] args) {
        // 从之前的一个需求开始
        // 创建一个数组, 进行倒序排序
        Integer[] arr = {1, 3, 5, 7, 9};

        // 通过匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));

        // 通过lambda表达式进行简化
        Arrays.sort(arr, (Integer o1, Integer o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));

        // 随后, 就是方法引用了, 这里需要保证满足上面的四个条件.
        // 考虑到这是静态方法, 所以需要使用类名调用 但是这里是类名::方法名, 不是类名.方法名了
        // 这里的 :: 叫做方法引用符
        // 把方法作为方法体
        Arrays.sort(arr, App::sub);
        System.out.println(Arrays.toString(arr));
    }

    // 方法必须存在, 所以提前准备一个方法
    // 这个方法可以是Java本身写好的方法, 也可以是第三方的工具类的方法
    static int sub(int num1, int num2) {
        return num2 - num1;
    }
}
