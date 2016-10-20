package org;

/**
 * Created by think on 2016/10/10.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.NamingException;
import javax.naming.StringRefAddr;

public class DatebaseConn {
    private static Connection conn;
    public static Connection getConnection() throws
            SQLException,NamingException{
        try{
            String url = "jdbc:mysql://sfwfgfygoadf.rds.sae.sina.com.cn:10671/bookdb";
            String username="root";
            String password="qaz123456Q";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,username,password
            );
            System.out.println("数据库连接成功！");
        }catch(Exception e){
            System.out.println("数据库连接失败！");
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        DatebaseConn dbc = new DatebaseConn();
        try {
            dbc.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
