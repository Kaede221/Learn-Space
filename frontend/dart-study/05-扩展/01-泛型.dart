/**
 * Dart 中允许使用类型参数, 限定类型的同时, 让类型更加灵活, 让代码更易于维护
 */

// 例如 我们可以定义泛型方法
// 这个方法传入什么类型, 就会自动推断为什么类型
T getValue<T>(T value) {
  return value;
}

// 当然, 类也可以使用泛型.
class Student<T> {
  T? name;

  Student({this.name});
}

void main(List<String> args) {
  print(getValue(10));

  Student s = Student<String>(name: "Kaede");

  // 这个时候, s的name会自动推断为字符串类型
  print(s.name);
}
