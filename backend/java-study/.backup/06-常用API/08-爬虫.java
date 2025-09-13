import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    /*
    正则表达式 作用一是判断文本是否符合规范，作用二就是从一段文本中，找到符合规范的内容
    同时，这个技术也常常用于爬虫，用来爬取网页
    所以，这里就要介绍爬虫的使用方式了
     */
    public static void main(String[] args) throws IOException {
        // 爬取本地文本
        fn01();

        // 爬取网站
        fn02();
    }

    private static void fn02() throws IOException {
        // 目标网站为https://www.leuai.cn/idcard/
        // 要求就是爬取这个网站中的所有身份证号码
        // 首先 要获取网络
        URL url = new URL("https://id.dcode.top/");

        // 随后 创建链接
        URLConnection conn = url.openConnection();

        // 创建读取内容的东西
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        // 定义变量 行 用来记录
        String line;
        Pattern p = Pattern.compile("[1-9]\\d{17}");
        while ((line = br.readLine()) != null) {
            // System.out.println(line);
            // 对line进行正则即可
            Matcher matcher = p.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    }

    private static void fn01() {
        // 比如，提供一个文本：
        String testWord = "Java是一个很好的语言，之前用的最多的是Java8和Java11，下一个长期支持版本是Java17，相信不久以后，Java17也会登上历史舞台";

        // 需求 就是找到所有的JavaXX(数字)
        // Pattern 就是正则表达式的意思 我们要获取的正则表达式，其实就是这个东西
        // Matcher 匹配器 作用就是按照正则表达式的规则，读取字符串，并且从头开始读取

        // 首先 要获取正则表达式对象
        Pattern p = Pattern.compile("Java(\\d{0,2})");

        // 随后 获取文本匹配器的对象
        // 这里调用者是规则，传入的就是文本字符串了
        // m会自动寻找符合规则的字串
        Matcher m = p.matcher(testWord);

        // 我们可以使用find方法 判断这个m找没找到
        // 从头开始寻找的，有的话，就返回true 否则返回false
        // 同时，一旦使用这个方法，内部迭代器就会往后走一次
        boolean b = m.find();

        // 也可以获取这个方法
        // 这个方法会根据find获取到的东西 自动进行字符串截取
        String s1 = m.group();
        System.out.println(s1);

        // 可以使用for循环 获取所有的符合规则的值
        // 每次find都会调用迭代器，迭代器往后走，走到最后，刚好结束了
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}