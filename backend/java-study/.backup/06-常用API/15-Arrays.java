import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays API
 * 其实就是一个工具方法, 基本都是一个个静态方法, 直接使用类名.xxx就可以调用了
 * 它有几个常用的方法:
 * toString(数组)
 * binarySearch(数组, 查找的元素) 二分查找
 * copyOf(原数组, 新数组的长度)
 * copyOfRange(原数组, 起始索引, 结束索引)
 * fill(数组, 元素)
 * sort(数组)
 * sort(数组, 排序规则)
 */
public class Test {
    public static void main(String[] args) {
        // 定义一个基本数组出来
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 可以使用 toString, 直接转换为一个字符串
        System.out.println(Arrays.toString(arr));

        // 可以使用 binarySearch 查找元素
        // 不过有要求, 数组元素必须有序且升序
        System.out.println("5 的索引为 " + Arrays.binarySearch(arr, 5));
        System.out.println("1 的索引为 " + Arrays.binarySearch(arr, 1));

        // 如果说查找的元素存在, 则返回真实索引. 但是如果查找的元素不存在, 则返回的是一个负的插入点 - 1
        // 插入点, 就是如果元素在数组里面的话, 那么这个元素应该在的位置
        System.out.println("-1 的索引为 " + Arrays.binarySearch(arr, -1));

        // 拷贝一个数组出来
        // 第二个参数, 长度有一些细节. 方法会根据第二个参数创建数组
        // 如果新数组长度小于老数组长度, 部分拷贝
        // 如果大于, 则完全拷贝, 剩下的使用默认初始化值补全.
        int[] newArr = Arrays.copyOf(arr, 15);
        System.out.println(Arrays.toString(newArr));

        // 指定范围进行拷贝
        // 包左不包右
        int[] newArr2 = Arrays.copyOfRange(arr, 0, 5);
        System.out.println(Arrays.toString(newArr2));

        // fill 就是填充
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        // 使用 sort进行快速排序
        arr = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 对于 第二个参数, 必须是引用数据类型的数组.
        // 第二个参数是接口, 所以要传递接口的实现类对象, 作为排序规则
        // 但是只需要使用一次这个类, 使用匿名内部类实现
        Integer[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 规则中, 0就是一样, 大于0就是从小到大, 小于0就是从大到小
                // o1 是无序序列的每一个元素
                // o2 是有序序列的每一个元素
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}


















