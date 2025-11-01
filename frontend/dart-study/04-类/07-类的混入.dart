// Dart 允许在不适用传统继承的情况下, 往类里面添加新的功能

// 首先, 需要使用 mixin 关键字定义一个对象
// 随后 通过 with 关键字, 把定义的对象混入到当前的对象当中
// 支持多个mixin, 后来居上, 如果重复, 后面混入的会覆盖前面的

// 定义一个混入对象
mixin Base {
  // 方法 在混入对象里面声明
  void song(String name) {
    print("$name 在唱歌");
  }
}

// 使用with, 混入
class Student with Base {
  String? name;
  int? age;
  Student({this.name, this.age});
}

class Teacher with Base {
  String? name;
  int? age;
  Teacher({this.name, this.age});
}

void main(List<String> args) {
  Student s = Student(name: "Kaede", age: 18);
  // 这个时候, 已经又song方法了, 可以直接调用
  s.song(s.name!);

  Teacher t = Teacher(name: "Yyt", age: 19);
  t.song(t.name!);
}
