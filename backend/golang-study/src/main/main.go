package main

import "fmt"

func main() {
	// 数据类型 分为基本数据类型和复杂数据类型
	// 基本的有 数值型, 字符型, 布尔型和字符串
	var num1 int8 = 10
	fmt.Println("num1 =", num1)

	// 对于字符来说 一般使用 byte 来储存, 没有对应的数据类型
	var ch byte = 'a' // 直接使用单引号表示字符
	fmt.Println("ch =", ch)
}
