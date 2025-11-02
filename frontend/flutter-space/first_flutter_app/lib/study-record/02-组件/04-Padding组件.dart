import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Padding 组件
     * 其实就是一个内边距组件, 不过要求内边距是必填项了而已
     */
    return MaterialApp(
      home: Scaffold(
        body: Container(
          color: Colors.blue,
          // 可以添加内边距
          child: Padding(
            padding: EdgeInsetsGeometry.all(10),
            child: Container(width: 300, height: 320, color: Colors.yellow),
          ),
        ),
      ),
    );
  }
}
