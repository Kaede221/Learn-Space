import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Text 文本组件
     */
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text("Flutter 组件学习")),
        // Stack 组件中, 直接写的话, 东西会直接堆在一起
        body: Center(
          child: SingleChildScrollView(
            scrollDirection: Axis.vertical,
            child: Column(
              spacing: 20,
              children: [
                // 默认的文本样式
                Text("123"),
                // 可以对文本进行额外的装饰效果
                Text(
                  "Good",
                  style: TextStyle(
                    color: Colors.lightBlue,
                    fontSize: 30,
                    // 斜体
                    fontStyle: FontStyle.italic,
                    fontWeight: FontWeight.bold,
                    // 下划线
                    decoration: TextDecoration.underline,
                    decorationColor: Colors.red,
                  ),
                ),

                // 如果内容过多, 可以设置换行或者隐藏
                // 其实默认来说就是会自动换行的
                Text("这句话很长这句话很长这句话很长这句话很长这句话很长这句话很长这句话很长这句话很长"),

                // 无论如何, 也可以设置最多显示多少行
                Text(
                  "这句话很长这句话很长这句话很长这句话很长这句话很长这句话很长这句话很长这句话很长",
                  maxLines: 1,
                  // 设置这个属性, 可以让后面多三个点点, 代表隐藏内容
                  overflow: TextOverflow.ellipsis,
                ),

                // 如果一个文本里面有多种样式, 可以配合 Text.rich + TextSpan 来实现
                Text.rich(
                  TextSpan(
                    // children代表往原来的文本后面进行追加
                    children: [
                      TextSpan(
                        text: "Flutter!",
                        style: TextStyle(color: Colors.green),
                      ),
                    ],
                    text: "Hello ",
                    style: TextStyle(
                      color: Colors.red,
                      fontSize: 25,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
