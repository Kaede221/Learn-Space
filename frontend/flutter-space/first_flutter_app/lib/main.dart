import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

// 滚动组件 SingleChildScrollView 单个组件的滚动
// 可以在单个组件里面, 嵌套多个子组件出来.
class MainPage extends StatefulWidget {
  const MainPage({super.key});

  @override
  State<MainPage> createState() => _MainPageState();
}

class _MainPageState extends State<MainPage> {
  // 需要使用controller绑定滚动布局 进而实现滚动到底部和顶部的功能
  ScrollController _controller = ScrollController();

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.blue),
      ),
      home: Scaffold(
        appBar: AppBar(title: Text("Flutter 组件学习")),
        // NOTE 这里使用stack是为了添加两个按钮, 去顶部的去底部的按钮
        body: Stack(
          children: [
            // 为了布局可以滚动, 可以使用这个组件进行包裹
            SingleChildScrollView(
              child: Column(
                // 相当于map方法
                children: List.generate(
                  100,
                  (index) => Container(
                    margin: EdgeInsets.all(10),
                    color: Colors.blueAccent,
                    height: 100,
                    width: double.infinity,
                    alignment: Alignment.center,
                    child: Text(
                      "我是第 ${index + 1} 个",
                      style: TextStyle(color: Colors.white, fontSize: 28),
                    ),
                  ),
                ),
              ),
            ),

            // 可以放置堆叠组件
            Positioned(
              right: 20,
              top: 20,
              // 为了获取点击事件, 需要添加事件监听
              child: GestureDetector(
                onTap: () => {print("去顶部")},
                child: Container(
                  height: 80,
                  width: 80,
                  alignment: Alignment.center,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(40),
                    color: Colors.deepOrange,
                  ),
                  child: Text(
                    "去顶部",
                    style: TextStyle(color: Colors.white, fontSize: 18),
                  ),
                ),
              ),
            ),
            Positioned(
              right: 20,
              bottom: 20,
              // 为了获取点击事件, 需要添加事件监听
              child: GestureDetector(
                onTap: () {
                  print("去底部");
                  _controller.jumpTo(_controller.position.maxScrollExtent);
                },
                child: Container(
                  height: 80,
                  width: 80,
                  alignment: Alignment.center,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(40),
                    color: Colors.deepOrange,
                  ),
                  child: Text(
                    "去底部",
                    style: TextStyle(color: Colors.white, fontSize: 18),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
