public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        // 这里可以判断, 年龄需要在16~24之间, 否则抛出异常
        if (age >= 16 && age <= 24) {
            this.name = name;
            this.age = age;
            System.out.println("构建成功");
        } else {
            // 使用 throw 抛出异常
            throw new RuntimeException();
        }
    }

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
