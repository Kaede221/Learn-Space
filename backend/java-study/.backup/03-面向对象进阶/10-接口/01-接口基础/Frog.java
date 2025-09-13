public class Frog extends Animal implements Swim {
    // 这两个方法都是需要重构的！
    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }
}
