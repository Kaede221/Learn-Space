package main

import "fmt"

func main() {
	// Go 语言中如何定义变量呢?
	// 直接按照下面的方法定义即可
	// 这个的意思是, 定义一个变量i, 类型是int, 值为10
	var i int = 10

	// 也可以先定义后赋值
	var i2 int
	i2 = 100

	// 如果没有初始化, 则使用默认值
	// 整数类型int的默认值为0
	var i3 int

	// 输出的时候, 这个和Python的输出规则一样
	fmt.Println("Hello World", i, i2, i3)

	// 另外, 编译器也可以自动推断类型
	var num = 10.11
	fmt.Println("自动推断类型", num)

	// 也可以直接省略var 但是需要一个冒号, 这个也叫做声明 定义变量, 等价于var name string = "xxx"
	name := "Kaede Shimizu"
	fmt.Println("省略了var", name)
}
