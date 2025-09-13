public class Test {
    /*
    System 也是一个工具类
    其实就是提供了系统相关的方法 下面会进行对应的演示

    注意 1970年1月1日 是时间的原点，计算机中获取的时间其实都是距离这个原点的毫秒数，随后进行的转化 1s=1000ms
    但是我们在中国 是+8的时间，所以就是早上八点钟了
     */
    public static void main(String[] args) {
        // 可以获取代码运行的时间 是多少毫秒
        // 进而实现记录代码运行的时常是多少
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) System.out.print("Hello World");
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("Hello World 运行了 " + (endTime - startTime) + "ms");

        // 对于拷贝数组 因为Java中的数组其实储存的是地址，所以我们直接等于是不行的，这里就需要进行一个系统级别的拷贝
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[5];

        // 我们可以使用系统的拷贝方式
        /*
        五个参数
        - 数据源，就是要拷贝的数据 是哪个数组
        - 从数据源的第几个数据开始拷贝 使用的是索引
        - 目的地，把数据保存在哪个数组之中
        - 目标的拷贝索引是什么
        - 拷贝的数据有多少个 总共5个
         */
        System.arraycopy(arr, 0, newArr, 0, 5);
        // 可以修改一下看看是否真的是不一样的数组了
        arr[1] = 10;
        System.out.println(arr[1]);
        System.out.println(newArr[1]);

        // 对于退出程序 可以手动使用方法 并且可以传入参数
        // 0代表正常退出 非0代表不正常，主要是给程序员看的
        System.exit(11123);
    }
}
