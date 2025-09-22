// 这里需要进行继承, 运行时就继承RunTime, 否则继承Exception
// 我们的编译时, 是为了告诉程序员, 所以需要继承Exception
public class AgeFormatException extends RuntimeException {
    // 异常的格式, 按照 作用+Exception 作为名字

    public AgeFormatException() {
    }

    public AgeFormatException(String message) {
        super(message);
    }
}
