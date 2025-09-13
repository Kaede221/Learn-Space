public class HelloWorld {
    /*
    this 指代的其实就是自己，是一个局部变量
    super 代表的就是父类了，同样，是一个局部变量
     */
    public static void main(String[] args) {
        // 创建对象
        // 啥都不写 就是无参构造
        Student s = new Student();

        // 通过构建带参构造 就可以使用了
        Student s2 = new Student("Kaede", 18);
        System.out.println(s2.getAge() + " " + s2.getName());
    }
}
