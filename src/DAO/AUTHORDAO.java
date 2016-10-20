package DAO;

import java.sql.*;
import java.util.*;
import org.DatebaseConn;
import entity.author;
/**
 * Created by think on 2016/10/12.
 */
public class AUTHORDAO {
    DatebaseConn dbp = new DatebaseConn();
    public List<author> allauthor(){
        List<author> list = new ArrayList<author>();
        String sql = "select * from author ";
        PreparedStatement ps = null;
        try{
            ps = dbp.getConnection().prepareStatement(sql);//？？？？？？
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
