package DAO;

import java.sql.*;
import java.util.*;
import org.DatebaseConn;
import entity.book;


/**
 * Created by think on 2016/10/11.
 */
public class PAGEDAO {
    DatebaseConn dbp = new DatebaseConn();
    public List<book> allbook(){
        List<book> list = new ArrayList<book>();
        String sql = "select * from book";
        //" limit ?,?";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
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
    public int getbookamount(){
        int i=0;
        String sql = "select count(*) from book";
        PreparedStatement ps = null;
        try {
            ps = dbp.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                i = rs.getInt(1);
            }
        }
        catch (Exception e){
            e.printStackTrace();;
        }
        return i;
    }
}
