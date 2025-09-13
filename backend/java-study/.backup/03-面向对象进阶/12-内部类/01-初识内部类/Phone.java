public class Phone {
    // 手机有一些基本的属性
    private String name;
    private int price;

    // 同时，手机有CPU
    class Core {
        String band;
        double power;

        // 内部类可以访问自己的变量，也可以访问外部类的属性 包括私有
        // 但是外部类需要访问，就必须要创建对象了

        public Core(String band, double power) {
            this.band = band;
            this.power = power;
        }
    }

    public void show() {
        // 必须实例化内部类
        Core c = new Core("XM", 1999);
        System.out.println(this.name + " " + c.band + " " + c.power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Phone() {
    }
}
