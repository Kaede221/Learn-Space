// 可以通过构造函数 直接给类的属性赋值, 就不用一个一个的写了

class Person {
  // 这里需要提供默认值, 否则会报错的
  String? name = "";
  int? age = 0;

  // 默认构造函数
  // 传入的是可选命名参数, 所以需要使用大括号括起来
  Person({String? name, int? age}) {
    // 需要给自己
    this.name = name;
    this.age = age;
  }

  // 命名构造函数 其实就是自定义一个名字, 把这个自定义名字的函数作为构造函数
  // 命名构造函数可以有无限多个, 可以和默认构造函数同时存在
  Person.MyInit({String? name, int? age}) {
    this.name = name;
    this.age = age;
  }

  // 另外, 构造函数还有一个语法糖, 一种更加简单的写法.
  // 直接按照下面这种就行.
  // 可以没有前面的Person. 这里写是因为上面定义了默认构造函数了, 所以这里就不写了
  Person.MyInit2({this.name, this.age});

  study() {
    print("${this.name} 在学习");
  }
}

void main(List<String> args) {
  Person p = Person(name: "Kaede", age: 18);
  p.study();

  // 可以使用另一个构造函数
  Person p2 = Person.MyInit(name: "Good", age: 1);
  p2.study();

  // 语法糖的实例化时一样的
  Person p3 = Person.MyInit2(name: "匿名", age: -1);
  p3.study();
}
