public class User {
    // 首先确认用户都有哪些属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    // 实现两个构造方法
    public User() {
    }

    public User(String username, String password, String email, String gender, int age) {
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.username = username;
    }

    // 使用快捷键 alt + insert 快速生成对应的getter和setter
    // 直接选择所有的getter和setter即可，甚至上面的构造方法也是可以一键生成的
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
