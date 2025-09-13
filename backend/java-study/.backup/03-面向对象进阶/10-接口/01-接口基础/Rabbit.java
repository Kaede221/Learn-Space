public class Rabbit extends Animal {
    // 兔子不会游泳 不需要接口


    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
