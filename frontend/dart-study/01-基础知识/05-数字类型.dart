void main(List<String> args) {
  // 可以使用int double num
  // int是整数, num是通用数字, double是小数

  // 使用是一样的, 可以直接使用类型 变量名 = xxx
  int num1 = 100;
  print("num1 = ${num1}");

  double num2 = 3.1415926;
  print("num2 = ${num2}");

  // 也可以使用num, 全部支持
  num num3 = 666666.666;
  print("num3 = $num3");

  // NOTE 注意, double和int不能直接赋值
  // num1 = num2;
  // num2 = num1;

  // 如果必须要赋值, 则需要调用上面的方法, 转换到对应的类型.
  num1 = num2.toInt();
  print(num1);

  // 但是和num的话就可以了
  num3 = num2;
  print("new num3 is $num3");
}
