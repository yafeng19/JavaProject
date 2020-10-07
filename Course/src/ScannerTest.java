import java.math.BigDecimal;
import java.util.Scanner;
import static java.lang.System.exit;

public class ScannerTest{
    public static void main(String[] args){
        int [] nums = {8,4,2,1,23,344,12};
        String inputStr;
        Scanner input = new Scanner(System.in);
        /*try {
            inputStr = new BigDecimal(input.toString()).toString();
        } catch (Exception e) {
            System.out.println("输入有误");
        }*/
        for(int i = 0; i < nums.length; i++)
        {
            if(input.nextInt() == nums[i])
            {
                System.out.println("猜对了");
                exit(0);
            }
        }
        System.out.println("没猜对");
    }
}
