public class Test {
    private static void Divider() {
        System.out.println("---分割线---");
    }

    private static void Divider(String str) {
        System.out.println("---" + str + "---");
    }

    private static boolean checkQQNumber(String number) {
        // 用之前的写法实现一下
        int len = number.length();
        // 判断长度
        if (len < 6 || len > 20) return false;

        // 判断第一个字符是什么
        if (number.startsWith("0")) return false;

        // 判断每个字符是不是数字
        for (int i = 0; i < len; i++) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') return false;
        }

        return true;
    }

    private static boolean checkQQNumber2(String number) {
        // 不过 有了更简单的方式 就是正则表达式
        // 这个方法是字符串的方法 直接点就好 满足返回true 否则返回false
        // 很简单 一行搞定内容即可
        return number.matches("[1-9]\\d{5,19}");
    }

    private static void f1() {
        /*
        正则表达式
        其实就是用来对字符串进行校验的一个快速方法
        加入我要求输入一个qq号，判断这个qq号是否正确（6~20位数 开头不是0 全部是数字即可）
         */
        // 输入一个QQ号的字符串
        String qqNumber1 = "1234567890";
        String qqNumber2 = "0234567890";
        String qqNumber3 = "12345a7890";

        System.out.println(checkQQNumber(qqNumber1));
        System.out.println(checkQQNumber(qqNumber2));
        System.out.println(checkQQNumber(qqNumber3));

        System.out.println(checkQQNumber2(qqNumber1));
        System.out.println(checkQQNumber2(qqNumber2));
        System.out.println(checkQQNumber2(qqNumber3));
    }

    private static void f2() {
        /*
        正则表达式有两个作用
        校验字符串是否满足规则，或者在一段文本中查找满足要求的内容
        下面是基本的匹配规则 需要记住

        [abc] 只能是abc
        [^abc] 除了abc的任何字符
        [a-zA-Z] a-z和A-Z 左右包括
        [a-d[m-p]] a-d 或者m-p
        [a-z&&[def]] a-z和def的交集 那么就是def
        [a-z&&[^bc]] a-z和非bc的交集
         */

        Divider("[]正则表达式");
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        // 注意，如果字符串长度超出了正则表达式 就是false
        // 可以这么理解，你匹配了一个字符，说明希望这个字符串只有一个字符，但是你写了两个，所以不符合需求了
        System.out.println("ab".matches("[abc]"));

        Divider("[^]正则表达式");
        System.out.println("a".matches("[^abc]"));
        System.out.println("ac".matches("[^abc]"));

        Divider("[-]范围正则表达式");
        System.out.println("a".matches("[a-z]"));
        System.out.println("1".matches("[a-z]"));
        System.out.println("ab".matches("[a-z][a-z]"));

        Divider("[a-c[m-p]]或者正则表达式");
        System.out.println("a".matches("[a-c[m-p]]"));
        System.out.println("1".matches("[a-c[m-p]]"));
        // 对于或者 也可以使用这种分支结构 一样的 没区别
        System.out.println("a".matches("[a-c]|[d-e]"));

        Divider("[&&]求交集");
        // 这里需要注意，&&必须写两个，否则就是判断是否存在&这个符号了 不是判断两边的东西
        // 下面这个就是一个空集，不存在可以匹配的结果
        System.out.println("a".matches("[a-z]&&[1-9]"));
        System.out.println("&".matches("[a-e]&&[b-f]"));
        System.out.println("&".matches("[a-z]&[1-9]"));

        /*
        还有一些预定义字符 就是只匹配一个字符的意思
        . 代表任何字符
        \d 一个数字
        \D 非数字 等于[^0-9]
        \s 一个空白字符
        \S 非空白字符
        \w 单词字符 等效于 [a-zA-Z_0-9]
        \W 非单词字符
         */
        Divider("转义字符 预定义字符");
        // 这里需要注意一下，反斜杠是特殊符号 需要写两次，否则报错
        System.out.println("123".matches("\\d\\d\\d"));
        System.out.println("你好".matches(".."));
        System.out.println("你".matches(".."));
        System.out.println(" ".matches("\\s"));

        Divider("校验多个字符");
        // 这里就要用到花括号了 或者有一些特殊的正则符号 比如下面这样子
        // X? 表示X出现了一次或者0次
        // X{a,} 前面的东西至少出现了a次
        System.out.println("Kaede".matches("\\w{6,}"));

        // 或者是 判断出现的次数是多少 比如判断一个用户名是否成立
        System.out.println("KaedeShimizu".matches("[a-zA-Z]{6,18}"));
    }

    private static void f3() {
        // 正则表达式练习
        /*
        需求 使用正则表达式 验证用户输入的手机号码，邮箱，电话号码是否符合要求
         */
        Divider("验证手机号");
        String[] phoneNumbersList = {"13323332333", "13511114444", "134456545654", "21221222222"};
        // 遍历判断
        for (String phoneNumber : phoneNumbersList) {
            // 判断正则即可
            // 首先 手机号是1开头的 第二位，一般都是3~9 第三位开始 就是任意数字了
            // 但是 手机号的长度是固定的 后面加上第三位 是9个
            boolean res = phoneNumber.matches("1[3-9][0-9]{9}");
            System.out.println(res ? "符合！" : "不符合！");
        }

        Divider("邮箱合法验证");
        String[] emails = {"110@outlook.com", "kaedeshimizu@outlook.com", "it@test.com.cn"};
        for (String email : emails) {
            // 思考一下 邮箱其实也是三个部分 第一个就是@前面的字符 可以是数字 可以是字母 也可以是下划线 这其实就是\\w
            // 另外至少一个 直接+就好
            // 然后是@ 直接写就好，表示必须出现 且只有一次
            // 第三部分 也是三个部分 .的左边，点，和点的右边
            // 第一部分 没有下划线 同时长度为2~6 [\w&&[^_]]{2,6}
            // 随后 一个点点，这里需要注意，.表示的是任意字符，所以需要转义一下
            // 后面是域名 com cn之类的东西
            // 如果结构有点乱 可以用小括号分组
            String regex = "(\\w+)@((\\w+[^_]){2,15})(\\.[a-zA-Z]{2,15}){1,2}";
            System.out.println(email.matches(regex));
        }
    }

    public static void main(String[] args) {
        // 演示正则表达式
        f1();
        // 开始学习正则表达式
        f2();
        // 练习正则表达式
        f3();
    }
}