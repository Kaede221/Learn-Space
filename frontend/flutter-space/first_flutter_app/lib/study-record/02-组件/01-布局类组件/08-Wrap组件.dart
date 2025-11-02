import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  // 封装一个方法, 用来返回一个组件列表
  List<Widget> getChildren() {
    // 生成多个元素 比如生成10个
    return List.generate(10, (index) {
      return Container(width: 100, height: 100, color: Colors.amber);
    });
  }

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Wrap
     * 流式布局, 当子组件在主轴中排列不下的时候, 会自动进行换行.
     * 当子组件是动态生成的时候, 我们会更偏向使用Wrap组件, 确保布局适配
     */
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text("Flutter 组件学习")),
        body: Container(
          // 如果没有给宽高, 则由子组件实现
          width: double.infinity,
          height: double.infinity,

          color: Colors.blueAccent,
          child: Wrap(
            direction: Axis.horizontal,

            // 设置主轴和交叉轴的间距
            spacing: 10,
            runSpacing: 10,

            // 设置主轴的对其方式
            alignment: WrapAlignment.start,

            // 这里我们一般不会写死, 而是使用写好的组件
            children: getChildren(),
          ),
        ),
      ),
    );
  }
}
