public class Test {
    /*
    包装类是什么
    因为int之类的东西, 我们可能需要实现地址传递, 这个时候普通的int时不行的
    这里我们就需要把int变成一种引用数据类型
    这样 就可以实现了!
    包装类 其实就是给基础数据类型 包装了一个小外套

    另外, 集合里面只能储存对象, 所以必须需要包装类
    包装类中 只有char->Character int->Integer比较特殊,其他的都是普通的首字母大写 记住就好
     */
    public static void main(String[] args) {
        // Integer
        {
            // JDK5以前 时需要静态方法获取包装类对象的
            // 这个方法已经被废除, 能跑但会直接报错 告诉你不能这样子
            // Integer i1 = new Integer(1);
            // System.out.println(i1);

            // 另外 可以使用valueOf来获取, 同时可以设置进制是多少
            // 如果传入整数 那么就是整数, 另外也可以传入字符串
            // 如果需要设置进制, 则必须时字符串 否则报错
            Integer i2 = Integer.valueOf("123", 4);
            System.out.println(i2);

            // 上面这两种获取对象的方式时有区别的
            /*
            对于new 地址肯定不同, 不多说
            但是对于valueOf 只要这个value在一个范围中 会直接返回一个固定的对象, 超出去了才会自己使用new方法
            -128~127 都是可取的数字 总用256个数字
            这样实现的目的时 -128~127的数据用的比较多, 每次都new太浪费了, 不如直接创建好对象, 直接使用就好
             */
            {
                Integer i3 = Integer.valueOf(127);
                Integer i4 = Integer.valueOf(127);
                // true
                System.out.println(i3 == i4);
            }
            {
                Integer i3 = Integer.valueOf(128);
                Integer i4 = Integer.valueOf(128);
                // false
                System.out.println(i3 == i4);
            }

            // JDK5以后, Integer引入了自动拆箱和装箱的操作, 这个时候, int和Integer已经可以看作是一个东西了, 内部会自动进行转化的
            Integer int1 = 10;
            Integer int2 = 20;
            Integer int3 = int1 + int2;
            System.out.println(int3);
        }

        // 常用方法
        {
            // 还是用Integer举例子
            // 整数有三个常用方法 可以把整数转换为二进制 八进制和十六进制, 返回一个对应的字符串
            // 字符串是因为, 01010101也是合法的二进制, 0开头不能是数字; 另外, 二进制会很长, 装不下, 必须用String类型了
            Integer a = 11123;
            // 十进制
            System.out.println(Integer.toBinaryString(a));
            // 八进制
            System.out.println(Integer.toOctalString(a));
            // 十六进制
            System.out.println(Integer.toHexString(a));


            // 另外, 也有一个方法 可以把字符串整数变成整数类型 进而实现类型的转换
            // 这里面只能是整数 否则报错 不存在进制自动转换的情况
            int i = Integer.parseInt("123");
            System.out.println(i / 11);

            // 对于其他类型 大差不差
            // 除了Character类型 其他的所有类型都有类似于parseXXX的方法
            Boolean b = Boolean.parseBoolean("true");
            System.out.println(b);
        }
    }
}