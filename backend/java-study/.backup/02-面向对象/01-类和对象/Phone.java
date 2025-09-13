/**
 * 实现手机Javabean类
 */

public class Phone {
    // 类里面 可以定义一些成员属性
    String brand;
    double price;

    // 同时也可以定义一些类的行为
    public void call() {
        System.out.println("打电话ing");
    }

    public void playGames() {
        System.out.println("玩游戏");
    }
}
