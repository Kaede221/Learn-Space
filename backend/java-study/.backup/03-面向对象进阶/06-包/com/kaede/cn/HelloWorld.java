package com.kaede.cn;

// 如果使用其他包定义的东西，可以使用import

import com.fumoe.top.Student;

public class HelloWorld {
    // 什么是包
    /*
    到目前来说，其实我们写的代码都不是很严格
    标准来说，代码目录是和这个一样的 com.kaede.cn 这种格式
    这个才是一个完整的Java包 我们可以创建一下
     */
    public static void main(String[] args) {
        // 上面也会出现一个package 表示当前的软件包是什么
        // 另外，我们可能有多个软件包，这里创建另外一个包

        // 使用的时候，在上面Import 就可以直接使用了
        Student s = new Student("Kaede", 18);
        System.out.println(s.getName() + " " + s.getAge());

        // 另外，在使用Java.lang中，不需要导入，因为这个是核心包，自己就已经被导入了
        // 如果两个包有同名的东西，那么就必须要用全类名了 比如下面这样
        com.fumoe.top.Student s2 = new Student();
    }
}
