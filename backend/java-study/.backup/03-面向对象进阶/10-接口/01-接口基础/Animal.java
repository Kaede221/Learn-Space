public abstract class Animal {
    // 父类直接实现共有的一些属性即可
    private String name;
    private int age;

    // 所有的动物都可以吃东西，直接实现即可
    // 由于不知道怎么吃，所以直接不写了，用抽象类即可
    public abstract void eat();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
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
