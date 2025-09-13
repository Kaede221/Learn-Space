public class Student {
    // 这里只提供一个名称演示就好了
    private String name;

    public void setName(String name) {
        // 这里如果是n的话，可以用name，但是如果还是name呢？
        // 无法进行修改 因为这里的name其实使用的是形参name，不是实参name 导致自己等于自己，没有修改到本源
        name = name; // // null

        // 如果需要修改，则需要使用this
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
