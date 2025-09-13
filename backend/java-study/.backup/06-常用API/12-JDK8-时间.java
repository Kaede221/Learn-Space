import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
    /*
    JDK7 之前, 我们如果需要进行日期的比较, 必须要进行转换为毫秒再进行运算, 这非常的麻烦
    另外,JDK7 中, 多线程的情况下, 会出现数据安全的错误 所以我们需要学习JDK8 中的时间
    - 解决方案很简单, 时间对象不可变, 都是静态的, 就不会出现冲突错误了
     */

    /*
    Date 类
    ZoneId 时区
    Instant 时间戳
    ZoneDateTime 带时区的时间
     */
    private static void f01() {
        // ZoneId
        {
            // 对于时区来说 我们可以获取所有可以使用的时区先看一看
            // 这个方法是静态方法 可以直接调用 返回一个集合 Set<String>
            // 返回的是所有时区的名称 直接打印就能看到了
            System.out.println(ZoneId.getAvailableZoneIds());
            System.out.println("长度为: " + ZoneId.getAvailableZoneIds().size());

            // 另外,也可以获取当前系统的指定时区是什么
            // 这个方法也是静态方法 可以直接输出看看
            System.out.println(ZoneId.systemDefault());

            // 也可以获取指定的时区
            ZoneId zi = ZoneId.of("US/Alaska");
            System.out.println(zi);
        }

        // Instant
        {
            // Instant 指的是标准时间是什么
            // 如果需要切换为中国, 则需要加8个小时
            // 通过对象, 获取当前的时间对象
            Instant now = Instant.now();
            // 2025-02-07T10:00:30.479395500Z
            // 后面的是纳秒 这就是当前的标准时间了
            System.out.println(now);

            // 根据毫秒或者秒或者纳秒来获取时间
            Instant instant1 = Instant.ofEpochMilli(0L);
            System.out.println(instant1);
            Instant instant2 = Instant.ofEpochSecond(1L);
            System.out.println(instant2);

            // 对于秒来说, 也有另外一个方法, 第二个参数表示纳秒
            Instant instant3 = Instant.ofEpochSecond(1L, 11123L);
            System.out.println(instant3);

            // 另外, 获取时间的时候, 也可以指定时区, 不过是创建的时候就需要指定了.
            ZoneId zi = ZoneId.of("US/Alaska");
            // 这里的类型比较特殊
            ZonedDateTime instant4 = Instant.now().atZone(zi);

            // 再次输出看看
            // 2025-02-07T01:06:18.008893-09:00[US/Alaska]
            // 后面有时区修饰了 这个时间就是自动转换后的时间了
            System.out.println(instant4);

            // 我们可以使用自带的方法 判断一个时间在另外一个时间的前面还是后面
            // isAfter 表示前面的是否在后面的前面
            // isBefore 表示前面的是否在后面的后面
            System.out.println(instant3.isAfter(instant2));
            System.out.println(instant3.isBefore(instant2));

            // 这个时间也是可以增加和减少的
            // 不过由于本身是不可变的, 所以会产生一个新的对象
            Instant instant6 = Instant.ofEpochMilli(11123L);
            System.out.println(instant6);

            // 调用方法 减少一点时间
            instant6 = instant6.minusSeconds(1);
            System.out.println(instant6);
        }

        // ZoneDateTime
        {
            // 获取一个带时区的时间
            ZonedDateTime now = ZonedDateTime.now();
            // 2025-02-07T18:14:32.438564400+08:00[Asia/Shanghai]
            // 这个时间直接就是带时区的了
            System.out.println(now);

            // 也可以直接获取一个指定的时间对象, 同样, 时区也需要进行配置
            ZonedDateTime time1 = ZonedDateTime.of(2025, 11, 1, 2, 3, 0, 0, ZoneId.of("Asia/Shanghai"));
            System.out.println(time1);

            // 不过这样写太长了, 我们完全可以分开, 先实现一个Instant, 再转换就好
            Instant instant1 = Instant.ofEpochSecond(11123);
            ZoneId id = ZoneId.of("Asia/Shanghai");
            ZonedDateTime time2 = ZonedDateTime.ofInstant(instant1, id);
            System.out.println(time2);

            // 如果需要修改时间 可以使用withXxx方法
            // 反正修改和普通的那个是一样的,没区别
            time2 = time2.withYear(2000);
            System.out.println(time2);
            time2 = time2.withMonth(2);
            System.out.println(time2);
        }
    }


    /*
    日期格式化类
    SimpleDateFormat 用于时间的格式化和解析
     */
    private static void f02() {
        // 这个东西就两个作用,格式或者解析时间
        // 直接获取一个时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        // 把这个时间 按照字符串进行解析
        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dateFormat1.format(time));
    }


    /*
    日历类
    Calender
    LocalDate 年月日
    LocalTime 时分秒
    LocalDateTime 年月日+时分秒
     */
    private static void f03() {
        /*
        和之前的其实差不太多 也是now of get之类的东西 只不过这里的时间就是很简单的一个时间,不包含时区了
        isBefore After也是存在的,可以正常使用
        with开头的 也有, 表示修改时间; minus 就表示的是减少时间了, plus自然就是增加
        另外, 前两个都可以转换为第三个, 使用to开头的方法进行转换即可
         */

        // LocalDate
        {
            // 实例化时间对象
            LocalDate nowDate = LocalDate.now();
            // 这个只会储存年月日 可以输出看看
            System.out.println(nowDate);

            // 也可以指定年月日进行获取 就是of方法了
            LocalDate nowDate2 = LocalDate.of(2006, 10, 16);
            System.out.println(nowDate2);

            // 同时 我们也可以单独的获取某个属性 年份 或者月份 或者天数
            System.out.println(nowDate.getYear());
            System.out.println(nowDate.getMonth());
            // 月份默认输出的一个字符串, 如果想要获取整数信息 加一个value就好
            System.out.println("月份的数字为: " + nowDate.getMonthValue());
            System.out.println("月份的数字为: " + nowDate.getMonth().getValue());
            System.out.println(nowDate.getDayOfMonth());

            // 天数其实大差不差 不过可以获取这是一个月的第几天 或者是一年中的第几天就是
            System.out.println("今天是" + nowDate.getDayOfMonth() + "号");
            System.out.println("今天是一年中的" + nowDate.getDayOfYear() + "天");
            System.out.println("今天是星期" + nowDate.getDayOfWeek().getValue());

            // 另外,我们可以判断日期的前后
            System.out.println(nowDate2.isBefore(nowDate));
            System.out.println(nowDate2.isAfter(nowDate));

            // 修改年月日信息 使用with开头的方法即可
            // 这里需要注意, 需要接收返回值, 否则无法修改
            nowDate = nowDate.withYear(3000);
            System.out.println(nowDate);

            // 日期也是可以加减的 比如我现在 让日期减少1000年
            nowDate = nowDate.minusYears(1000);
            System.out.println(nowDate);
            // 增加十周试试
            nowDate = nowDate.plusWeeks(10);
            System.out.println(nowDate);
        }

        // LocalTime
        {
            // 刚才的是年月日的日期 这个是时分秒的日期, 调用方式几乎一致
            LocalTime time1 = LocalTime.now();
            System.out.println(time1);

            // 也可以单独的获取时分秒 都是int类型
            System.out.println(time1.getHour());
            System.out.println(time1.getMinute());
            System.out.println(time1.getSecond());

            // 纳秒也是可以的
            System.out.println(time1.getNano());

            // 另外, 定义的时候, 也可以直接使用of 指定时分秒是多少
            // 不过这里需要注意 时和分时必要的, 后面的参数, 顺着走, 有了秒才有纳秒 没有秒不能写纳秒 看API即可
            LocalTime time2 = LocalTime.of(13, 14, 52, 0);
            System.out.println(time2);

            // 另外也有if方法 判断时间的先后
            System.out.println(time2.isAfter(time1));
            System.out.println(time2.isBefore(time1));

            // 时间也是可以加减的 正常运算即可
            time1 = time1.minusSeconds(10);
            System.out.println(time1);

            time1 = time1.plusSeconds(10);
            System.out.println(time1);
        }

        // LocalDateTime
        {
            // 这个就是 全部都知道的情况 每个内容都可以获取
            LocalDateTime time1 = LocalDateTime.now();
            System.out.println(time1);
            // 使用的时候大同小异 这里不多演示
        }
    }


    /*
    工具类
    Duration 时间间隔 秒or纳秒
    Period 时间间隔 年月日
    ChronoUnit 时间间隔(所有单位)
     */
    private static void f04() {
        // 随便定义两个日期
        LocalDateTime time1 = LocalDateTime.of(2006, 2, 21, 12, 10, 10);
        LocalDateTime time2 = LocalDateTime.now();

        // Period
        {
            // 我想要计算一下 这两个时间间隔是多少 由于很大, 所以使用第二个来接收
            // 这里的方法 意思是第二个参数减去第一个参数
            Period p = Period.between(time1.toLocalDate(), time2.toLocalDate());
            System.out.println("时间间隔对象为: " + p);

            // 也可以单独获取间隔的年月日是多少
            System.out.println(p.getYears());
            System.out.println(p.getMonths());
            System.out.println(p.getDays());

            // 当然 也可以直接计算总月份 这里由于年份差为0 所以看不出来, 这个方法会自动把年份转换为月份的
            System.out.println(p.toTotalMonths());
        }

        // Duration
        {
            // 更加专注于秒和纳秒的计算
            Duration d = Duration.between(time1, time2);
            System.out.println("时间间隔对象为: " + d);

            // 我们还是可以计算时分秒 世界使用to方法即可
            System.out.println(d.toDays());
            System.out.println(d.toHours());
            System.out.println(d.toMinutes());
            System.out.println(d.toSeconds());
        }

        // ChronoUnit
        {
            // 什么时间都可以进行计算 甚至可以计算世纪之间的区别
            // 不过这个时一个工具类 不需要实例化 直接调用即可
            // 首先要点一个东西 然后后面的方法都是通用的了 直接between即可
            // 这个使用起来就非常简单了 直接就是一个通用
            System.out.println("相差年数为" + ChronoUnit.YEARS.between(time1, time2));
            System.out.println("相差月份为" + ChronoUnit.MONTHS.between(time1, time2));
            System.out.println("相差周数为" + ChronoUnit.WEEKS.between(time1, time2));
            System.out.println("相差天数为" + ChronoUnit.DAYS.between(time1, time2));

            // 甚至可以计算相差多少个千年
            System.out.println("相差多少千年: " + ChronoUnit.MILLENNIA.between(time1, time2));
        }
    }

    private static void Divider() {
        System.out.println("-- 分割线 --");
    }

    public static void main(String[] args) {
        f01();
        Divider();
        f02();
        Divider();
        f03();
        Divider();
        f04();
    }
}