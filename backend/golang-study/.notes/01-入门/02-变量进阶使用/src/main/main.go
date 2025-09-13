package main

import "fmt"

// 在外面可以声明全局变量
// var g1 = 100
// var g2 = "Test"
// 不过这样写比较繁琐, 我们更加推荐另外一种写法
var (
	g1 = 100
	g2 = 900
	g3 = "Shimizu"
)

func main() {
	// 可以一次性声明多个变量, 使用逗号进行分割
	var n1, n2, n3 int
	fmt.Println("n1, n2, n3:", n1, n2, n3)

	// 另外, 类型不一样也是可以的
	var nn1, name, nn3 = 100, "Kaede", 888
	fmt.Println("nn1 =", nn1, "name =", name, "nn3 =", nn3)

	// 同样, 可以使用类型推导
	c1, c2, c3 := 123, true, "Good"
	fmt.Println("c1 =", c1, "c2 =", c2, "c3 =", c3)

	// 输出全局变量
	fmt.Println("g1 =", g1, "g2 =", g2, "g3 =", g3)
}
