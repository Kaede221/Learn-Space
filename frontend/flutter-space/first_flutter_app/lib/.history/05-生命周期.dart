import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

// 无状态组件的生命周期只有build, 组件创建的时候, 或者父组件重写调用的时候才会调用
class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(body: Center(child: Text("Hello World"))),
    );
  }
}

// 有状态组件中, 生命周期按照:
// createState
// initState
// didChangeDependencies
// build 只要更新, 就会调用
// 销毁的时候, deactiveate, dispose调用
class MainPage2 extends StatefulWidget {
  const MainPage2({super.key});

  @override
  State<MainPage2> createState() => _MainPage2State();
}

class _MainPage2State extends State<MainPage2> {
  @override
  Widget build(BuildContext context) {
    return Container();
  }
}
