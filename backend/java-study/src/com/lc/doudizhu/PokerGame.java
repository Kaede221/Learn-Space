package com.lc.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    // 创建一个数组 作为牌盒
    // 静态里面只能访问静态, 所以需要加上static
    static ArrayList<String> list = new ArrayList<>();

    // 提供准备牌的方法
    // 使用静态代码块
    static {
        // 定义花色
        String[] color = {"♦", "♣", "♥", "♠"};
        // 牌上的数字
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 构建卡牌
        for (String colorItem : color) {
            for (String numberItem : number) {
                // 放入牌盒中
                list.add(colorItem + numberItem);
            }
        }

        // 额外 加上一个大小王
        list.add("大王");
        list.add("小王");
    }

    // 创建对象就会调用空参构造
    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        // 这里需要准备4个盒子, 用来发牌, 虽然是三个人, 但是还有底牌需要储存
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 遍历牌盒, 得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            // 这里需要用到索引
            String poker = list.get(i);

            // 判断
            if (i < 3) {
                lord.add(poker);
                continue;
            }

            // 否则就是轮流发牌 i % 3 == 0, 1, 2 即可
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        // 看牌
        // 其实就是遍历集合
        lookPoker("底牌", lord);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
    }

    /**
     * 实现看牌的方法
     *
     * @param name      玩家的名字
     * @param arrayList 每位玩家的牌
     */
    public void lookPoker(String name, ArrayList<String> arrayList) {
        System.out.print(name + ": ");
        for (String poker : arrayList) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
