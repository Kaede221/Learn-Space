package com.fumoe.ui;

import javax.swing.*;

public class OverJFrame extends JFrame {
    /*
    游戏结束的界面 直接实现一下 方便一点，不要一个弹窗一个弹窗了 麻烦的
     */
    public OverJFrame() {
        // 初始化界面
        initFrame();

        // 初始化里面的东西
        initItems();

        // 显示界面
        this.setVisible(true);
    }

    private void initItems() {
        // 其实就是一个文本 和三个按钮
        JLabel jLabel = new JLabel("Game Over!");
        jLabel.setBounds(110, 20, 100, 45);
        JButton jButtonBack = new JButton("菜单");
        jButtonBack.setBounds(102, 85, 80, 40);
        JButton jButtonExit = new JButton("退出");
        jButtonExit.setBounds(102, 135, 80, 40);

        jButtonBack.addActionListener(e -> {
            this.setVisible(false);
            new MenuJFrame();
        });

        jButtonExit.addActionListener(e -> {
            this.setVisible(false);
            System.exit(0);
        });

        // 添加到页面中
        this.getContentPane().add(jLabel);
        this.getContentPane().add(jButtonBack);
        this.getContentPane().add(jButtonExit);
    }

    private void initFrame() {
        this.setLayout(null);
        this.setSize(300, 230);
        this.setResizable(false);
        this.setTitle("Game Over");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
