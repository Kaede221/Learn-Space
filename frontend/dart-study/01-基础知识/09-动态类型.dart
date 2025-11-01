void main(List<String> args) {
  // 动态类型, 运行变量在运行的时候修改类型
  dynamic test = "Hello World";
  print(test);

  // 可以直接修改类型
  test = 123;
  print(test);

  // 有好处也有坏处, 好就好在开发的时候不会报错, 并且兼容多种类型, 坏就坏在无法确认是否可以调用某个方法, 存在某个属性
}
