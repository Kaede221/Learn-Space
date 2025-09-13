public class Zi extends Fu {
    // 假设我们可以得到构造函数
    // 但是构造函数名字不一样，所以其实是不可以的
    // 对于私有属性 子类不能直接访问
    public int getAge() {
        // return this.age;
        return -1;
    }

    // 但是public的可以
    public String getName() {
        return this.name;
    }
}
