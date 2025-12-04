package main

import "fmt"

func main() {
	// NOTE 基本数据类型
	// 基本的有 数值型, 字符型, 布尔型和字符串
	// 对于数字来说 Go 里面会根据后面的数字来判断数字的存储方式
	var num1 int8 = 10
	fmt.Println("num1 =", num1)

	// 另外, 数字也是有有符号和无符号的区别的
	var num2 uint8 = 20
	fmt.Println("num2 =", num2)

	// 当然 还有小数
	var num3 float32 = 3.1415926
	fmt.Println("pi is", num3)

	// 对于字符来说 一般使用 byte 来储存, 没有对应的数据类型
	// 无法储存汉字
	var ch byte = 'a' // 直接使用单引号表示字符
	fmt.Println("ch =", ch)

	var flag bool = true
	fmt.Println("bool value is", flag)

	// 另外, 根据官方手册, string是一个基本数据类型
	var words string = "Hello World!"
	fmt.Println(words)

	// NOTE 复杂数据类型
	// go 里面也是有指针的; 另外还有数组, 结构体, 管道, 函数, 切片, 接口, 集合类型
	// 这里不展示了 后面都会学到的
}
