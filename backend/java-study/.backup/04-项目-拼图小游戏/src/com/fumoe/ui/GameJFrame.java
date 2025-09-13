package com.fumoe.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    // 这里必须要继承，进而实现这个窗体才可以
    // 这个界面就是表示游戏主界面

    // 二维数组其实是一个成员，放在外面就好
    // final修饰的是对象，代表这个东西的目标不能变
    private int[][] data = new int[4][4];

    // 同时直接定义一个二维数组，存储最后正确结果的样子 用来后续的判断操作
    private final int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    // 另外，定义两个变量，用来记录对应的空白图片的位置是什么
    private int zero_x = 0;
    private int zero_y = 0;

    // 定义path 用来记录当前展示的图片的路径是什么 或者说展示的是什么图片
    private String path = "";

    // 定义变量 统计当前走了多少步数
    private int step = 0;

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据 就是图片打乱的顺序是什么
        initData();

        // 初始化图片
        initImage();

        // 显示界面
        this.setVisible(true);
    }

    private void initData() {
        // 打乱数据，给二维数组赋值即可
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 打乱数组的顺序
        // 遍历数组，让一个元素和一个随机索引的数据进行交换即可
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            // 获取随机索引
            int index = r.nextInt(tempArr.length);
            // 交换即可
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 遍历一维数组，添加到数组即可
        for (int i = 0; i < tempArr.length; i++) {
            // 顺便记录0的一开始的位置是什么
            if (tempArr[i] == 0) {
                this.zero_x = i / 4;
                this.zero_y = i % 4;
            }
            this.data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        // 每次初始化图片，都应该清空原本已经存在的所有图片
        this.getContentPane().removeAll();

        // 直接判断是否胜利
        if (this.victory()) {
            // 显示胜利的图标即可
            JLabel win_image = new JLabel(new ImageIcon("src/image/win.png"));
            win_image.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win_image);
        }

        // 创建记录步数的一个文本
        JLabel stepCounter = new JLabel("步数：" + this.step);
        stepCounter.setBounds(50, 30, 100, 20);
        // 添加
        this.getContentPane().add(stepCounter);

        // 为了简化代码 直接for循环即可
        // 外循环，重复执行四次 渲染四行东西
        for (int i = 0; i < 4; i++) {
            // 内循环 一行添加四张图片
            for (int j = 0; j < 4; j++) {
                // 首先 要创建ImageIcon的对象
                // 这里可以使用绝对路径，但是我喜欢相对路径
                // 程序运行是从根目录开始的，所以需要src开始前缀 后面再是路径即可

                // 需要获取当前需要加载的图片的需要是多少
                int num = this.data[i][j];
                ImageIcon icon = new ImageIcon("src/image/cartoon1/split_" + num + ".png");

                // 强制修改图片缩放大小为105
                // 这里使用的是一个awt里面的东西 记住就好
                Image newImage = icon.getImage().getScaledInstance(105, 105, Image.SCALE_DEFAULT);
                icon = new ImageIcon(newImage);

                // 创建一个JLabel对象（管理容器）
                // 传入icon 表示管理这个icon
                JLabel jLabel = new JLabel(icon);

                // TODO 指定图片的位置
                // 另外，为了让这个图片的位置在中间偏下方，所以需要给一个位移 直接加，或者抽象一个delta即可
                int deltaX = 83;
                int deltaY = 134;
                jLabel.setBounds(j * 105 + deltaX, i * 105 + deltaY, 105, 105);
                // TODO 添加边框
                // 图片直接显示是没有边界感的，所以需要加一个边框出来
                // 这里的1是让图片凹下去，0就是让图片凸出来 不过可以使用官方自带的常量 顾名思义了
                // RAISED 就是凸出来，LOWERED就是凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                // 添加图片到JLabel中
                this.getContentPane().add(jLabel);
            }
        }

        // 背景图片 其实是后面加载的
        /*
        有一个细节 Java中 先加载的图片 其实是在最上面的，后加载的图片会自动在后面，不是想象中的覆盖上面
         */
        // TODO 初始化背景图片，再初始化里面的小图片 不然会被覆盖的
        JLabel background = new JLabel(new ImageIcon("src/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        // 添加到界面中
        this.getContentPane().add(background);

        // 最后，刷新界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        /*
        界面配置完成了，就需要设定这个界面里面的东西了
        最上面的就是一个菜单栏了 需要先初始化菜单
        使用JMenuBar即可
        */
        JMenuBar jMenuBar = new JMenuBar();
        // 创建两个选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        // 给功能菜单添加条目对象
        JMenuItem replayItem = new JMenuItem("重新开始");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("联系我");

        // TODO 给对应的条目绑定事件
        // 这里我不想全部抽象出去了，太麻烦，并且看的不舒服
        replayItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 重新游戏 其实就是先打乱 再加载 清空计数器
                initData();
                step = 0;
                initImage();
            }
        });

        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 关闭游戏 其实就是停止虚拟机 直接实现即可
                System.exit(0);
            }
        });

        accountItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 这里其实是一个图片弹窗
                JDialog jDialog = new JDialog();
                // 创建管理图片的容器
                ImageIcon icon = new ImageIcon("src/image/qrcode.png");
                Image newImage = icon.getImage().getScaledInstance(258, 258, Image.SCALE_DEFAULT);
                icon = new ImageIcon(newImage);
                JLabel jLabel = new JLabel(icon);

                // 这个位置是相对弹窗的位置
                jLabel.setBounds(0, 0, 258, 258);
                jDialog.getContentPane().add(jLabel);
                jDialog.setSize(344, 344);
                // 始终在最上方
                jDialog.setAlwaysOnTop(true);
                // 设置弹窗居中
                jDialog.setLocationRelativeTo(null);
                // 设置弹窗不关闭无法操作后面的东西
                jDialog.setModal(true);
                // 显示弹窗
                jDialog.setVisible(true);
            }
        });

        // 把条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        // 再把选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        // 最后，还需要设置这个界面的菜单是这个东西 也是一个方法就是了
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        /*
          初始化界面
         */
        // 设置界面的宽高
        this.setSize(603, 680);
        // 设置界面标题
        this.setTitle("拼图单机版 v11.123");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 设置关闭模式
        // 因为直接关闭窗口，其实虚拟机还在运行，并没有停止，只是窗口没了
        // 为了彻底关闭，我们就需要进行一些设置了
        // 这里可以查看源码，其实就是几个枚举类型
        // 本质上就是几个数字而已，所以这里直接写3也是一样的 没区别 默认是1
        // 对于2来说，需要对每个窗口都进行配置，否则无效(虽然可以用2，不过这个程序，不会有两个界面同时出现)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 还没结束，图片默认是中央，但是制定了x y 还是在中间
        // 因为JFrame里面 存在一个隐藏的容器
        // 添加图片，其实主要是添加给这个隐藏容器的 这里需要修改这个隐藏容器的默认机制
        // 设置布局为null 就是取消内部默认居中放置的形式
        this.setLayout(null);

        // 最后，给整个界面添加键盘的监听事件
        // 这里要实现的是自己这个类的方法 所以传入this就好
        this.addKeyListener(this);
    }

    private boolean victory() {
        // 判断当前是否获得顺利 如果相等 返回true 否则 false
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                if (this.data[i][j] != this.win[i][j]) return false;
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 同理 判断是否胜利 胜利了不反应
        if (this.victory()) return;
        // 这个方法是按下不松开的时候 会调用的
        // 我希望按下q的时候，显示完整的图片
        if (e.getKeyCode() == 65) {
            // 直接就是移除所有图片，重新绘制即可
            this.getContentPane().removeAll();
            // 加载那个完整的图片
            ImageIcon icon = new ImageIcon("src/image/cartoon1/all.png");
            Image newImage = icon.getImage().getScaledInstance(420, 420, Image.SCALE_DEFAULT);
            icon = new ImageIcon(newImage);
            JLabel all = new JLabel(icon);
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // 加载背景图片
            JLabel background = new JLabel(new ImageIcon("src/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 首先判断游戏是否胜利 胜利了我们就不应该允许继续移动了
        if (this.victory()) {
            // 结束这个方法 非常简单
            return;
        }
        // 对上下左右进行判断
        // 通过方法获取code值是多少
        // 这里需要知道 左37 上38 右39 下40，逆时针逐渐加1就是了
        int code = e.getKeyCode();
        switch (code) {
            case 37:
                // TODO 左
                // 先判断边界
                if (this.zero_y == 3) return;
                this.data[this.zero_x][this.zero_y] = this.data[this.zero_x][this.zero_y + 1];
                this.data[this.zero_x][this.zero_y + 1] = 0;
                this.zero_y++;
                this.step++;
                this.initImage();
                break;
            case 38:
                // TODO 上
                if (this.zero_x == 3) return;
                this.data[this.zero_x][this.zero_y] = this.data[this.zero_x + 1][this.zero_y];
                this.data[this.zero_x + 1][this.zero_y] = 0;
                this.zero_x++;
                this.step++;
                this.initImage();
                break;
            case 39:
                // TODO 右
                if (this.zero_y == 0) return;
                this.data[this.zero_x][this.zero_y] = this.data[this.zero_x][this.zero_y - 1];
                this.data[this.zero_x][this.zero_y - 1] = 0;
                this.zero_y--;
                this.step++;
                this.initImage();
                break;
            case 40:
                // TODO 下
                if (this.zero_x == 0) return;
                this.data[this.zero_x][this.zero_y] = this.data[this.zero_x - 1][this.zero_y];
                this.data[this.zero_x - 1][this.zero_y] = 0;
                this.zero_x--;
                this.step++;
                this.initImage();
                break;
            case 65:
                // TODO 松开了A按键 重新执行绘制图片的事件
                this.initImage();
                break;
            case 87:
                // TODO 按下W按键 直接完成拼图的逻辑在这里
                // 其实就是重新设置二维数组就好
                this.data = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                // 然后刷新页面就好
                this.initImage();
                break;
        }
    }
}
