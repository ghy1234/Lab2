package DAO;

import java.sql.*;
import java.util.*;

import entity.author;
import org.DatebaseConn;
import entity.book;

import javax.naming.NamingException;
import java.util.List;
/**
 * Created by think on 2016/10/12.
 */
public class UPDATEDAO {
    DatebaseConn dbp = new DatebaseConn();
    public book selectbook(int isbn)
    {
        book BOOK = new book();
        String sql = "select * from book where ISBN = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
            ps.setInt(1,isbn);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                BOOK.setISBN(rs.getInt("ISBN"));
                BOOK.setTitle(rs.getString("Title"));
                BOOK.setAuthorID(rs.getInt("AuthorID"));
                BOOK.setPublisher(rs.getString("Publisher"));
                BOOK.setPublishDate(rs.getString("PublishDate"));
                BOOK.setPrice(rs.getInt("Price"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return BOOK;
    }

    public author selectauthor(String name){
        author AUTHOR = new author();
        String sql = "select * from author where Name = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                AUTHOR.setAuthorID(rs.getInt("AuthorID"));
                AUTHOR.setName(rs.getString("Name"));
                AUTHOR.setAge(rs.getInt("Age"));
                AUTHOR.setCountry(rs.getString("Country"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return AUTHOR;
    }

    public int updatebook(book BOOK){
        int i = 0;
        String sql = "update book set AuthorID=?,Publisher=?,PublishDate=?,Price=? where ISBN = ?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);
            ps.setInt(1,BOOK.getAuthorID());
            ps.setString(2,BOOK.getPublisher());
            ps.setString(3,BOOK.getPublishDate());
            ps.setInt(4,BOOK.getPrice());
            ps.setInt(5,BOOK.getISBN());
            i = ps.executeUpdate();
            ps.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }
}
