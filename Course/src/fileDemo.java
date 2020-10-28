import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int i;  //返回字符的ASCII码值
        while ((i = fis.read()) != -1)     //当文件字符被全部读完时，再读一位返回-1
            System.out.println(i);
        fis.close();
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        /*
        int i;  //返回字符的ASCII码值
        while((i = fis.read())!=-1)     //当文件字符被全部读完时，再读一位返回-1
        fos.write(i);
        */
        fos.close();
    }
}
