void main(List<String> args) {
  // Dart 中, 如果需要记录字符串, 则使用String
  // 这个不能用var, 而是使用下面这种
  // 无论如何, 其实还是一个变量
  String text = "今天是个好日子";
  print(text);

  // 变量, 自然可以修改
  text = "明天也是一个好日期";
  print(text);

  // Dart和js一样, 支持单双引号, 都是字符串的意思.
  text = 'Good Job';
  print(text);

  // NOTE 模板字符串
  // 比如我需要显示当前时间, 那么就可以使用模板字符串了
  final currentTime = DateTime.now();
  // 模板字符串就是在正常字符串里面, 使用dollar符进行框起来即可.
  // 可以说和JS基本一样, 不过这里的大括号是可以省略的 (推荐保留, 不然不够清晰)
  print("现在的时间是 ${currentTime}");
  // 如果需要使用doller符, 则加上反斜杠
  print("这是一个doller符 \$");
}
