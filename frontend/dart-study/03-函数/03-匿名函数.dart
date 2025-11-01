// 匿名函数, 就是声明一个没有名称的函数, 赋值给变量, 进而进行调用
Function testFunc = () {
  print("Test Func!");
};

// 求和函数就可以进行简化了
Function add = (num num1, num num2) => num1 + num2;

void main(List<String> args) {
  // 随后就可以直接调用这个匿名函数了
  testFunc();
  print(add(10, 20));
}
