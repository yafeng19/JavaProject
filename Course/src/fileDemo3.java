// 小数组拷贝标准写法
import java.io.*;
public class fileDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("f.txt");
                FileOutputStream fos = new FileOutputStream("g.txt");
        byte[] arr = new byte[1024 * 8];
        int len;
        while ((len = fis.read(arr)) != -1) { //勿忘arr，否则返回的就不是读取的字节个数,而是字节的码表值
            fos.write(arr,0,len); //将指定 byte 数组中从偏移量 off开始的
        }                        //len 个字节写入此文件输出流
        fis.close();
        fos.close();
    }
}