public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String thing) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的狗狗在吃" + thing);
    }

    // 还有独有的方法
    public void lookHouse() {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的狗狗在看门");
    }
}
