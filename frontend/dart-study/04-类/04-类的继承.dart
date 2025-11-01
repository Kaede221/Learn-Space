/**
 * 继承, 就是让一个类拥有父类的继承
 * Dart中式单继承, 只能继承一个类的属性和方法
 */

class Human {
  double? height;
  double? wight;

  Human({this.height, this.wight});

  void show() {
    print("身高 ${height}, 体重 ${wight}");
  }
}

// 可以直接继承上面的类
class Student extends Human {
  // 这个时候, 已经有了属性了
  // 子类中, 可以通过override对一些方法进行重写
  // NOTE 子类不会继承父类的构造方法, 必须通过super调用父类构造函数, 保证父类正确初始化.
  // 注意, 需要冒号super调用父类的构造函数
  Student({double? height, double? wight})
    : super(wight: wight, height: height);

  @override
  void show() {
    super.show();
    print("学习中");
  }
}

void main(List<String> args) {
  Student s = Student(height: 10, wight: 100);
  s.show();
}
