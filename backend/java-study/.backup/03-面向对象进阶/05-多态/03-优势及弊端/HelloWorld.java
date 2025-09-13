import java.util.ArrayList;

public class HelloWorld {
    /*
    多态 其实用的很广泛
     */
    public static void main(String[] args) {
        // 比如，我现在有一个集合容器
        // 我们一般都是确认类型的 但是如果我们不确认类型呢？
        // 那么其实就是Object 表示我们可以放入任何东西
        ArrayList<String> list = new ArrayList<>();
        // 这就是泛型的优势了

        // 缺点 其实就是编译看左边，运行看不知道那边
        // 也因此，多态不能调用子类的特有方法，这些方法只能子类自己调用，否则报错
        // 不过，Java提供了一个新的特性 我们可以判断一个变量的类型是什么 进而使用就好

        // 按照多态 创建学生
        Person p = new Student();

        // 按照多态的形式 判断类型即可
        // 这里的格式表示，如果p是学生的话，强制转换为学生类型，并且新的变量名为s
        // 如果不是的话，不会执行后面的转换操作
        if (p instanceof Student s) {
            s.show();
        } else if (p instanceof Teacher t) {
            t.show();
        }
    }
}

class Person {

}

class Student extends Person {
    void show() {
        System.out.println("学生！");
    }
}

class Teacher extends Person {
    void show() {
        System.out.println("老师！");
    }
}
