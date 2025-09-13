import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    // 学生管理系统的测试类
    public static void main(String[] args) {
        // 实现储存学生的集合
        ArrayList<Student> studentsList = new ArrayList<>();
        // 开始就是死循环即可
        while (true) {
            int res = getOption();
            // 判断res 如果是-1 则不管
            if (res == -1) continue;
            if (res == 5) {
                // 结束了
                System.out.println("感谢使用！");
                break;
            }
            // 根据res 实现不同的功能即可
            switch (res) {
                case 1 -> addStudent(studentsList);
                case 2 -> deleteStudent(studentsList);
                case 3 -> editStudent(studentsList);
                case 4 -> getStudentInfo(studentsList);
            }
        }
    }

    // 实现开始菜单的普通打印函数
    private static void printMenu() {
        System.out.println(":=====:欢迎使用 学生管理系统:=====:");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生");
        System.out.println("4. 查询学生");
        System.out.println("5. 退出");
        System.out.println("请输入选择：");
    }

    // 实现获取输入的函数
    private static int getOption() {
        // 首先，打印菜单
        printMenu();
        Scanner sc = new Scanner(System.in);
        // 然后，接收输入是什么
        int option = sc.nextInt();
        // 判断数据是否合法
        if (option >= 1 && option <= 5) {
            return option;
        } else {
            // 否则不成立，输出错误信息
            System.out.println("选项不存在！请重新输入！");
            return -1;
        }
    }

    private static int getStudentIndex(int id, ArrayList<Student> students) {
        /*
          根据学生ID，寻找学生，如果学生存在，返回学生的index 否则返回-1
         */
        // 遍历学生列表寻找即可
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                // 找到了 返回index即可
                return i;
            }
        }
        return -1;
    }

    // 实现四个操作方法
    private static void addStudent(ArrayList<Student> studentsList) {
        // 首先，要求输入学生ID
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID：");
        int id = sc.nextInt();
        // 判断学生是否存在
        if (getStudentIndex(id, studentsList) != -1) {
            System.out.println("学生已存在！无法添加！");
        } else {
            // 否则，正常添加即可
            String name, address;
            int age;
            System.out.println("请输入姓名：");
            name = sc.next();
            System.out.println("请输入年龄：");
            age = sc.nextInt();
            System.out.println("请输入家庭住址：");
            address = sc.next();

            // 创建新的学生
            Student s = new Student(id, name, age, address);
            // 加入内容中
            studentsList.add(s);
            System.out.println("添加完成！");
        }
    }

    private static void deleteStudent(ArrayList<Student> studentsList) {
        // 一样，先输入ID，判断这个学生是否存在
        System.out.println("请输入ID：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int index = getStudentIndex(id, studentsList);
        // 判断学生是否存在
        if (index == -1) {
            // 没有 不存在
            System.out.println("查无此人！");
        } else {
            // 找到了 删除这个学生
            studentsList.remove(index);
            System.out.println("删除完成！");
        }
    }

    private static void editStudent(ArrayList<Student> studentsList) {
        // 一样，先输入ID
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID：");
        int id = sc.nextInt();
        int index = getStudentIndex(id, studentsList);
        if (index == -1) {
            System.out.println("查无此人！");
        } else {
            // 允许再次输入内容
            System.out.println("请输入新的姓名：");
            String name = sc.next();
            System.out.println("请输入新的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的住址：");
            String address = sc.next();
            // 修改
            studentsList.get(index).setName(name);
            studentsList.get(index).setAge(age);
            studentsList.get(index).setAddress(address);

            // 提示信息
            System.out.println("修改完成！");
        }
    }

    private static void getStudentInfo(ArrayList<Student> students) {
        // 输入ID
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID：");
        int id = sc.nextInt();
        int index = getStudentIndex(id, students);
        if (index == -1) {
            // 没有找到这个ID
            System.out.println("查无此人！");
        } else {
            Student s = students.get(index);
            // 找到了 格式化输出内容即可
            System.out.println("ID\t姓名\t年龄\t住址\n" + s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }
}
