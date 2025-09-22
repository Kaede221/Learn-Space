/*
比如说, 我们创建学生对象的时候, 年龄大于18, 直接抛出运行时异常其实是不好的
因为这个没法特别形象的进行描述

所以, 我们需要自定义一个异常类出来.

1. 定义异常类, 需要简明知意
2. 需要写继承关系
3. 空参构造
4. 带参构造
 */
public class App {
    public static void main(String[] args) {
        // 如果需要抛出异常, 就可以使用自定义异常了
        throw new AgeFormatException("年龄不符合范围要求");
    }
}
