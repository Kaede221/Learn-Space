package main

import "fmt"

func main() {
	fmt.Println("Hello World")
}

/*
Go Lang 的执行流程分析

.go -- go build --> 可执行文件 .exe -- 运行 --> 结果
.go -- go run --> 结果

区别:
1. 如果我们生成了可执行文件, 那么我们可以直接把程序给别的机器进行使用
2. 如果使用 go run 源代码, 则另外一个机器上面也应该有Go环境, 否则无法运行
3. 编译后, 它会保存以来的库文件, 所以体积会大很多.
*/

/*
编译和运行的一些说明
1. 可以指定生成的exe的名称
> go build -o myHello.exe hello.go

2. 如果编译的时候报错, 将会直接报错误内容
*/
