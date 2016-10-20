package DAO;

import java.sql.*;
import java.util.*;

import entity.author;
import org.DatebaseConn;
import entity.book;
import java.util.List;

/**
 * Created by think on 2016/10/12.
 */
public class DETAILDAO {
    DatebaseConn dbp = new DatebaseConn();
    public List<book> findbookdetail(String title){
        List<book> list = new ArrayList<book>();
        String sql = "select * from book where Title = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
            ps.setString(1,title);
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

    public int giveauthorid(String title){
        int authorid=0;
        String sql = "select * from book where Title = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);
            ps.setString(1,title);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                authorid = rs.getInt(3);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return authorid;
    }

    public List<author> findauthordetail(int authorid){
        List<author> list = new ArrayList<author>();
        String sql = "select * from author where AuthorID = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
            ps.setInt(1,authorid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                author AUTHOR = new author();
                AUTHOR.setAuthorID(rs.getInt("AuthorID"));
                AUTHOR.setName(rs.getString("Name"));
                AUTHOR.setAge(rs.getInt("Age"));
                AUTHOR.setCountry(rs.getString("Country"));
                list.add(AUTHOR);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }


}
