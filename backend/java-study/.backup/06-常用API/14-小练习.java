import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test {
    /*
    练习题目1
    定义一个方法 实现将十进制转换为二进制字符串的效果
     */
    private static String toBinaryString(int num) {
        // 用字符串来拼接 所以是StringBuilder
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 2);
            num /= 2;
        }
        sb.reverse();
        return sb.toString();
    }

    /*
    练习题目2
    计算你活到现在, 活了多少天
     */
    private static long getHowLongerYouLive(LocalDateTime time) {
        // 获取今天
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.DAYS.between(time, now);
    }

    public static void main(String[] args) {
        System.out.println(toBinaryString(3));
        System.out.println(toBinaryString(6));

        // 题目2
        LocalDateTime birthday = LocalDateTime.of(2006, 2, 21, 12, 12, 12);
        System.out.println(getHowLongerYouLive(birthday));
    }
}