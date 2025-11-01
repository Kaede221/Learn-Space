void main(List<String> args) {
  // Dart 中使用var定义变量
  var age = 20;
  print(age);

  age++;
  print(age);

  // 注意, 变量定义以后, 就不允许修改变量的类型了, 第一次会自动进行类型推断
  // age = "Hello World"; 这个会报错
}
