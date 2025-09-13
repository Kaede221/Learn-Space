// 实现一个最简单的Hello World!!!
// 约定俗成的, 最上面写一个包
// 这里很重要的是, 每个文件必须归属于一个包
package main

// 需要引入一些其他的资源
// 也叫做引入一个包, 这样就可以使用这个包里面的函数了
import "fmt"

// 这个就是main函数, 程序的入口
// func 就是定义函数的关键字了 main是函数名, 也是主函数的函数名
func main() {
	// 这里就是调用包里面的一个方法, 输出内容到控制台上.
	fmt.Println("Hello World")
}

/*
如果需要运行, VS Code有一个插件, Code Runner, 直接安装后, 只要环境安装好了, 就可以直接运行go文件了.
其实就是 go run hello.go, 不过这个过程会慢一点点
真实环境下, 需要 go build, 编译一下文件, 随后通过exe进行运行.
*/
