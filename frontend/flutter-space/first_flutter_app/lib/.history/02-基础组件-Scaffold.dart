import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(
    MaterialApp(
      title: "Flutter 组件初体验",
      theme: ThemeData(
        scaffoldBackgroundColor: const Color.fromARGB(255, 255, 255, 255),
      ),
      // NOTE Scaffold 基础组件
      // 它是用于构建Material Design风格页面的核心布局组件, 提供了标准的, 灵活配置的页面骨架
      /** 常见属性
       * appBar 页面顶部的导航栏, 用来显示标题, 导航按钮和操作菜单
       * body 页面的主要内容区域, 可以放置其他的任何组件, 是页面的核心
       * bottomNavigationBar 底部导航栏, 方便用户进行多页面切换
       * backgroundColor 背景颜色
       * floatingActionButton 悬浮操作按钮
       * 其他...
       */
      home: Scaffold(
        appBar: AppBar(title: Text("头部区域")),
        body: Center(child: Text("中部区域")),
        // 底部区域如果不设置高度, 就看不到效果
        // 可以使用Container, 但是会报, 所以还是用SizedBox吧
        bottomNavigationBar: SizedBox(
          height: 80,
          child: Center(child: Text("底部区域")),
        ),
      ),
    ),
  );
}
