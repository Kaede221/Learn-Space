import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        // 对于Container组件来说:
        /**
         * 可以通过多种方式自定义大小
         * 明确的宽高 > constraints 约束 > 父组件约束 > 自适应组件大小
         * 可以设置内外边距
         * 可以通过decoration属性实现视觉效果, 但是和color属性互斥
         */
        body: Container(
          // 可以控制内部元素的位置 这个就是居中
          alignment: Alignment.center,
          // 也可以设置大小
          width: 200,
          height: 200,

          // 设置外边距 这里的all就是四个方向都有一定的距离
          margin: EdgeInsets.all(20),

          // color 就是背景色 不是文本颜色
          // color: Colors.blue,

          // 旋转效果 这里传入的是一个弧度, 不是角度
          transform: Matrix4.rotationZ(0.05),

          // color不够, 所以我们使用另外一个装饰器
          decoration: BoxDecoration(
            // 背景颜色
            color: Colors.blue,
            // 圆角
            borderRadius: BorderRadius.circular(20),
            border: Border.all(width: 3, color: Colors.amber),
            boxShadow: [BoxShadow(offset: Offset(1, 1), blurRadius: 5)],
          ),
          child: Text(
            "Hello World",
            style: TextStyle(color: Colors.white, fontSize: 20),
          ),
        ),
      ),
    );
  }
}
