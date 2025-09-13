public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    // 重构猫猫吃饭的方法
    @Override
    public void eat(String thing) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的猫咪在吃" + thing);
    }

    // 另外，猫猫还有独有的方法
    public void catchMouse() {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的猫咪在抓老鼠");
    }
}
