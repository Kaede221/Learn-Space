public class HelloWorld {
    /*
    调用成员变量的时候
    - 编译看左边，运行也看左边

    调用成员方法的时候
    - 编译看左边，运行看右边
     */
    public static void main(String[] args) {
        // 如果用多态的形式创建对象的话
        Animal a = new Cat();
        // 如果我们输出a的名字的话 会发现不是猫 而是动物
        // 编译看左边 先看左边的这个父类有没有这个变量，如果有的话 那么直接使用，否则报错
        System.out.println(a.name);

        // 但是对于方法而言，先看你有没有这个方法，有的话编译通过，但是运行的时候，看的是子类有没有这个方法
        a.show();
    }
}

// 为了方便，代码直接单文件了
class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal - show!");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat - show!");
    }
}