// Material库是Google提供的一套统一的, 标准的组件库.
// 文字, 排版, 动画等, 都可以直接统一, 它提供了多平台统一的交互体验
import 'package:flutter/material.dart';

// 启动Flutter程序, 需要runApp方法
// 需要传入一个Widget, Flutter的启动就是从调用这个函数开始的
main() => runApp(const MyApp());

// 这个就是根组件, 也是整个应用的根组件
class MyApp extends StatelessWidget {
  // 最新版的写法, 需要提供一个key, 也可以不写, 不过上面就不能写const了
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // 窗口的标题内容, 可以不设置
      // title: 'Flutter Demo',
      // 设置整个窗口的主题内容
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.blue),
      ),
      // 配置应用首页的路由
      home: const MyHomePage(title: '第一个Flutter程序'),
    );
  }
}

// 继承自StatefulWidget, 这代表这是一个有状态组件 (可变)
class MyHomePage extends StatefulWidget {
  // 这个是构造函数
  const MyHomePage({super.key, required this.title});

  // 包含了一个字符串信息
  final String title;

  // 这里没有build方法, 而是把build放入了子组件中. 这是为了提高开发的灵活度
  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  // 只需要维护一个计数器, 所以需要定义一个状态
  int _counter = 0;

  // 实现一个状态自增的方法
  void _incrementCounter() {
    // 下面这个调用顺序为: 先++, 再调用setState方法
    setState(() {
      _counter++;
    });
  }

  // 构建页面的逻辑 第一次创建的时候, 会创建这样的类
  @override
  Widget build(BuildContext context) {
    // Scaffold 是Material库中提供的页面脚手架, 提供了默认的导航栏, 标题和包含主屏幕的body属性.
    return Scaffold(
      // 定义的应用程序栏
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        // 标题内容
        title: Text(widget.title),
      ),
      // center是一个完全居中的组件, 里面的东西都会被居中
      body: Center(
        // 使用了column组件, 这个代表元素是竖着排列的
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          // 里面使用了两个文本, 分别对应提示和数字
          children: <Widget>[
            const Text('你已经点击了:'),
            Text(
              '$_counter',
              style: Theme.of(context).textTheme.headlineMedium,
            ),
            const Text('次'),
          ],
        ),
      ),

      // 这个就是右下角的悬浮按钮
      floatingActionButton: FloatingActionButton(
        // 配置了点击事件以及鼠标移上去的效果
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        // 悬浮按钮里面的内容
        child: const Icon(Icons.add),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
