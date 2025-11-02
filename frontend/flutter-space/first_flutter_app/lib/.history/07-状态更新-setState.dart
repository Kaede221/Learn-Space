import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

// 数据驱动视图, 需要使用setState来更新数据
class MainPage extends StatefulWidget {
  const MainPage({super.key});

  @override
  State<MainPage> createState() => _MainPageState();
}

// 对内的, 负责渲染UI
class _MainPageState extends State<MainPage> {
  // 可以定义一个变量
  int count = 0;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        // 多个元素, 横着放, 使用Row实现
        body: Center(
          child: Row(
            children: [
              TextButton(
                onPressed: () {
                  // 不能直接使用count, 需要包裹一层setState, 传入一个回调函数, 会自动进行处理的.
                  // NOTE 另外有一个小技巧, setState会直接触发更新. 就算内容不写在回调函数里面, 也可以触发视图更新, 但是需要调用setState
                  setState(() {
                    count--;
                  });
                },
                child: Text("-"),
              ),
              // 这里不能写死, 需要是变量
              Text(count.toString()),
              TextButton(
                onPressed: () {
                  setState(() {
                    count++;
                  });
                },
                child: Text("+"),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
