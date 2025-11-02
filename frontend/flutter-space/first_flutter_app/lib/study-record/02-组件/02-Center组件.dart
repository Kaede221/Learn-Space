import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE CENTER 组件
     * 作用就是让字组件, 在父组件的空间中水平, 垂直居中
     */
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Center(child: Text("居中组件"))),
        // 居中组件可以直接使用 但是需要注意, center是不能设置宽高的.
        // 另外, center会尽可能的占满父组件的空间
        body: Center(
          // 这里直接使用container来绘制, 不然的话就看不太出来一个盒子了
          child: Container(
            alignment: Alignment.center,
            height: 100,
            width: 100,
            decoration: BoxDecoration(color: Colors.blueAccent),
            child: Text(
              "Good Job!",
              style: TextStyle(
                color: Colors.white,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
        ),
      ),
    );
  }
}
