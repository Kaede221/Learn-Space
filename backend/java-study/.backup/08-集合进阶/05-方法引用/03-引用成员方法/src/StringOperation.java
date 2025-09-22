/*
自定义一个类, 方便后续演示
 */
public class StringOperation {
    // 提供成员方法 不是静态方法
    public boolean stringJudge(String s) {
        // 直接返回需要的结果
        return s.length() == 3 && s.startsWith("A");
    }
}
