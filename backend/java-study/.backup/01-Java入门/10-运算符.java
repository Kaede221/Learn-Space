/**
 * 运算符和表达式
 */

public class HelloWorld {
    // 为了方便记录，使用函数演示不同的内容
    private static void work1() {
        // 算数运算符部分 其实就是加减乘除和取模
        // 取模就是得到相除的余数 下面直接演示对应的内容

        // 加减乘除
        System.out.println(1 + 10);
        System.out.println(12 - 1);
        System.out.println(2 * 11);
        // 除法需要注意，这里的其实是整除除法，只能得到整数部分
        System.out.println(25 / 2);
        // 上面是整除，那么这个取余，得到的就是余数是多少了
        System.out.println(25 % 2);
        System.out.println("===");

        // 需要注意，如果计算中有小数的参与，那么结果是有可能不准确的 比如下面这样子：
        System.out.println(1.01 * 1.1);
        // 原因不需要知道，后面才会用到，现在只需要记住就好
    }

    private static void work2() {
        // 算数运算符的扩展
        // 加法操作的三种情况：
        /*
        数字相加
        字符串相加
        字符相加
         */
        // 如果整数+小数，那么，小范围会变成大范围
        // 下面的10，存在一个自动类型提升，10变成了double类型的10.0，进而实现运算效果
        double res = 10 + 12.5;
        System.out.println(res);

        int a = 10;
        // 这里存在一个自动类型提升，防止出现溢出问题
        double b = a;
        System.out.println(b);

        // 这里需要记住如下 隐式转换规则
        /*
        取值范围小的，小的会自动提升为大的再进行运算
        byte short char三种类型的数据在运算的时候，都会自动提升为int类型
         */
        // 第一点已经展示过了，第二点如下
        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = b1 + b2; 报错，类型不匹配
        int b3 = b1 + b2;
        System.out.println(b3);
    }

    private static void work3() {
        // 强制转化
        // 比如，我有一个int为300，我要强制转换为byte 就可以使用强制类型转化内
        int a = 300;
        // 强制转化内不会报错
        byte b = (byte) a;
        System.out.println(b);

        // 对于合法范围，可以这样子实现两个byte相加后还是byte类型
        byte b1 = 10, b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }

    private static void work4() {
        // 对于字符串来说，一旦相加，就是前后合并了，不是普通的计算了
        // 这里的+指的是字符串连接符，不是加法运算了
        System.out.println("Kaede" + 11);

        // 如果我要计算10 + 20，下面这样子是不太对的
        System.out.println("10 + 20 = " + 10 + 20);
        // 但是改一下运算顺序呢
        System.out.println(10 + 20 + " = 10 + 20");
        // 因为加法是顺序进行的，第一个先拼接字符串，第二个则是先运算10+20，再拼接字符串
        // 如果需要提高运算顺序，则需要用括号提高运算优先级即可
        System.out.println("10 + 20 = " + (10 + 20));

        // 对于变量来说，使用起来差不多
        int age = 18;
        System.out.println("Kaede 's age is " + age);

        // 总结一下，用下面这行就行，看懂了，问题就不大
        System.out.println(1 + 2 + " age is " + age + 11);
    }

    private static void work5() {
        // 对于char类型来说，会自动把字符用数字进行运算，再返回
        System.out.println(1 + 'a');
        // 字符和字符串的话，没什么说的，就是普通的拼接
        System.out.println('a' + "Good");
        // 同理，如果需要输出字符，可以强制转换
        System.out.println((char) (1 + 'a'));
    }

    private static void work6() {
        int a = 1;
        System.out.println(a);
        // 自增自减 就是+1或者-1
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        // 需要注意一下顺序问题
        a = 0;
        // 如果输出a++, 则是先输出a，再让a++
        System.out.println(a++); // 0
        System.out.println(a); // 1

        // 但是如果++a，则是先自增，再输出
        System.out.println(++a);
        // 一般是在循环中用到的，现在只需要会用就好
    }

    private static void work7() {
        // 其实就是等于操作
        int a = 10, b = 20;
        // 赋值运算符就是这个等号 让左边的等于右边的
        // 可以让a变成a+b 一般写作这个
        a = a + b;
        // 也可以简化
        a += b;
        System.out.println(a);
        // 同理 其他算数运算符也是可以使用的，+= -= /= *= %=
        a *= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
    }

    private static void work8() {
        // 其实就是不等式的运算，等于，不等于，大于小于之类的判断运算符
        int a = 10, b = 20;
        // 反正成立是true 不成立是false
        // 只需要注意，等于是两个等号就行
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }

    private static void work9() {
        // 逻辑运算符
        // 也就是与或非 并且，或者，取反操作

        // & 代表与，两个都成立则成立
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);

        // | 或者，只要一个是真的，就是真的，否则就是假的
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);

        // 非 就是取反操作
        System.out.println(!true);
        System.out.println(!false);

        // 异或操作
        // 这个比较的是二进制的东西 这里不多说
        // 相同为false 不相同为true 不过两个int运算，返回的也是int类型就是
        System.out.println(1 ^ 1);
    }

    private static void work10() {
        // 比如说，我现在有一个判断，如果A成立，并且B成立，并且...很长
        // 我们自然不需要一个个判断，从头开始，只要不成立就不需要继续了
        // 短路 只存在与和或运算
        // 一般用这个就好
        System.out.println(true && true);
        System.out.println(false || true);

        // 存在一些特殊用法
        int a = 10;
        // 比如这个
        // 这个运算中，判断成立后，后面的条件仍然会判断，但是判断中又存在自增操作，所以a变了
        System.out.println(a == 10 | ++a == 11);
        System.out.println(a);
        a = 10;
        // 但是对于下面这个，则存在不同，因为前面成立了，后面就不会判断了，自然自增就不会执行！
        System.out.println(a == 10 || ++a == 11);
        System.out.println(a);
    }

    private static void work11() {
        // 三元运算符
        // 条件 ？ 成立返回的值 ： 不成立返回的值
        System.out.println(true ? "Yes" : "No");
        System.out.println(false ? "No" : "Yes");
    }

    public static void main(String[] args) {
        // 运算符 就是对字面量或者变量进行操作的符号
        // 表达式，只要用运算符能够连接起来，不报错，那么就是一个表达式
        // 不同的运算符，表达式也是不一样的

        // 算数运算符
        work1();
        // 算数运算符的扩展
        work2();
        // 强制类型转换
        work3();
        // 字符串相加
        work4();
        // 字符相加
        work5();
        // 自增自减运算符
        work6();
        // 赋值运算符
        work7();
        // 关系运算符
        work8();
        // 逻辑运算符
        work9();
        // 短路逻辑运算符
        work10();
        // 三元运算符
        work11();
    }
}
