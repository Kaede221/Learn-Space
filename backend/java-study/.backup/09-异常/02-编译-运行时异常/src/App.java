import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
编译时异常, 就是代码直接就有问题, 编译器会直接告诉我们这个问题的
我们不需要运行, 就可以直接看到报错
 */
public class App {
    // 为了下面的代码不报错, 需要加上一个异常说明
    public static void main(String[] args) throws ParseException {
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        // 这里的代码直接写会报错, 需要进行修复
        // 这就是编译时异常, 需要我们手动处理, 否则代码报错.
        Date date = sdf.parse(time);
        System.out.println(date);

        // 运行时异常, 就是比如越界之类的
        // 编译时不需要处理, 运行时才会出现, 才需要处理.
        int[] arr = {1, 2, 3};
        // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(arr[3]);

        /*
        简单说 Java文件 -> 字节码文件 -> 运行结果
        第一个箭头出现问题, 就是编译时异常
          因为编译的时候不会运行代码, 仅仅判断语法是否正确, 以及一些性能优化
        第二个箭头出现问题, 就是运行时异常
          自然, 只有运行的时候才能看到错误

        编译时异常更多是提醒程序员检查代码
        运行时异常则时代码出错导致问题, 没有提醒的义务
         */
    }
}
