public abstract class Person {
    private String name;
    private int age;

    // 这里就定义抽象类了
    // 比如，人可以工作
    // 这里不需要实现具体内容，直接分号即可
    public abstract void work();

    // 但是，抽象类中，不一定非得是抽象方法
    public void sleep() {
        System.out.println("睡觉咯");
    }

    // 抽象类 也可以有构造方法
    // 虽然不能实例化，但是，可以让子类使用啊！这就是构造函数的用处
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
