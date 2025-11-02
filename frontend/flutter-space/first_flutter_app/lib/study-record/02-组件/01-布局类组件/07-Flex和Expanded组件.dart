import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Flex
     * 弹性布局, 允许按照某一个主轴排列子组件, 并且控制尺寸比例和空间分配
     */
    return MaterialApp(
      home: Scaffold(
        // 通过center让这个row不要在最上面.
        body: Center(
          child: Flex(
            // 首先需要设置方向, 告诉布局, 方向是什么
            direction: Axis.horizontal,
            mainAxisAlignment: MainAxisAlignment.center,

            children: [
              // 子组件, 使用Expanded和Flexible控制空间分配
              // NOTE Flexible 和 Expanded 不太一样, 需要设置更多的东西; Expanded 更常用
              // 可以这么理解, Expanded会自动变大, 只有别的元素也有flex属性, 才会进行判断
              Expanded(
                // 可以通过flex设置占比
                flex: 1,
                child: Container(
                  decoration: BoxDecoration(color: Colors.amber),
                  child: Text("Upper Container"),
                ),
              ),
              Expanded(
                flex: 2,
                child: Container(
                  decoration: BoxDecoration(color: Colors.blue),
                  child: Text("Still Good!"),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
