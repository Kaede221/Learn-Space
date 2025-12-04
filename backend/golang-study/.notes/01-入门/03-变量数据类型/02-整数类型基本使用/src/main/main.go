package main

import (
	"fmt"
)

func main() {
	// NOTE 整数类型的基本使用
	var i int = 1
	fmt.Println("i =", i)

	/** NOTE 有符号大小及范围
	需要注意有符号和无符号的大小
	int8	有符号	1字节	-128~127
	int16	有符号	2字节	-2^15~2^15 - 1
	int32	有符号	4字节	-2^32~2^32 - 1
	int64	有符号	8字节	-2^63~2^63 - 1
	*/

	// 超出去会直接报错
	// cannot use 129 (untyped int constant) as int8 value in variable declaration (overflows)
	//var j int8 = 129
	//fmt.Println("i =", j)

	/** NOTE 无符号大小及范围
	对于无符号来说, 起始大小是一样的, 不过正数部分会存储的更多一些
	uint8	无符号	1字节	0~255
	uint16	无符号	2字节	0~2^16 - 1
	uint32	无符号	4字节	0~2^32 - 1
	uint64	无符号	8字节	0~2^64 - 1
	*/

	// 反正可以设置很长就对了
	var num1 uint64 = 10000000000000000
	fmt.Println(num1)

	/** NOTE 别的类型
	int		无符号	32位数4字节; 64位数8字节		-2^31~2^32 - 1
	uint	无符号	同上							0~2^32 - 1
	rune	有符号	和 int32 一样				-2^31~2^31 - 1		用来表示一个unicode编码
	byte	无符号	与 uint8 等价				0~255				储存单个字符的时候, 选择这个
	*/
	var num2 rune = 25565
	fmt.Println("num2 =", num2)
}
