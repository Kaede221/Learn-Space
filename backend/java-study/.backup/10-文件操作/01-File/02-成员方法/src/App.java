import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
File有很多的成员方法 大概分为三个部分 直接挨个进行学习即可
 */
public class App {
    public static void main(String[] args) {
        // 判断与获取
        demo1();
        System.out.println("===");

        // 创建与删除
        demo2();
        System.out.println("===");

        // 获取与遍历
        demo3();
    }

    static void demo1() {
        // 见名知意就好
        // 这里需要注意, 相对路径, 是相对于项目而言, 不是相对于java文件而言
        // 所以这里需要相对于src下的某个文件.
        File f1 = new File("./src/test.txt");

        // 可以判断是否为文件夹
        System.out.println("是否为文件夹 " + f1.isDirectory());
        // 也可以判断是否为文件
        System.out.println("是否为文件 " + f1.isFile());
        // 也可以判断文件是否存在
        System.out.println("文件是否存在 " + f1.exists());

        // 另外, 可以看看文件的大小
        System.out.println("文件的大小(字节) " + f1.length());

        // 文件的绝对路径
        System.out.println("文件的绝对路径 " + f1.getAbsolutePath());
        // 文件定义时候的路径
        System.out.println("文件定义时候的路径 " + f1.getPath());

        // 文件名
        System.out.println("文件名 " + f1.getName());

        // 获取文件最后修改的时间
        System.out.println("文件修改的时间 " + f1.lastModified());
        // 如果需要转换为可视化的字符串 使用sdf
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(f1.lastModified()));
    }

    static void demo2() {
        // 创建文件, 就是直接创建 这里先定义父目录
        String parent = "./src/";

        // 可以在目录下创建文件 不过这里需要捕获异常
        try {
            // 首先 需要定义文件的对象, 这个文件对象是一个文件, 并且这个文件不存在
            File file = new File(parent, "newFile.txt");
            // 随后调用创建文件的方法
            boolean res = file.createNewFile();
            // 根据res判断是否创建成功
            if (res) {
                // 文件不存在, 并且目录成立, 则创建成功
                System.out.println("文件创建成功");
            } else {
                // 如果文件已经存在, 则创建失败
                System.out.println("文件创建失败");
            }
        } catch (IOException e) {
            System.out.println("文件创建失败 " + e.getMessage());
        }

        // 另外, 也可以创建文件夹 调用基本一样
        try {
            File file = new File(parent, "new_folder");
            // 创建文件夹
            boolean res = file.mkdir();
            if (res) {
                // 这个方法只能创建单层文件夹 如果mkdirs 就可以创建多级文件夹了
                // 后续确实使用的也是mkdirs了, mkdir会被底层自己调用
                System.out.println("文件夹创建成功");
            } else {
                // 路径是唯一的, 存在了就会失败
                System.out.println("文件夹创建失败");
            }
        } catch (SecurityException e) {
            System.out.println("文件夹创建失败 " + e.getMessage());
        }

        // ========================

        // 删除文件就是对应的了 可以删除文件
        try {
            File file = new File(parent, "newFile.txt");
            // 可以进行删除操作
            boolean res = file.delete();
            if (res) {
                System.out.println("文件删除成功");
            } else {
                System.out.println("文件删除失败");
            }
        } catch (SecurityException e) {
            System.out.println("文件删除失败 " + e.getMessage());
        }

        // 文件夹是一样的, 使用delete进行删除, 不过只能删除空文件夹
        try {
            File file = new File(parent, "new_folder");
            // 可以进行删除操作
            boolean res = file.delete();
            if (res) {
                System.out.println("文件夹删除成功");
            } else {
                System.out.println("文件夹删除失败");
            }
        } catch (SecurityException e) {
            System.out.println("文件夹删除失败 " + e.getMessage());
        }
    }

    static void demo3() {
        // 获取的是文件夹下所有的内容 放在数组进行返回
        String parent = "./src/";

        // 可以获取文件夹下的所有内容
        File file = new File(parent, "");
        File[] files = file.listFiles();

        // 这里需要注意, 如果file表示的路径不存在, 则返回null
        // 如果调用者是文件, 也会返回null
        // 如果是一个空文件夹, 则返回数组, 不过数组的长度为0
        // 如果路径是隐藏文件的文件夹, 会包含隐藏文件的, 不会省略隐藏文件
        // 如果路径是需要有权限才能访问的文件, 则返回null
        if (files != null) {
            for (File tempFile : files) {
                System.out.println(tempFile);
            }
        }
        // 如果需要遍历 只需要listFiles就足够了, 别的了解就行
    }
}
