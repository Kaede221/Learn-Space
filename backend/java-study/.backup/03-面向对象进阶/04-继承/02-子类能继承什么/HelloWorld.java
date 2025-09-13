public class HelloWorld {
    /*
    父类的构造方法不能被子类继承
    不管是否私有，子类都能继承变量，只是子类无法直接使用私有的变量 需要自己写setter和getter
    对于成员方法 虚方法表的可以，否则不行
     */
    public static void main(String[] args) {
        // 我们尝试用空参构造 创建子类对象
        // 没有构造方法，虚拟机自动添加空参构造 不是人主动写的
        Zi z = new Zi();
        // 但是没有默认的带参构造 会报错
        // Zi z = new Zi("Kaede", 17);
    }
}
