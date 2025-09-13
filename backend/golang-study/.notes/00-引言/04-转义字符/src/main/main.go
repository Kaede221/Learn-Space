package main

// 这个包主要提供格式化和输入输出的函数
import "fmt"

func main() {
	// 转义字符和其他语言基本一摸一样, 直接都展示一下
	// 这个是换行符
	fmt.Println("Hello\nWorld")

	// 这个是制表符
	fmt.Println("Name\tKaede\nAge\t18")

	// 回车, 就是从当前行的前面开始输出, 覆盖以及输出的东西
	fmt.Println("Kaede Shimizu\rHello")

	// 如果要输出引号, 就是反斜杠双引号就行.
	fmt.Println("这是 \"My World\"")
}
