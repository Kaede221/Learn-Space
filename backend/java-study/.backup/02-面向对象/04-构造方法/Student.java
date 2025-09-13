public class Student {
    // 构造方法 其实也是一个方法 该有的都有，不过名称是类名而已
    // 不过 构造方法没有返回值类型 连void都没有
    // 其次，构造方法没有return语句 写了就会报错
    private String name;
    private int age;

    // 实现学生的构造方法
    // 构造方法无法手动调用，是自动调用的方法。
    // 如果不写构造方法，那么会自动实现一个空的构造，一旦写了，则空参构造就没了，不能直接调用了
    public Student(String name, int age) {
        // 实现构造方法 这个方法是带全部参数的构造方法
        this.name = name;
        this.age = age;
    }

    // 一般来说，两个构造方法都会手动写上，防止报错
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
