import java.util.ArrayList;

public class Test {
    /*
    欢迎来到 算法
    这里先介绍查找算法吧 目前来说 常见的查找算法如下
    - 基本查找
    - 二分查找
    - 分块查找
    - 插值查找
    - 斐波那契查找
    - 树表查找
    - 哈希查找
     */
    // 这里直接介绍基本查找即可
    // 基本查找 就是从0开始 往后查找, 也叫做顺序查找
    private static boolean basicSearch(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) return true;
        }
        return false;
    }

    private static int getIndex(int[] arr, int target) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res = i;
                break;
            }
        }
        return res;
    }

    private static ArrayList<Integer> getAllAppear(int[] arr, int target) {
        ArrayList<Integer> finalArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                finalArr.add(i);
            }
        }
        // 判断列表有没有东西
        if (finalArr.isEmpty()) {
            finalArr.add(-1);
        }
        return finalArr;
    }

    public static void main(String[] args) {
        /*
        要求 定义一个方法 遍历一个数组, 判断某个元素是否存在
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 9, 10};
        System.out.println(basicSearch(arr, 10));
        System.out.println(basicSearch(arr, 11));

        /*
        同理 我也可以寻找某个元素第一次出现的位置的索引是多少
        如果不存在 返回-1即可
         */
        System.out.println(getIndex(arr, 10));
        System.out.println(getIndex(arr, 11));

        /*
        麻烦一些, 我要寻找一个数据出现的所有位置
        如果不存在 返回空列表即可
         */
        System.out.println(getAllAppear(arr, 10));
        System.out.println(getAllAppear(arr, 11));
    }
}