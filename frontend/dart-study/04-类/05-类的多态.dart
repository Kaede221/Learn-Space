/**
 * 多态, 就是同一个操作, 作用于不同的对象, 可以得到不同的效果
 */

// 首先, 需要定义一个父类
class Human {
  String? name;
  int? age;
  Human({this.age, this.name});

  void show() {
    print("人类 ${name} ${age}");
  }
}

// 定义两个类 都继承自这个父类
class Student extends Human {
  Student({String? name, int? age}) : super(age: age, name: name);

  // 实现不一样的方法
  @override
  void show() {
    print("学生 $name $age");
  }
}

class Teacher extends Human {
  Teacher({String? name, int? age}) : super(age: age, name: name);

  @override
  void show() {
    print("老师 $name $age");
  }
}

// 多态就是一个方法, 可以定义一个接收父类的方法出来
void showHumanInfo(Human targetHuman) {
  targetHuman.show();
}

void main(List<String> args) {
  // 分别定义老师和学生
  Teacher t = Teacher(name: "Lily", age: 18);
  Student s = Student(name: "Mike", age: 10);

  showHumanInfo(t);
  showHumanInfo(s);
}
