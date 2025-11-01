void main(List<String> args) {
  /**
   * Dart 中, 会通过静态类型检查, 提前暴露运行时空指针, 直接报错
   * 这样代码的质量就会高一些了
   */
  // Dart 中提供了很多的空安全操作符
  // 可空类型 在类型后面加一个问号
  String? s = null;
  print(s);

  // 这个时候, 如果直接调用方法 就会直接报错了
  // s.startsWith("A");
  // 这里就需要用到安全访问了 只有不会空, 才会进行后续操作
  // 如果为空, 则直接返回空, 否则运行后续的操作
  print(s?.startsWith("A"));

  // 不过, 开发者也可以直接断言变量非空, 除非运行时崩溃
  // 下面这个代码会报错
  /**
      Unhandled exception:
      Null check operator used on a null value
      #0      main (file:///D:/Documents/WorkSpace/Learn-Space/frontend/dart-study/01-%E5%9F%BA%E7%A1%80/10-%E7%A9%BA%E5%AE%89%E5%85%A8%E6%9C%BA%E5%88%B6.dart:18:10)
      10-空安全机制.dart:18
      #1      _delayEntrypointInvocation.<anonymous closure> (dart:isolate-patch/isolate_patch.dart:312:33)
      #2      _RawReceivePort._handleMessage (dart:isolate-patch/isolate_patch.dart:193:12)
   */
  // print(s!.startsWith("A"));

  // 当然, 这个也存在空合并运算符
  // 如果前者为空, 则返回后者, 否则返回前者
  print(s ?? "s is empty");
}
