void main(List<String> args) {
  // NOTE 初始化方法
  // 如果一个变量需要储存多个值, 则需要使用列表, 基础语法如下
  // List 列表名称 = [xxx, xxx]
  // 这里可以直接设置泛型, 如果没有设置, 则代表动态类型, 什么元素都可以往里面放
  List<String> students = ["Kaede", "Yyt"];
  print(students);

  // NOTE 常用方法
  // 最后添加元素
  students.add("Hello");
  print(students);

  // 也可以在最后追加列表
  students.addAll(["1", "2"]);
  print(students);

  // 根据内容移除元素, 只会移除找到的第一个元素
  students.remove("Kaede");
  print(students);

  // 移除最后一个元素
  students.removeLast();
  print(students);

  // 也可以删除对应位置的元素
  students.removeAt(0);
  print(students);

  // 也可以直接删除某个范围的元素
  // 这里的参数代表, 从第几个开始, 移除多少个元素
  students.removeRange(0, 2);
  print(students);

  // 另外也可以循环, 获取里面的元素
  students.addAll(["A", "BB", 'CDD', 'dddd']);
  students.forEach((item) {
    print("item is $item");
  });

  // 也可以判断每个元素是否都满足一定的条件
  print(
    students.every((test) {
      return test.length > 3;
    }),
  );

  // 也可以对元素进行筛选
  print(
    students.where((test) {
      return test.length > 2;
    }).toList(),
  );

  // NOTE 常用属性
  // 可以直接获取列表的一些属性进行使用
  print("列表长度为: ${students.length}");
  print("最后一个元素为: ${students.last}");
  print("第一个元素为: ${students.first}");
  print("是否为空: ${students.isEmpty}");
}
