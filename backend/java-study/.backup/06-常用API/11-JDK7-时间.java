import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    /*
    JDK7 以前的时间相关类

    Date 就是时间
    SimpleDateFormat 用来格式化时间的类
    Calendar 日历类
     */
    public static void main(String[] args) throws ParseException {
        // Date类
        {
            // 对于Date类 本身就是写好的Javabean类 可以直接使用，精确到毫秒左右
            Date d1 = new Date();
            // 无参构造 默认访问当前时间
            System.out.println(d1);

            // 如果需要自定义时间 传入毫秒值就好 这个是有有参构造的
            // 这里可以输入0 查看时间原点是多少 这里传入的是long类型 所以加一个L 用来区分类型
            Date d2 = new Date(0L);
            System.out.println(d2);

            // 另外也可以修改当前的时间
            d2.setTime(1000L);
            // 1000毫秒 就是往后走了1秒钟而已
            System.out.println(d2);

            // 也可以获取当前时间的毫秒值
            System.out.println(d1.getTime());

            // 我们可以使用数学，获取当前时间一年以后的时间
            Date d3 = new Date(d2.getTime() + 1000L * 60 * 60 * 24 * 365);
            System.out.println(d3);

            // 可以通过getTime比较哪个时间在前面
            System.out.println((d3.getTime() > d2.getTime()) ? "d2在前面" : "d3在前面");
        }

        System.out.println("---分割线---");

        // SimpleDateFormater
        {
            Date d = new Date();
            // 我们直接输出的时候 看起来不是很舒服，因为太长了，有很多没用的信息
            System.out.println(d);

            // 这个时候，就需要用一个Simple来格式化一下时间了，可以是年月日，也可以是斜线或者减号分开
            // 当然 这个类也可以反过来，把字符串解析为一个Date对象
            // 构造方法很简单 空参就是空的，默认的格式，有参就是使用指定的格式了
            SimpleDateFormat sdf = new SimpleDateFormat();
            // format可以返回格式化后的字符串 空参默认的就是下面这个样子的
            System.out.println(sdf.format(d));

            // 如果需要自定义分割的方式 则需要使用带参构造
            /*
            时间格式化英文规范
            注意大小写的区分
            yyyy-MM-dd HH:mm:ss
            W 大写的，代表星期几
             */
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 星期W");
            System.out.println(sdf2.format(d));

            // 反过来 解析也是可以的
            // 不过由于可能解析错误 所以需要throw一个错误，或者使用try来实现
            String str = "2006-10-16";
            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
            Date d2 = sdf3.parse(str);
            System.out.println(d2);
        }

        System.out.println("---分割线---");

        // Calendar
        {
            /*
            我们可能会有需要时间加减的情况，这个时候，使用刚才的内容也是可以实现的
            进行简单的数据计算即可
            但是，过于复杂了 我们不需要给这么多的东西
            这里就可以使用日历对象了 Calendar
            不过 这个类是抽象类 需要使用一个方法来获取，不能直接实例化 否则有问题
             */
            // 获取日历对象
            // 只能使用方法获取 这个方法是静态的
            // 这个方法会根据时区返回对象 时区不同，对象不同
            // 同时，年月日，时分秒之类的东西，都储存在一个数组里面了
            Calendar c = Calendar.getInstance();
            System.out.println(c);

            // 如果想要修改日历所代表的时间呢？
            // 首先明确 日历本质是用日期组成的，所以我们还是需要一个日期Date
            Date d = new Date(0L);

            // 随后，我们调用日历的设置时间函数，传入这个date即可
            c.setTime(d);
        /*
        TODO 注意一个细节 月份在储存的时候，范围是0~11 所以一月份其实是0月份就是了
        TODO 对于周来说 星期天是一周的第一天，所以输出是1，其实指的是星期天，不是星期一，要往前走一天
         */
            System.out.println(c);

            // 反向 getter和setter是可以对应的
            Date d2 = c.getTime();
            System.out.println(d2);

            // 另外 存在普通的set和get方法 用来直接获取日期中的某一个属性值是多少
            // get传入需要查询的内容即可 这里是一个数组的顺序
            // 不过我们不需要记住，已经提供了更简单的直接名称用来使用
            // 返回的是一个int类型 可以用变量进行接收
            System.out.println(c.get(Calendar.YEAR));
            // 对于月份 需要往前走一个 不然有问题
            System.out.println(c.get(Calendar.MONTH) + 1 + "月");
            System.out.println(c.get(Calendar.DAY_OF_MONTH));

            // 对于星期 也是可以获取的
            // 不过应当按照它的规则进行匹配
            // 注意,0是空的 没有对应的东西
            String[] weekRule = {"", "日", "一", "二", "三", "四", "五", "六"};
            System.out.println("星期" + weekRule[c.get(Calendar.DAY_OF_WEEK)]);

            // TODO 设定日期
            // 比如我们现在要设置年份为2025
            // 这个就是set方法了, 直接传入需要修改的东西, 和目标值就好
            c.set(Calendar.YEAR, 2025);
            System.out.println(c.getTime());

            // 如果传入的东西太大呢? 比如我修改的是2025年50个月
            c.set(Calendar.MONTH, 50);
            // 时间会自动往后走 不用担心溢出
            System.out.println(c.getTime());

            // TODO 日期加减
            // 比如我要实现 一个时间往后走一个月, 那么就可以用add方法
            c.add(Calendar.MONTH, 1);
            System.out.println(c.getTime());

            // 如果我要时间往回走呢?
            // 其实就是时间倒流,负数是可以用的
            c.add(Calendar.DATE, -5);
            System.out.println(c.getTime());
        }
    }
}