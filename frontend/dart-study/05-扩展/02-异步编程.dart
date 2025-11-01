// Dart 可以说直接把JS抽象出来了
// 我们可以直接操作微队列以及事件队列了

// NOTE Future 类型
// 类似于Promise, 代表了一个异步操作的最终结果
void main(List<String> args) async {
  Future f = Future(() {
    // return "Hello"; 这个是成功状态, 成功状态下不显示失败的结果
    return Exception("错误啦");
  });

  // 没有抛出异常, 就是成功状态
  f.then((value) {
    print(value);
  });

  // 抛出异常了, 则接收错误状态
  // 没有错误则不会执行
  f.catchError((onError) {
    print(onError.toString());
  });

  // 另外, Future可以使用链式调用 和JS一样
  Future(() {
        return "Success";
      })
      .then((val) {
        print(val);
      })
      .catchError((err) {});

  // 最后, 还可以使用async和await
  // 和JS一样, 至少保证在最外层函数写了async 否则用不了
  String res = await Future(() {
    return "Good";
  });

  print("await val is $res");
}
