package DAO;


import java.sql.*;
import java.util.*;
import org.DatebaseConn;
import entity.book;



/**
 * Created by think on 2016/10/12.
 */
public class FINDDAO {
    DatebaseConn dbp = new DatebaseConn();
    public int findauthor(String Name){
        int authorid=0;
        String sql = "select * from author where Name = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);
            ps.setString(1,Name);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                authorid = rs.getInt(1);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return authorid;
    }
    public List<book> findbook(int authorid){
        List<book> list = new ArrayList<book>();
        String sql = "select * from book where AuthorID = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
            ps.setInt(1,authorid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                book BOOK = new book();
                BOOK.setISBN(rs.getInt("ISBN"));
                BOOK.setTitle(rs.getString("Title"));
                BOOK.setAuthorID(rs.getInt("AuthorID"));
                BOOK.setPublisher(rs.getString("Publisher"));
                BOOK.setPublishDate(rs.getString("PublishDate"));
                BOOK.setPrice(rs.getInt("Price"));
                list.add(BOOK);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
