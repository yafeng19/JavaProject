public class DataBaseTest {
    public static void main(String args[]){
        MySQL mysql = new MySQL();
        mysql.connect();
        System.out.println("==============================");
        Oracle oracle = new Oracle();
        oracle.connect();
    }
}
