public class HelloWorld {
    /*
    就近原则 如果方法中定义了i 但是类中也有i 则优先使用方法内的i
    否则 向外层进行寻找 没有的话直接报错
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kaede");
        // 如果没有设定this，那么一旦两个name 就不会正常修改
        System.out.println(s.getName());
    }
}
