public class Teacher extends Person {

    @Override
    public void show() {
        System.out.println("老师的信息为：" + this.getId() + " - " + this.getUsername());
    }

    public Teacher() {
    }

    public Teacher(int id, String username) {
        super(id, username);
    }
}
