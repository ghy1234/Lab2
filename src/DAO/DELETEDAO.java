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
public class DELETEDAO {
    DatebaseConn dbp = new DatebaseConn();
    public int deletebook(int isbn){
        int i = 0;
        String sql = "delete from book where ISBN = ?";
        PreparedStatement ps = null;
        try {
            ps = dbp.getConnection().prepareStatement(sql);
            ps.setInt(1, isbn);
            i = ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }
}
