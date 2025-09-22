/*
异常有三个常用的方法:

1. getMessage() 返回详细的消息字符串
2. toString() 返回简短描述
3. printStackTrace() 把错误信息输出在控制台

第三个最常用, 前两个了解就行
 */
public class App {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 可以调用方法
            // 这个消息比较简单
            String msg = e.getMessage();
            System.out.println(msg);

            // 直接输出试试 相当于调用toString
            System.out.println(msg.toString());

            // 另外就是红色的文本了
            e.printStackTrace();

            // 不过, 这个红色的文本其实是另外一个输出语句
            System.err.println("我是红色的文本, 相当于错误文本");
        }

        System.out.println("程序运行结束");
    }
}
