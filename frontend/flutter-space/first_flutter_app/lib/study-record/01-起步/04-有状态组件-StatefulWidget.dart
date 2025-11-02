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

// 为了创建有状态组件, 需要创建两个类 一个是继承有状态组件 用来创建State对象
// 另外还要创建一个State类, 管理可变数据和业务逻辑, 并且实现build方法
class MainPage extends StatefulWidget {
  const MainPage({super.key});

  // 核心作用: 创建state作用
  @override
  State<StatefulWidget> createState() {
    return _MainPageState();
  }
}

// 第一个类需要返回 所以需要定义第二个类
// 一般来说, 我们通过下划线+原来的组件名称+State 构成组件名称
// 这个类的作用为: 管理数据, 处理业务逻辑, 渲染视图
class _MainPageState extends State<MainPage> {
  // 需要实现 build 方法
  @override
  Widget build(context) {
    return MaterialApp(
      title: "有状态组件",
      home: Scaffold(
        appBar: AppBar(title: Text("有状态组件 顶部区域")),
        body: Center(child: Text("中间区域")),
        bottomNavigationBar: SizedBox(
          height: 80,
          child: Center(child: Text("底部区域")),
        ),
      ),
    );
  }
}
