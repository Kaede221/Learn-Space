package com.fumoe.ui;

// 使用的是javax的东西，需要导入

import javax.swing.*;

public class Test {
    // 这个类就是用来测试UI的测试类了 所以直接叫做Test即可
    /*
    JFrame其实就是一个JavaBean类，有setter和getter，很标准，都是可以直接使用的

    这里其实就是一个测试类，并不是我们主要写代码的地方
    而是要抽象出去一些代码 所以需要创建其他的类！
     */
    public static void main(String[] args) {
        // 1. 创建一个游戏的界面出来
        JFrame gameJFrame = new JFrame();

        // 随后，我们可以设置大小
        // 这里大小的意思指的是像素大小
        gameJFrame.setSize(603, 680);

        // 直接运行程序是没用的，因为默认界面是隐藏的，我们需要显示出来
        // 隐藏 是可视属性 所以需要设置这个属性
        gameJFrame.setVisible(true);

        // 2. 另外，我们还有登陆界面，也创建一下这个JFrame
        JFrame loginJFrame = new JFrame();
        loginJFrame.setSize(488, 430);
        loginJFrame.setVisible(true);

        // 3. 注册界面
        JFrame registerJFrame = new JFrame();
        registerJFrame.setSize(488, 500);
        registerJFrame.setVisible(true);
    }
}
