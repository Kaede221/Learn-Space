void main(List<String> args) {
  // NOTE 第一种声明方式 const
  // 常量就是不允许修改的变量, 比如圆周率PI
  const PI = 3.1415926535;
  print(PI);

  // 如果尝试修改 就会报错
  // PI = 5; 代码直接报错了, 不信取消注释看看

  // NOTE 第二种声明方式 final
  // 比如当前时间这种, 可以使用final进行修饰 一旦确定了就不能修改了
  final time = DateTime.now();
  print(time);

  // 如果想要再次修改, 就不允许修改了
  // time = DateTime.now();

  // NOTE 区别是, const定义编译时不会修改的东西, final定义运行时不会修改的东西
  // NOTE 上面这种时间, 如果使用const就会报错, 因为时间是变的.
}
