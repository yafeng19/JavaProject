import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcDemo {
    public void wholeExample(){
        try {
//1.注册驱动
            //DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());  //依赖这个类
            Class.forName("com.mysql.jdbc.Driver");
//2.获取数据库连接
            String Url= "jdbc:mysql://localhost:3306/test";
            Connection conn = DriverManager.getConnection(Url,"root","");
//3.创建执行句柄
            Statement stmt =conn.createStatement();
//4.执行sql语句
            ResultSet rs = stmt.executeQuery("select * from user");
//5.处理执行结果
            while(rs.next()){
                System.out.println(
                        "id:" + rs.getInt(1)
                                +"\tname:" + rs.getString(2)
                                +"\tbirthday:" + rs.getDate(3)
                                +"\tmoney:" + rs.getFloat(4));
            }
//6.释放资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}