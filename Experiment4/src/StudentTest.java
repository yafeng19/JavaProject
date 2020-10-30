import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentTest {
    static int count = 0;  //信息总条数，静态全局变量
    static Student[] student = new Student[100];    //学生信息数组，静态全局变量
    public static void main(String args[]) {

        transferIntoArray();    //将文件数据存入数组
        //createStudentInformation();  //添加学生信息
        //getStorage().findAll();
        Student findByStudentIdStudent = new Student(); //通过学号查找学生信息（唯一）
        findByStudentIdStudent.findByStudentIdInfo(student,count);
        Student findByStudentNameStudent = new Student(); //通过学生姓名查找学生信息（唯一）
        findByStudentNameStudent.findByStudentNameInfo();
    }
    public static void transferIntoArray(){
        int i = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("student.txt"));
            String line ;
            line = br.readLine();   //先把表头读出
            for(i=0;i<100;i++) {    //对数组内的对象都开辟空间
                student[i] = new Student();
            }
            i= 0;
            while ((line = br.readLine()) != null) {
                Scanner scanner = new Scanner(line);    //以下方式可以过滤一行中的空格
                student[i].setNo(scanner.nextInt());    //序号
                student[i].setName(scanner.next());    //姓名
                student[i].setGender(scanner.next());    //性别
                student[i].setStudentId(scanner.next());    //学号
                student[i].setMobilePhoneNumber(scanner.next());    //手机号
                try {
                    student[i].setMemo(scanner.next());    //备注（可以不填）
                } catch (NoSuchElementException e)  //无内容错误，即没有备注
                {
                    student[i].setMemo(" ");
                }
                scanner.close();
                i++;
            }
            count = i;
        } catch (FileNotFoundException e) { //找不到文件错误
            e.printStackTrace();
        } catch (IOException e) {   //读取行错误
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {   //文件关闭错误
                e.printStackTrace();
            }
        }
    }
    public static void createStudentInformation(){
        Student createStudent = new Student();
        System.out.println("请依次输入姓名 性别 学号 手机号 备注（可以不填）");
        Scanner scanner_ = new Scanner(System.in);  //读取键盘输入
        String line = scanner_.nextLine();
        Scanner scanner = new Scanner(line);    //将读取的一行信息通过以下方式分解
        createStudent.setNo(count+1);
        createStudent.setName(scanner.next());    //姓名
        createStudent.setGender(scanner.next());    //性别
        createStudent.setStudentId(scanner.next());    //学号
        createStudent.setMobilePhoneNumber(scanner.next());    //手机号
        try {
            createStudent.setMemo(scanner.next());    //备注（可以不填）
        } catch (NoSuchElementException e)  //无内容错误，即没有备注
        {
            createStudent.setMemo(" ");
        }
        scanner.close();
        createStudent.createInfo(); //调用添加信息方法
    }
}