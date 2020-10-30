import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextFile implements Storage{
    @Override
    public void create() {
        System.out.println("create()");

    }

    @Override
    public void findAll() {
        int i = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("student.txt"));
            String line ;
            while ((line = br.readLine()) != null)
                System.out.println(line);
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


    @Override
    public void findByStudentId(Student[] student, int count) {
        Scanner scanner = new Scanner(System.in);  //读取键盘输入
        String findStudentId = scanner.next();
        int i = 0;
        for(i = 0; i<count;i++){
            if(student[i].getStudentId().equals(findStudentId))
            {
                System.out.println(student[i].getStudentId());
                break;
            }
            else {
                System.out.println("not found");
            }
        }
    }

    @Override
    public void findByStudentName() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
