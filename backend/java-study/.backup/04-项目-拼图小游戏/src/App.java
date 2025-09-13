import com.fumoe.ui.GameJFrame;

public class App {
    // 直接创建一个启动界面，这里就是开启程序运行的地方
    // 如果想要开启一个界面，那么直接创建对应的对象即可
    public static void main(String[] args) {
        // 比如，我要显示登陆界面 那么直接new即可
        // 不需要等于之类的了 因为窗口本身就是一个东西，并且显示出来了
        new GameJFrame();
    }
}
