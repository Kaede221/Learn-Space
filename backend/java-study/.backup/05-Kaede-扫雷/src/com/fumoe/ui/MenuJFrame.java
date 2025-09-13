package com.fumoe.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuJFrame extends JFrame {
    public MenuJFrame() {
        // 初始化窗口
        initFrame();

        // 初始化里面的东西
        initItems();

        // 显示窗口
        this.setVisible(true);
    }

    private void initItems() {
        // 其实就是一个文本 和三个按钮
        JLabel jLabel = new JLabel("请选择难度");
        jLabel.setBounds(110, 0, 100, 45);
        // 三个难度选择的按钮
        JButton jButtonEasy = new JButton("简单");
        jButtonEasy.setBounds(102, 45, 80, 40);
        JButton jButtonNormal = new JButton("中等");
        jButtonNormal.setBounds(102, 95, 80, 40);
        JButton jButtonHard = new JButton("困难");
        jButtonHard.setBounds(102, 145, 80, 40);

        // 给按钮添加点击事件
        // 其实都是 关闭自己，打开游戏界面即可
        jButtonEasy.addActionListener(e -> {
            // 关闭自己 打开新窗口
            this.setVisible(false);
            new GameJFrame(Util.MODE_EASY);
        });

        jButtonNormal.addActionListener(e -> {
            this.setVisible(false);
            new GameJFrame(Util.MODE_NORMAL);
        });

        jButtonHard.addActionListener(e -> {
            this.setVisible(false);
            new GameJFrame(Util.MODE_HARD);
        });

        // 添加到页面中
        this.getContentPane().add(jLabel);
        this.getContentPane().add(jButtonEasy);
        this.getContentPane().add(jButtonNormal);
        this.getContentPane().add(jButtonHard);
    }

    private void initFrame() {
        this.setLayout(null);
        this.setSize(300, 230);
        this.setResizable(false);
        this.setTitle("扫雷 - Kaede");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
