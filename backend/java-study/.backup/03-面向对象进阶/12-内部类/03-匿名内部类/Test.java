public class Test {
    /*
    匿名内部类
    这个比较重要，仔细研究一下

    匿名内部类，本质就是隐藏了名字的内部类
    这个东西是用来实现接口的 所以我直接创建一个接口出来
    定义格式是使用new来定义

    本质上，就是把class删掉，剩下的就是一个没有名字的空类了
    然后，想要实现Swim接口，就放在大括号前面 表示这个类实现了
     */
    public static void main(String[] args) {
        // 代码直接写就好
        /*
        new 类名或者接口名{
            实现抽象方法
        }; 分号必须有
         */
        new Swim() {
            // 重写方法 就是接口的所有抽象方法
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        // 我想使用这个匿名内部类 怎么做呢？
        // 其实，你就是创建了一个没有名字的类，那么我们如果遇到需要传入一个类的情况，但是我又不像新建一个类，就可以使用这个快速的方式
        // 调用下面的方法，直接传入一个内部类就可以尝试了！
        show(new Swim() {
            @Override
            public void swim() {
                System.out.println("游泳呢");
            }
        });
    }

    // 实现一个方法，可以传入一个动物
    private static void show(Swim a) {
        a.swim();
    }
}
