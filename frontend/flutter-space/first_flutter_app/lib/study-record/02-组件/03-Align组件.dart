import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Align 组件
     * 作用就是精确的控制其子组件在父组件的对其方式
     * 有alignment, widthFactor和heightFactor属性
     * 新的属性是一种因子, 设置以后, align的宽度就是子组件的宽度/高度乘以因子, 1的话就是直接占满了
     * 
     * center组件时Align组件的特例, 当需要把元素放在某个角落的时候, Align会比较好用
     */
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Center(child: Text("居中组件"))),
        // 对于align来说, 默认就是居中
        body: Container(
          color: Colors.blue,
          child: Align(
            // 可以设置各种位置
            alignment: Alignment.bottomCenter,

            // 可以设置宽度和高度因子
            // 如果都设置为1, 则在左上角, 因为大小一样了.
            widthFactor: 1,
            heightFactor: 1,
            child: Icon(Icons.star, size: 150, color: Colors.amber),
          ),
        ),
      ),
    );
  }
}
