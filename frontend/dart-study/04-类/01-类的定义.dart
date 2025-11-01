// Dart 中的类就是class, 包含了属性和方法
// 定义的方式如下

class Person {
  String name = "";
  int age = 0;

  void study() {
    print("${name}在学习");
  }
}

void main(List<String> args) {
  // 实例化对象和C++一样
  Person p = Person();
  p.name = "Kaede";
  p.study();
}
