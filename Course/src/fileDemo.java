import java.io.FileInputStream;
import java.io.IOException;
public class fileDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("a.txt");
        int x = fis.read();
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        fis.close();
    }
}
