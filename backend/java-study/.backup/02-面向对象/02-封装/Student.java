public class Student {
    // 如果为了防止外部修改一些属性，可以使用私有化关键词
    private String name;
    private int age;

    // 但是如果私有化了，则无法进行正常的赋值，我们应该怎么办呢？
    // 答案是设置setter和getter 外部通过调用这些函数来 有过滤性的 修改 访问对应的数据
    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("数据不在范围内");
        }
    }

    // getter没什么说的，直接返回就好
    public int getAge() {
        return this.age;
    }

    // getter和setter都是可以直接创建的
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 判断名字是否合法
        if (name.length() >= 2 && name.length() <= 10) {
            this.name = name;
        } else {
            System.out.println("名字长度应在2~10之间");
        }
    }
}
