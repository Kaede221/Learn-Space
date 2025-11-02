import 'package:flutter/material.dart';

void main(List<String> args) {
  // 在main方法中, 需要使用runApp
  // 并且我们需要使用MaterialApp这个组件 这是最基础的一个组件
  runApp(
    MaterialApp(
      // 可以直接传入属性了
      title: "Flutter 组件初体验",
      // 设置theme
      theme: ThemeData(
        // 通过这个属性, 可以配置背景颜色
        scaffoldBackgroundColor: const Color.fromARGB(255, 62, 75, 86),
      ),
      // 需要设置窗口的主体内容 不然是没有东西的, 啥都看不到
      home: Scaffold(),
    ),
  );
}
