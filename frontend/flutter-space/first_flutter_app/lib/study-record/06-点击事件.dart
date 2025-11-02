import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Center(
          // 这是最常用的手势判断组件
          // child: GestureDetector(
          //   // 这个组件其实看不出来什么东西, 但是只要注册了, 就可以设置点击事件了
          //   onTap: () {},
          //   child: Text("这个文本注册了点击事件"),
          // ),

          // 另外, 有一些组件本身就支持点击事件 比如按钮
          // 当然还有别的, 比如视觉反馈组件, 各种按钮组件和其他的交互组件, 都是直接支持点击的
          child: TextButton(
            onPressed: () {
              print('Hello World');
            },
            child: Text("我是点击按钮"),
          ),
        ),
      ),
    );
  }
}
