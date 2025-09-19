/*
这里需要指定一个排序规则, 需要实现一下接口
 */
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        // 返回负数, 则小一些, 正数则大一些, 返回0则表示已经存在
        int i = this.getAge() - o.getAge();
        return i == 0 ? this.getName().compareTo(o.getName()) : i;
    }
}
