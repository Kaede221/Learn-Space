import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    private static void Divider() {
        System.out.println("---分割线---");
    }

    // 创建对象
    private static void f1() {
        // 和整数是一样的 没什么区别 这里直接实现四个标准的情况即可
        // 这里需要注意，还是需要使用字符串格式的 否则不精确 可以试试看
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println(bd1.add(bd2));

        // 另外，也可以用小数来创建就是了
        BigDecimal bd3 = BigDecimal.valueOf(0.1);
        System.out.println(bd3);

        // 加减乘除也是一样的，但是对于除来说，存在四舍五入 HALF_UP
        // 可以传入第二个参数 设置取整格式，可以看文档就知道了
        System.out.println(bd1.divide(bd2, RoundingMode.CEILING));
    }

    public static void main(String[] args) {
        /*
        Java中 对于小数来说，如果我要计算两个小数
        比如下面这几个，计算出来的结果是很长的一串东西，这就是计算机的计算误差了
         */
        System.out.println(0.09 + 0.01);
        System.out.println(0.216 - 0.1);
        System.out.println(0.226 * 0.01);
        System.out.println(0.09 / 0.1);
        Divider();
        f1();
    }
}