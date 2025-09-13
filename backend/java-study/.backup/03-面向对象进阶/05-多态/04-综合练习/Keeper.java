public class Keeper extends Person {
    // 实现饲养员

    public Keeper(String name, int age) {
        super(name, age);
    }

    public Keeper() {
    }

    // 通过多态 实现方法
    public void keepPet(Animal a, String something) {
        // 判断类型
        if (a instanceof Cat c) {
            System.out.println("年龄为" + this.getAge() + "岁的" + this.getName() + "养了一只颜色为" + c.getColor() + "的" + c.getAge() + "岁的猫");
            // 调用猫猫吃东西的方法
            c.eat(something);
        } else if (a instanceof Dog d) {
            System.out.println("年龄为" + this.getAge() + "岁的" + this.getName() + "养了一只颜色为" + d.getColor() + "的" + d.getAge() + "岁的狗");
            // 调用猫猫吃东西的方法
            d.eat(something);
        }
    }
}
