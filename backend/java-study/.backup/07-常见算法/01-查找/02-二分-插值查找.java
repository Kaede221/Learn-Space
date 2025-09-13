public class Test {
    /*
    二分查找
    条件: 数组的数据必须有序, 否则用不了
    逻辑就是 每一次排除一半的范围即可
    min是0 max是最大索引 mid是min + max / 2
    左边的话 min不变 max = mid - 1
    右边的话 max不变 min = mid + 1

    如果查找的数据不存在 其实就是一个终止条件
    只要min > max 其实就是数据不存在, 这个就是循环的结束条件了
     */
    public static void main(String[] args) {
        /*
        需求 传入一个有序数组 查找某个数据是否存在
         */
        int[] arr = {1, 2, 5, 6, 12, 123, 152, 166, 170, 180, 185, 190, 200};
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 123));
        System.out.println(binarySearch(arr, 1234));

        // 二分查找改进(其实就是插值查找)
        System.out.println(binarySearch2(arr, 1));
    }

    private static int binarySearch(int[] arr, int target) {
        int min = 0, max = arr.length - 1;
        while (min <= max) {
            // 找数据
            int mid = (min + max) / 2;

            // 比较大小
            if (arr[mid] < target) {
                min = mid + 1;
            } else if (arr[mid] > target) {
                max = mid - 1;
            } else {
                // 一样 直接return
                return mid;
            }
        }
        return -1;
    }

    // 二分查找是可以优化的 mid有一个新的公式可以使用 min + ((target - arr[min]) / (arr[max] - arr[min])) * (max - min);
    private static int binarySearch2(int[] arr, int target) {
        int min = 0, max = arr.length - 1;
        while (min <= max) {
            // 找数据
            int mid = min + ((target - arr[min]) / (arr[max] - arr[min])) * (max - min);

            // 比较大小
            if (arr[mid] < target) {
                min = mid + 1;
            } else if (arr[mid] > target) {
                max = mid - 1;
            } else {
                // 一样 直接return
                return mid;
            }
        }
        return -1;
    }
}