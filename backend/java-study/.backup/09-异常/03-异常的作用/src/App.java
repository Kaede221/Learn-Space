/*
异常不仅仅时用来报错, 还有别的作用:
1. 查询bug的关键参考信息
2. 作为方法内部的一种特殊返回值, 以便通知底层的执行情况
 */
public class App {
    public static void main(String[] args) {
        // 最简单的, 比如创建学生对象. 我们希望学生的年龄在一定范围内才成立, 则可以使用异常抛出错误, 而不是打印日志
        Student s1 = new Student("Kaede", 18);
        Student s2 = new Student("Kaede", 30);
    }
}
