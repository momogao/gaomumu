package connUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
    /**
     * 获取数据库连接
     * @return Connection 对象
     *
     */
    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/mysql1?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
            String username="root";
            String password="116703";
            conn= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }
}
