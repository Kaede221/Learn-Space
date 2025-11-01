void main(List<String> args) {
  // NOTE 算数运算符
  // 其实就是加减乘除取余数取整数
  double num1 = 1.52;
  double num2 = 2.56;

  print("num1 + num2 = ${num1 + num2}");
  print("num1 - num2 = ${num1 - num2}");
  print("num1 * num2 = ${num1 * num2}");
  // 注意, 这里的除法不是整除, 是正常的相除
  print("num1 / num2 = ${num1 / num2}");

  // 如果需要整除, 需要使用波浪线
  print("num1 ~/ num2 = ${num1 ~/ num2}");
  // 取余数还是百分号
  print("num1 % num2 = ${num1 % num2}");

  // NOTE 赋值运算符
  // 最简单的就是等号, 不过还有别的, 比如+=, -=, /=, *= 之类的
  num1 += num2;
  num2 -= num1;
  num1 /= num2;
  num2 *= num1;
  print("num1 = ${num1}, num2 = ${num2}");

  // NOTE 比较运算符
  // 自然就是大于小于之类的比较了
  print("num1 > num2 ${num1 > num2}");
  print("num1 >= num2 ${num1 >= num2}");
  print("num1 < num2 ${num1 < num2}");
  print("num1 <= num2 ${num1 <= num2}");
  print("num1 != num2 ${num1 != num2}");
  print("num1 == num2 ${num1 == num2}");

  // NOTE 逻辑运算符
  // 其实就是多个条件, 和C++一样, && || !, 与或非, 这里不说了
}
