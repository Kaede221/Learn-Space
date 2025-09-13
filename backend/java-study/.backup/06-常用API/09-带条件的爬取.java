import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "JAva是一个很好的语言，之前用的最多的是java8和JAVa11，下一个长期支持版本是jaVa17，相信不久以后，Java17也会登上历史舞台."
                + "现在有Java20也出现了，好耶！";
        fn01(str);

        System.out.println("---分割线---");

        f02(str);

        System.out.println("---分割线---");

        f03(str);
    }

    private static void f03(String str) {
        // 加入我想要筛选掉对象 可以用非 !
        // 直接?!即可 代表忽略后面的内容
        Pattern p = Pattern.compile("(Java(?i))(?!8|11|17)");
        Matcher m = p.matcher(str);
        while (m.find()) System.out.println(m.group());
    }

    private static void f02(String str) {
        // 如果我需要加上后面的数字 就需要这样子了，没有问号
        // 进而实现加上后面的数字 或者就好
        String regex2 = "((?i)Java)(?:8|11|17)";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group());
        }

        System.out.println("---分割线---");

        // 当然 这种情况下 没有问号也是可以的
        Pattern p = Pattern.compile("((?i)Java)(8|11|17)");
        Matcher m = p.matcher(str);
        while (m.find()) System.out.println(m.group());
    }

    private static void fn01(String str) {
        /*
        待条件的爬取内容 比如，我想要获取一句话中 版本为8 11 17的Java文本
        但是我只想要Java这四个字 应该怎么做呢？
        */
        // 首先 我们还是使用正则表达式即可
        // 问号 可以理解为前面的数据Java 后面的等于 表示Java后面跟随的数据，但是获取的时候，只获取前面的半个部分
        // 如果表达式中 出现的Java存在大小写区分，那么可以改一下
        // 前面给一个小括号 ?i表示前面的字符串是不区分大小写的
        String regex = "((?i)Java)(?=8|11|17)";
        // 随后 获取文本的正则即可
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}