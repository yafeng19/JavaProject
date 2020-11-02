import org.junit.*;
import org.junit.runners.MethodSorters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)   //按照函数名排序进行测试
public class StudentJunitTest {
    private Student stuTest = null;
    private StudentList listTest = null;
    private String result;
    static int countTest = 0;   //信息总条数，全局变量
    static Student[] student = new Student[100];    //学生信息数组，静态全局变量

    @Before
    public void init() {
        stuTest = new Student();
        listTest = new StudentList();
        transferIntoArray();
    }

    @Test
    public void test01_CreateStudentInformation() {
        stuTest.setNo(countTest + 1);
        stuTest.setName("诸葛诞");
        stuTest.setGender("男");
        stuTest.setStudentId("160410305");
        stuTest.setMobilePhoneNumber("13896547263");
        stuTest.setMemo("T6");
        result = listTest.createInfo(student, stuTest, countTest);
        System.out.println(result);
        Assert.assertEquals("添加成功", result);
        countTest++;
    }

    @Test
    public void test02_OnlyOneStudentId() {
        stuTest.setNo(countTest + 1);
        stuTest.setName("诸葛恪");
        stuTest.setGender("男");
        stuTest.setStudentId("160410305");  //学号相同
        stuTest.setMobilePhoneNumber("13562659874");
        stuTest.setMemo("T6");
        result = listTest.createInfo(student, stuTest, countTest);
        System.out.println(result);
        Assert.assertEquals("学号已经在信息表中，不可再添加", result);
    }

    @Test
    public void test03_OnlyOneMobilePhoneNumber() {
        stuTest.setNo(countTest + 1);
        stuTest.setName("诸葛瑾");
        stuTest.setGender("男");
        stuTest.setStudentId("160410306");
        stuTest.setMobilePhoneNumber("13896547263");    //手机号相同
        stuTest.setMemo("T6");
        result = listTest.createInfo(student, stuTest, countTest);
        System.out.println(result);
        Assert.assertEquals("手机号已经在信息表中，不可再添加", result);
    }

    @Test
    public void test04_FindAll() {
        listTest.findAllInfo();
    }

    @Test
    public void test05_FindByStudentIdInfo() {
        stuTest.setStudentId("150811033");
        result = listTest.findByStudentIdInfo(student, stuTest.getStudentId(), countTest);
        System.out.println(result);
        Assert.assertEquals("查找成功", result);
    }

    @Test
    public void test06_FindByStudentNameInfo() {
        stuTest.setName("太史慈");
        result = listTest.findByStudentNameInfo(student, stuTest.getName(), countTest);
        System.out.println(result);
        Assert.assertEquals("查找成功", result);
    }

    @Test
    public void test07_UpdateInfo() {
        stuTest.setName("夏侯渊");
        stuTest.setGender("男");
        stuTest.setStudentId("141080320");
        stuTest.setMobilePhoneNumber("13562659875");    //修改手机号
        stuTest.setMemo("T7");      //修改备注
        result = listTest.updateInfo(student, stuTest, countTest);
        System.out.println(result);
        Assert.assertEquals("修改成功", result);
    }

    @Test
    public void test08_DeleteInfo() {
        stuTest.setStudentId("171090221");
        result = listTest.deleteInfo(student, stuTest, countTest);
        System.out.println(result);
        Assert.assertEquals("删除成功", result);
    }

    @After
    public void close() {
        System.out.println("该项测试结束");
    }

    public static void transferIntoArray() {
        int i = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("student.txt"));
            String line = br.readLine();   //先把表头读出
            for (i = 0; i < 100; i++) {    //对数组内的对象都开辟空间
                student[i] = new Student();
            }
            i = 0;
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
            countTest = i;
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

}
