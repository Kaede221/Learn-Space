public class Test {
    /*
    分块查找
    前一块中的最大数据 小于后一块中的所有数据
    并且块内无序 块内有序
    分块的数量 一般是数据的个数开根号, 不过其他的数量也是可以的
     */
    public static void main(String[] args) {
        // 每个块 都需要创建对象 所以还是比较麻烦的
        // 随后 放入数组 作为索引表, 进而查找
        int[] arr = {
                16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66
        };

        // 创建块
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        // 定义数组 管理三个块对象
        Block[] blockArr = {b1, b2, b3};

        // 定义变量 记录需要查找的元素
        int number = 30;

        // 调用方法
        System.out.println(getIndex(blockArr, arr, number));
        System.out.println(getIndex(blockArr, arr, 37));
    }

    // 利用分块查找的原理 查询number的索引
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        // 首先 需要确定number在索引表的位置是什么
        int blockIndex = findIndexBlock(blockArr, number);
        // 不在数组 直接返回-1即可
        if (blockIndex == -1) return -1;

        // 可能在数组 开始查找 获取块的索引即可
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        // 开始遍历寻找即可
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) return i;
        }
        return -1;
    }

    // 定义方法 用来确认number在哪个块里面
    private static int findIndexBlock(Block[] blockArr, int num) {
        // 查询 根据max寻找即可
        // 可以使用基本查找来判定
        // 从0索引开始number < max 就表示number在这个块里面
        for (int i = 0; i < blockArr.length; i++) {
            if (num < blockArr[i].getMax())
                return i;
        }
        // 数据超出范围 不存在
        return -1;
    }
}

class Block {
    private int max; // 最大值
    private int startIndex;
    private int endIndex;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}