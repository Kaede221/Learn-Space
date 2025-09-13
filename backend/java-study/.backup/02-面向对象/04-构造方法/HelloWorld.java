public class HelloWorld {
    public static void main(String[] args) {
        // 实例化学生，不过这次直接调用构造方法
        Student s = new Student("Kaede", 18);

        // 使用学生的属性，直接查看
        System.out.println(s.getName() + " - " + s.getAge());

        // 无参构造也是可以直接使用的
        Student s2 = new Student();

        // 使用默认值
        System.out.println(s2.getName() + " - " + s2.getAge());
    }
}
