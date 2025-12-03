import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(MainPage());
}

// 输入框是动态的 有状态
// 比如说需要搜索, 或者是实现一个登陆页面, 那么就会需要一个输入框组件
// 一个输入框需要一个controller, 用来获取, 设置输入框的内容及监听变化
// 另外, 还可以设置外观, 样式, 最大行数之类的
// 可以通过onChanged和onSubmitted获取输入内容的回调和提交的回调方法
class MainPage extends StatefulWidget {
  const MainPage({super.key});

  @override
  State<MainPage> createState() => _MainPageState();
}

class _MainPageState extends State<MainPage> {
  // 两个输入框, 所以需要设置两个controller
  final TextEditingController _accountController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        // 简单设置一个主题颜色, 好看一些
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.blue),
      ),
      home: Scaffold(
        appBar: AppBar(title: Text("Flutter 组件学习")),
        // Stack 组件中, 直接写的话, 东西会直接堆在一起
        body: Container(
          alignment: Alignment.center,
          // 设置一个内边距
          padding: EdgeInsets.all(20),
          child: SingleChildScrollView(
            scrollDirection: Axis.vertical,
            child: Column(
              spacing: 10,
              // 简单实现一个登陆页面
              children: [
                Text(
                  "登录",
                  style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
                ),

                TextField(
                  // 配置controller
                  controller: _accountController,
                  // 需要调整样式
                  decoration: InputDecoration(
                    // 可以设置提示文本 不是placeholoder了
                    hintText: "请输入账号",
                    // 颜色叫做fillColor
                    fillColor: const Color(0xFFF5F5DE),
                    // 还需要设置允许展示填充色, 否则不会显示填充颜色的
                    filled: true,
                    // 可以设置没有边框, 但是有圆角效果
                    border: OutlineInputBorder(
                      borderSide: BorderSide.none,
                      borderRadius: BorderRadius.circular(25),
                    ),
                  ),
                ),
                TextField(
                  controller: _passwordController,
                  decoration: InputDecoration(
                    hintText: "请输入密码",
                    fillColor: const Color(0xFFF5F5DE),
                    filled: true,
                    border: OutlineInputBorder(
                      borderSide: BorderSide.none,
                      borderRadius: BorderRadius.circular(25),
                    ),
                  ),
                  // 密码 一般是看不到的, 需要设置一下属性
                  obscureText: true,
                  onSubmitted: (str) => {
                    // 对于 submit, 只要回车 就会获取输入框里面的东西了
                    print(str),
                  },
                ),

                // 按钮组件 也可以进行美化, 使用Container包裹就好
                Container(
                  height: 50,
                  width: double.infinity,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(25),
                    color: Colors.black,
                  ),
                  child: TextButton(
                    onPressed: () {
                      // 可以直接通过controller 获取两个输入框里面的内容
                      print("登录账号: ${_accountController.text}");
                      print("登录密码: ${_passwordController.text}");
                    },
                    child: Text("登录", style: TextStyle(color: Colors.white)),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
