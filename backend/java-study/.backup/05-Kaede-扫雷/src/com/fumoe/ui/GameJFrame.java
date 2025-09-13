package com.fumoe.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameJFrame extends JFrame {
    /*
    游戏的主界面
     */
    // 传入一个mode 表示当前游戏的难度
    private int mode;

    // 使用数组来记录雷区矩阵
    private int[][] source_data = new int[10][10];
    // 同时 创建一个修改数组，这个数组是用来记录用户点击内容的 也是判断的数组
    private int[][] temp_data = new int[10][10];
    // 还要创建一个记录数组，用来插旗子
    private boolean[][] flag_data = new boolean[10][10];

    public GameJFrame(int mode) {
        this.mode = mode;

        // 初始化界面
        initJFrame();

        // 初始化雷区地图
        initData();

        // 创建雷区矩阵
        initMines();

        // 显示页面
        this.setVisible(true);
    }

    // 实现雷区的相关操作
    // 构建地雷数据矩阵
    private void initMineData(int[][] targetArray) {
        // 可以获取行和宽的数量分别是多少
        int width = targetArray.length;
        int height = targetArray[0].length;

        // 随机放入地雷
        // 根据难度判断次数是多少
        if (this.mode == Util.MODE_EASY) {
            // 总共 13个雷就行
            for (int i = 0; i < 10; i++) {
                // 随机获取一个x和y
                int randomX = (int) (Math.random() * 100) % width;
                int randomY = (int) (Math.random() * 100) % height;
                // 放入目标矩阵
                targetArray[randomX][randomY] = -1;
            }
        } else if (this.mode == Util.MODE_NORMAL) {
            for (int i = 0; i < 15; i++) {
                // 随机获取一个x和y
                int randomX = (int) (Math.random() * 100) % width;
                int randomY = (int) (Math.random() * 100) % height;
                // 放入目标矩阵
                targetArray[randomX][randomY] = -1;
            }
        } else {
            for (int i = 0; i < 20; i++) {
                // 随机获取一个x和y
                int randomX = (int) (Math.random() * 100) % width;
                int randomY = (int) (Math.random() * 100) % height;
                // 放入目标矩阵
                targetArray[randomX][randomY] = -1;
            }
        }

        // 遍历矩阵 初始化数据格式
        /*
        遍历 把非雷的部分 变成0~8 雷不变
         */
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // 处理当前位置即可
                if (targetArray[i][j] == -1) continue;
                // 否则 计算周围的地雷数量
                int now = getNow(targetArray, i, j);
                targetArray[i][j] = now;
            }
        }
    }

    // 计算周围地雷的数量的函数
    private static int getNow(int[][] targetArray, int i, int j) {
        int now = 0;
        if (i - 1 >= 0 && targetArray[i - 1][j] == -1) now++;
        if (i - 1 >= 0 && j - 1 >= 0 && targetArray[i - 1][j - 1] == -1) now++;
        if (i - 1 >= 0 && j + 1 < targetArray[0].length && targetArray[i - 1][j + 1] == -1) now++;
        if (j - 1 >= 0 && targetArray[i][j - 1] == -1) now++;
        if (j + 1 < targetArray[0].length && targetArray[i][j + 1] == -1) now++;
        if (i + 1 < targetArray.length && targetArray[i + 1][j] == -1) now++;
        if (i + 1 < targetArray.length && j - 1 >= 0 && targetArray[i + 1][j - 1] == -1) now++;
        if (i + 1 < targetArray.length && j + 1 < targetArray[0].length && targetArray[i + 1][j + 1] == -1) now++;
        return now;
    }

    private void initData() {
        // 初始化地雷数据
        if (this.mode == Util.MODE_EASY) {
            // easy 直接就是一个正方形矩阵
            // 一个图片20大小 那么平均下来
            this.source_data = new int[10][10];
            // 要初始化点击数组 一开始为9 方便后续点击修改
            this.temp_data = new int[10][10];
            this.flag_data = new boolean[10][10];
            this.initMineData(this.source_data);
        } else if (this.mode == Util.MODE_NORMAL) {
            this.source_data = new int[14][13];
            this.temp_data = new int[14][13];
            this.flag_data = new boolean[14][13];
            this.initMineData(this.source_data);
        } else {
            this.source_data = new int[14][16];
            this.temp_data = new int[14][16];
            this.flag_data = new boolean[14][16];
            this.initMineData(this.source_data);
        }

        // 最后 初始化点击数组即可 这个是通用的
        for (int i = 0; i < temp_data.length; i++) {
            for (int j = 0; j < temp_data[0].length; j++) {
                temp_data[i][j] = 9;
            }
        }
    }

    // 实现点击到0的bfs算法
    private void bfs(int x, int y, int[][] visited) {
        // 知道当前点击的坐标即可
        // 开始bfs算法
        if (!(x >= 0 && x < this.temp_data.length && y >= 0 && y < this.temp_data[0].length && visited[x][y] == 0))
            return;
        // 设置当前已经访问
        visited[x][y] = 1;
        // 否则 开始bfs即可
        if (this.source_data[x][y] == 0) {
            this.temp_data[x][y] = 0;
            // 同时，对四个方向 进行bfs
            bfs(x + 1, y, visited);
            bfs(x + 1, y + 1, visited);
            bfs(x + 1, y - 1, visited);
            bfs(x - 1, y, visited);
            bfs(x - 1, y + 1, visited);
            bfs(x - 1, y - 1, visited);
            bfs(x, y + 1, visited);
            bfs(x, y - 1, visited);
        } else {
            if (this.source_data[x][y] == -1) return;
            this.temp_data[x][y] = this.source_data[x][y];
        }
    }

    // 初始化绘制图片的方法
    private void initImage(int deltaX, int deltaY) {
        // 首先 清空
        this.getContentPane().removeAll();
        // 这里创建一个矩阵出来即可
        for (int i = 0; i < this.temp_data.length; i++) {
            for (int j = 0; j < this.temp_data[0].length; j++) {
                // 创建图片对象
                JLabel mine = new JLabel(new ImageIcon("src/image/" + this.temp_data[i][j] + ".gif"));
                // 同时要判断 是否是插旗子的
                if (this.flag_data[i][j]) {
                    mine = new JLabel(new ImageIcon("src/image/10.gif"));
                }
                mine.setBounds(i * 20 + deltaX, j * 20 + deltaY, 20, 20);

                // 给这个Label 添加点击事件
                int finalI = i;
                int finalJ = j;
                mine.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // 判断是左键还是右键
                        // 左键点击 就是打开地块
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            // 实现点击事件
                            // 判断是否有旗子 有的话无反应
                            if (flag_data[finalI][finalJ]) return;

                            // 点击了 其实就是翻牌 把最终的数据 反馈给临时数据即可
                            temp_data[finalI][finalJ] = source_data[finalI][finalJ];

                            // TODO 判断点到的东西是啥 如果是雷 boom 游戏结束
                            if (temp_data[finalI][finalJ] == -1) {
                                // 游戏结束
                                // 关闭自己
                                setVisible(false);
                                new OverJFrame();
                            } else if (temp_data[finalI][finalJ] == 0) {
                                // 如果是0的话 那么解开所有相邻的格子即可 这里使用bfs算法
                                // 首先定义一个visited 用来记录
                                int[][] visited = new int[temp_data.length][temp_data[0].length];
                                bfs(finalI, finalJ, visited);
                            }
                            // 然后 要重新绘制图片
                            initImage(deltaX, deltaY);
                        } else if (e.getButton() == MouseEvent.BUTTON3) {
                            // 鼠标右键 就是标注
                            // 首先 我要判断 这个地方 是否已经 被打开了
                            if (temp_data[finalI][finalJ] == 9) {
                                // 只有是9 也就是初始状态 才修改状态
                                flag_data[finalI][finalJ] = !flag_data[finalI][finalJ];
                                initImage(deltaX, deltaY);
                            }
                        }

                        // 不管如何，都要判断是否胜利
                        if (victory()) {
                            // 直接绘制胜利的Dialog
                            JDialog jDialog = new JDialog();
                            jDialog.setSize(100, 80);
                            JLabel jLabel = new JLabel("胜利！");
                            jLabel.setBounds(0, 0, 100, 20);
                            jDialog.getContentPane().add(jLabel);
                            jDialog.setAlwaysOnTop(true);
                            jDialog.setLocationRelativeTo(null);
                            jDialog.setModal(true);
                            jDialog.setVisible(true);
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });
                this.getContentPane().add(mine);
            }
        }
        this.getContentPane().repaint();
    }

    private void initMines() {
        // 初始化一个矩阵 也是根据当前的模式来决定的就是了
        if (this.mode == Util.MODE_EASY) {
            this.initImage(45, 35);
        } else if (this.mode == Util.MODE_NORMAL) {
            this.initImage(33, 25);
        } else {
            this.initImage(33, 25);
        }
    }

    private void initJFrame() {
        // 设置界面大小 这个也是根据当前的mode决定的
        if (this.mode == Util.MODE_EASY) {
            // 简单模式 设定大小为一个小正方形即可
            this.setSize(300, 300);
        } else if (this.mode == Util.MODE_NORMAL) {
            this.setSize(360, 340);
        } else {
            this.setSize(360, 400);
        }

        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("扫雷 - Kaede - 开始游戏！");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 实现判断胜利的函数
    private boolean victory() {
        // 其实本质就是遍历数组 只要所有非雷的部分打开了 那么就是胜利了
        for (int i = 0; i < this.temp_data.length; i++) {
            for (int j = 0; j < this.temp_data[0].length; j++) {
                if (this.source_data[i][j] == -1) continue;
                if (this.temp_data[i][j] != this.source_data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
