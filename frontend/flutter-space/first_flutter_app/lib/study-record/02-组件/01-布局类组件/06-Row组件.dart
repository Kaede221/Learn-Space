import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Row
     * 和Column是对应的, 不过是横过来的而已.
     * 几乎所有横着的东西都需要用到这个Row组件
     * 
     * 如果内容过多, 就需要使用ListView包裹了
     */
    return MaterialApp(
      home: Scaffold(
        // 通过center让这个row不要在最上面.
        body: Center(
          // 内容太多的时候, 需要使用ListView进行包裹 或者也可以使用SingleChildScrollView
          child: ListView(
            scrollDirection: Axis.horizontal,
            children: [
              Row(
                // 主轴居中, Column是竖着的, 所以是竖着的居中 这里和CSS里面的样式差不太多
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,

                // 也可以设置交叉轴的对其方式, 比如全部靠左边
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Text("这是第一个文本"),
                  TextButton(onPressed: () {}, child: Text("这是一个按钮")),
                  Text("这是另外一个文本"),
                  Text("这是另外一个文本"),
                  Text("这是另外一个文本"),
                  Text("这是另外一个文本"),
                  Text("这是另外一个文本"),
                  Text("这是另外一个文本"),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
