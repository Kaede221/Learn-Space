public class Animal {
    // 猫猫狗狗本质上就是动物类 直接在这里实现一些基本的属性
    private int age;
    private String color;

    // 并且存在通用方法 吃东西
    public void eat(String thing) {
        System.out.println("吃什么东西 需要重构本方法");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }
}
