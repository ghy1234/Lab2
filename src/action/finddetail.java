package action;

import com.opensymphony.xwork2.ActionSupport;
import DAO.DETAILDAO;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import entity.book;
import entity.author;

import java.util.List;

/**
 * Created by think on 2016/10/12.
 */
public class finddetail extends ActionSupport{
    private String title;
    private List<book> BOOK;
    private List<author> AUTHOR;
    private int authorid;

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<book> getBOOK() {
        return BOOK;
    }

    public void setBOOK(List<book> BOOK) {
        this.BOOK = BOOK;
    }

    public List<author> getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(List<author> AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public String execute(){
        DETAILDAO pd = new DETAILDAO();
        BOOK = pd.findbookdetail(title);
        authorid = pd.giveauthorid(title);
        AUTHOR = pd.findauthordetail(authorid);
        return SUCCESS;
    }
}
