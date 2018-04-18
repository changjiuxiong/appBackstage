package util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.*;
import javax.sql.DataSource;

public class JdbcUtil {
	public static Connection getConnection() throws Exception{
		Connection conn = null;  	  

        String url = "jdbc:mysql://182.254.233.89:3306/test?user=root&password=123456&useUnicode=true&characterEncoding=UTF8";  

  
            Class.forName("com.mysql.jdbc.Driver");
  
          
  
            System.out.println("加载mysql");  
  
            // һ��Connection����һ�����ݿ�����  
  
            conn = DriverManager.getConnection(url);  
		return conn;
	}
}
