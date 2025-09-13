public class Student extends Person {
    // 重写一下show方法

    @Override
    public void show() {
        System.out.println("学生的信息为：" + this.getId() + " - " + this.getUsername());
    }

    public Student() {
    }

    public Student(int id, String username) {
        super(id, username);
    }
}
