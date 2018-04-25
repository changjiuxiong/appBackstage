package util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.*;
import javax.sql.DataSource;

public class JdbcUtil {
	public static Connection getConnection() throws Exception{
		Connection conn = null;
        String url = "jdbc:mysql://118.24.34.244:3306/test?user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url);  
		return conn;
	}
}
