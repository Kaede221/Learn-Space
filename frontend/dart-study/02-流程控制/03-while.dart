void main(List<String> args) {
  // 和C++一样, 这里仅仅做一个简单的演示
  List<String> names = ["A", "BB", "CCC", "DDDD"];
  int index = 0;
  while (index < 3) {
    print(names[index]);
    index++;

    // 可以使用continue和break语句
    if (index == 1) continue;
    if (index == 2) break;
  }
}
