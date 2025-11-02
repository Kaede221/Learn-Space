import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    /**
     * NOTE Column 列, 里面的元素会按照从上到下进行排列, 可以存放多个组件
     */
    return MaterialApp(
      home: Scaffold(
        // NOTE 对于COlumn来说, 大小是趋向于最大的, 父组件的大小直接影响了Column的最终大小和子组件的布局
        body: Column(
          // 主轴居中, Column是竖着的, 所以是竖着的居中 这里和CSS里面的样式差不太多
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,

          // 也可以设置交叉轴的对其方式, 比如全部靠左边
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text("这是第一个文本"),
            TextButton(onPressed: () {}, child: Text("这是一个按钮")),
            Text("这是另外一个文本"),
          ],
        ),
      ),
    );
  }
}
