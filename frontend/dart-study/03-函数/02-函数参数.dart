// 这里分为必传参数, 可选位置参数以及可选命名参数

add(num num1, num num2) {
  return num1 + num2;
}

// 如果想写可选位置参数, 则必须在必传参数后面, 使用中括号进行包裹
test(num num1, [String? s1, String? s2 = "Good"]) {
  return "${num1}" + (s1 ?? "") + (s2 ?? "");
}

// 可选命名参数则是使用大括号进行包裹
test2(num num1, {String? s1, String? s2}) {
  return "${num1}" + (s1 ?? "") + (s2 ?? "");
}

void main(List<String> args) {
  print(test(10));

  // 命名的参数可以直接传递
  // 传递的时候, 按照参数名冒号参数值进行传递
  print(test2(10, s1: "Good", s2: "Test"));
}
