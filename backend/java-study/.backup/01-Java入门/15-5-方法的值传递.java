/**
 * 方法的值传递
 */

public class HelloWorld {
    /*
    基本数据类型，就是在栈中，开辟了一个空间，专门用来存储这个东西
    int a = 10;
    这个时候，变量存储的是变量真实的数据

    但是数组，就不是了，因为它的本质是在堆中开辟了一个空间，用来存储数组
    数组储存的本质不是数据，而是地址是什么
     */

    // 那么，我们就可以实现方法的值传递了
    public static void changeNumber(int num) {
        num = 200;
    }

    // 如果我们非要修改，只能通过返回值的形式了，Java这里没有引用传递的说法
    // 具体实现不多说，没啥说的


    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        // 我想要调用修改方法，修改数据
        changeNumber(num);
        // 输出，发现没变化 这是因为int本质是真实的数据，函数中开辟了，但是没有修改原来的数据
        System.out.println(num);

        // 但是对于数组来说，则不然，因为数组本质就是地址了，我们修改的就是原来的东西，不会出现再次创建一个新数组的情况
    }
}
