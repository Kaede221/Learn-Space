void main(List<String> args) {
  // NOTE 基础定义与使用
  // 其实就是多个键值对 定义方式如下
  Map<String, String> myMap = {"name": "Kaede"};

  // 无论如何, 这里的name也需要作为字符串进行使用
  print(myMap);

  // 随后, 就可以通过key找到value了
  // 这里需要使用中括号, 和Python一样的
  print(myMap['name']);

  // 找不到的话 会返回null
  print(myMap["Not"]);

  // 可以修改
  myMap["name"] = "Good";
  print(myMap);

  // 可以添加
  myMap["name2"] = "Jog";
  print(myMap);

  // NOTE 常用方法
  // 可以遍历字典
  myMap.forEach((key, value) {
    print("key is ${key}, value is ${value}");
  });

  // 也可以合并字典
  myMap.addAll({"testName": "AAA", "testNamm2": "BBB"});
  print(myMap);

  // 判断某个key是否存在
  print(myMap.containsKey("name"));
  // 判断某个值是否存在
  print(myMap.containsValue("Job1"));

  // 清空字典
  myMap.clear();
  print(myMap);
}
