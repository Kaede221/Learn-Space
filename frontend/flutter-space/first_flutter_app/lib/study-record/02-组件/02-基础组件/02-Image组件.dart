import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Image 图片组件
     * 包含项目资源目录中的图片, 网络图片和本地储存保存的图片, 或者是内存中的图片
     * 
     * 图片本身就有宽高属性, fit, alignment对齐方式以及是否重复repeat
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
              // * 在这里写学习内容会好很多 * //
              children: [
                // 如果需要使用资源图片, 需要进行配置
                // 1. 配置 pubspec.yaml 文件
                // 2. 放置图片到对应的文件夹
                // 3. 代码中使用 注意, 这里的图片是从lib目录开始找的, 其实就是相对项目根目录的路径
                // 宽和高只要设置了, 图片默认按照最合适的方式进行缩放
                Image.asset("lib/images/testImage.jpg", width: 300),

                // 网络图片 直接使用图片的链接就行 (下面的图片可能失效)
                // 目前是Windows和web, 移动端的话需要配置网络权限
                Image.network(
                  "https://free.picui.cn/free/2025/08/02/688dc97b33e39.jpg",
                  width: 100,
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
