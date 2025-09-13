public class Test {
    /*
    分组
    其实分组就是小括号 和优先级提升是一摸一样的 没区别
    下面直接列举 几个常用的案例即可
     */
    public static void main(String[] args) {
        f1();
        Divider();
        f2();
        Divider();
        f3();
        Divider();
        f4();
    }

    private static void f4() {
        // 外部也是可以使用正则表达式里面的东西的
        String str = "AAAAAAABBBBBCCCCCCCCDDDDD";
        // 这里需要替换的 是第一组的内容 这里使用新的操作符即可
        // 一步搞定
        String res = str.replaceAll("(.)\\1+", "$1");
        System.out.println(res);
    }

    private static void f3() {
        // 通俗一些，这里判断 一个字符串的开始部分和结束部分是否相同
        // 另外，字符必须是重复字符
        String[] examples = {"a", "aba", "aaa123aaa", "aaa123bbb"};
        for (String str : examples) {
            // *表示的是前面的东西可以出现一次 或者不出现
            String regex = "((.)\\2*)(.+)\\1";
            System.out.println(str.matches(regex));
        }
    }

    private static void f2() {
        // 需求 判断一个字符串的开始字符串和结束字符串是否相同
        String[] examples = {"abc123abc", "b456b", "17891178", "&!@abc&!@", "abc123abd"};
        for (String str : examples) {
            // 至少出现一次 所以就是.+ 这里会完全自动的判断，不需要写更多的东西了
            String regex = "(.+)(.+)\\1";
            System.out.println(str.matches(regex));
        }
    }

    private static void f1() {
        // 需求 判断一个字符串的开始字符和结束字符是否相同
        String[] examples = {"a123a", "b456b", "17891", "a123b", "&asd&"};
        for (String str : examples) {
            // 其实还是直接创建正则
            // \\组号 表示把第x组的东西拿出来再次使用一次
            String regex = "(.)(.+)\\1";
            System.out.println(str.matches(regex));
        }
    }

    private static void Divider() {
        System.out.println("---分割线---");
    }
}