import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileDemo2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("test_read.txt");
        FileOutputStream fos = new FileOutputStream("test_write.txt");
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        fos.write(arr);
        fis.close();
        fos.close();
    }
}
