import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Stack 层叠布局
     * 允许把多个组件按照Z轴的方向进行叠加排列
     * 
     * NOTE Positioned 组件 定位
     * 它可以给子组件实现精确的定位控制. 另外, 这个组件必须作为Stack的直接子组件使用, 否则不允许使用
     * 它通过上下左右, 将元素固定在某个地方
     */
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text("Flutter 组件学习")),
        // Stack 组件中, 直接写的话, 东西会直接堆在一起
        body: ListView(
          scrollDirection: Axis.vertical,
          children: [
            Text("默认的展示位置"),
            Stack(
              // 通过这个示例, 就可以看到, 堆叠布局默认方向是左上角
              children: [
                Container(width: 300, height: 300, color: Colors.red),
                Container(width: 200, height: 200, color: Colors.blue),
                Container(width: 100, height: 100, color: Colors.amber),
                Container(width: 50, height: 50, color: Colors.green),
              ],
            ),
            Text("可以配置对其位置"),
            Stack(
              // 另外, 可以配置位置
              alignment: Alignment.center,
              // 通过这个示例, 就可以看到, 堆叠布局默认方向是左上角
              children: [
                Container(width: 300, height: 300, color: Colors.red),
                Container(width: 200, height: 200, color: Colors.blue),
                Container(width: 100, height: 100, color: Colors.amber),
                Container(width: 50, height: 50, color: Colors.green),
              ],
            ),

            // Stack 是没有宽度的, 如果需要设置宽度, 则需要给一个Container包裹, 然后设置宽度.
            // 另外, 可以单独指定某些元素的位置
            Text("可以设置某些元素的相对位置"),
            Container(
              width: double.infinity,
              height: 500,
              color: Colors.blueGrey,
              child: Stack(
                alignment: Alignment.center,
                children: [
                  Positioned(
                    // 通过Positioned, 设置相对位置
                    top: 0,
                    left: 0,
                    child: Container(
                      width: 100,
                      height: 100,
                      color: Colors.blue,
                    ),
                  ),
                  Positioned(
                    right: 0,
                    bottom: 0,
                    child: Container(
                      width: 200,
                      height: 200,
                      color: Colors.red,
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
