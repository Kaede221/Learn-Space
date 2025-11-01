/**
 * 类的多态还可以通过抽象类和接口实现
 */

// 需要使用abstract关键字声明抽象类 (没有实现体, 只有方法的定义, 返回值, 没有实现)
// 随后, 需要使用 implements 关键字继承并且实现抽象类

// 首先 定义抽象类
abstract class Human {
  // 不写具体的实现
  void show();
}

// 实现这个抽象类
class Student implements Human {
  @override
  void show() {
    // 实现方法
    print("Student");
  }
}

void main(List<String> args) {
  Student s = Student();
  s.show();

  // 不能直接实例化抽象类
  // Human h = Human();
}
