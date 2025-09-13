public class HelloWorld {
    public static void main(String[] args) {
        // 实现测试案例 直接创建一只猫和一只狗，两个饲养员
        Keeper yyt = new Keeper("YYt", 18);
        Keeper lc = new Keeper("Lc", 19);

        Cat cat = new Cat(2, "白色");
        Dog dog = new Dog(3, "棕色");

        // 尝试调用方法即可
        yyt.keepPet(cat, "小鱼");
        lc.keepPet(dog, "骨头");
    }
}
