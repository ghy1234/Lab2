package DAO;

import java.sql.*;
import java.util.*;

import entity.author;
import org.DatebaseConn;
import entity.book;

import javax.naming.NamingException;

/**
 * Created by think on 2016/10/13.
 */
public class ADDDAO {
    DatebaseConn dbp = new DatebaseConn();
    public int addbook(int ISBN, String Title, int AuthorID, String Publisher, String PublishDate, int Price){
        int i = 0;
        String sql = "insert into book value(?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = dbp.getConnection().prepareStatement(sql);
            ps.setInt(1,ISBN);
            ps.setString(2,Title);
            ps.setInt(3,AuthorID);
            ps.setString(4,Publisher);
            ps.setString(5,PublishDate);
            ps.setInt(6,Price);
            i = ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }

    public int addauthor(String Name,int Age,String Country){
        int i = 0;
        String sql = "insert into author value(0,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = dbp.getConnection().prepareStatement(sql);
            ps.setString(1,Name);
            ps.setInt(2,Age);
            ps.setString(3,Country);
            i = ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }
}
