import 'package:flutter/material.dart';

/// Flutter 自定义组件
/// 主要分为无状态组件和有状态组件
///
/// 无状态组件一旦创建, 内部状态不可变; 否则可变
/// 无状态组件用于静态内容展示, 外观仅由配置参数决定
/// 主要是build方法 代码结构式单个类
///
/// 有状态则是可以变化的, 生命周期更加复杂, 包含状态创建, 更新和销毁
/// 代码由两个关联的类实现, 组件本身和单独的状态类

void main(List<String> args) {
  runApp(MainPage());
}

// 把之前的框架 抽象为一个无状态组件
class MainPage extends StatelessWidget {
  // 加key是为了可以热更新
  const MainPage({super.key});

  // 需要重写build方法
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "无状态组件",
      home: Scaffold(
        appBar: AppBar(title: Text("顶部区域")),
        body: Center(child: Text("中间区域")),
        bottomNavigationBar: SizedBox(
          height: 80,
          child: Center(child: Text("底部区域")),
        ),
      ),
    );
  }
}
