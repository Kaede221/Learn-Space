public class HelloWorld {
    public static void main(String[] args) {
        /*
            抽象方法
            把共性的行为 方法抽象到父类后 由于每个子类的执行内容不一样，所以父类中不能确认具体的方法体
            这个时候，这个方法就可以定义为抽象方法了
            定义抽象方法的时候，是不写方法体的，直接用一个分号表示结束即可

            抽象类
            如果一个类里面存在抽象方法，那么这个类就必须为抽象类

            定义的时候，都是在public后面添加一个abstract即可
         */

        /*
        抽象类不能实例化
        抽象类中不一定有抽象方法，但是有抽象方法的一定是抽象类
        抽象类是可以有构造方法的

        对于抽象类的子类，要么重写所有抽象方法，要么是一个抽象类 否则报错
         */
        // 我想要实例化Person 不行，直接报错
        // Person p = new Person();

        // 但是子类是可以的
        Student s = new Student("Kaede", 18);
        System.out.println(s.getAge() + " - " + s.getName());

        // 方法 直接使用的就是重写的方法的参数了
        s.work();
    }
}
