public class HelloWorld {
    /*
    封装，继承，多态 是面向对象的三大特点

    现在有一个需求，设计一个学生对象，学生有姓名，年龄，可以吃饭，睡觉
    这个很简单，但是如果我现在有一个需求 学生画圆

    那么这个时候，画圆的方法，应该是谁呢？
    答案是圆，不是人

    因为画一个圆需要半径，半径是圆形的属性，所以这个东西是圆形的属性

    或者，人关门，这个门是自己关的，人是动作，门是关上了，所以这个方法也是门的方法

    或者这么说，A杀了B，B是怎么死的？这个死亡的方法其实是B执行的，这就是封装的思想

    对象代表什么，就得封装对应的数据，并且提供数据对应的行为
     */
    public static void main(String[] args) {
        // 实例化学生类
        Student s = new Student();
        // 尝试设定一下年龄
        s.setAge(-10);
        // 不合法，重新赋值
        s.setAge(18);
        System.out.println("年龄为" + s.getAge());

        // 名称也是一样的，可以进行一定的校验
        s.setName("Kaede Shimizu");
        s.setName("123");
        System.out.println(s.getName());
    }
}
