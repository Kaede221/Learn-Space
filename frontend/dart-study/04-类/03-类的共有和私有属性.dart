/**
 * 共有属性, 就是可以提供给外部使用的属性
 * 私有属性, 就是只能自己使用的属性, 外部无法访问
 */

// flutter 没有关键字, 只要通过下划线开头, 就是私有属性了
class Person {
  // 只要使用下划线开头, 就是私有的, 外部就不能直接访问了
  String? _name;

  Person({String? name}) {
    this._name = name;
  }

  String? getName() {
    return this._name;
  }
}

void main(List<String> args) {
  // 正常初始化对象
  Person p = Person(name: "Kaede");

  // 不能直接访问 吗? 并不是, 仍然可以正常访问
  // NOTE Dart 的私有不是类私有, 而是库私有. 如果需要一个类的属性是私有的, 则需要把这个类单独抽象到另外的文件中, 并且在最上面import 这就是Dart的私有的特殊之处
  print(p._name);
  print(p.getName());
}
