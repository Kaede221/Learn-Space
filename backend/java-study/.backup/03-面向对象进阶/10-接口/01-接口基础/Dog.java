public class Dog extends Animal implements Swim {

    @Override
    public void eat() {
        System.out.println("狗狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗狗在狗刨");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
