public class Person {
    // 实现一个通用的父类
    private int id;
    private String username;

    // 实现一个方法的父类 这里需要子类进行重写
    public void show() {
        System.out.println(this.username + " " + this.id);
    }

    public Person() {
    }

    public Person(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
