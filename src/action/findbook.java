package action;

import com.opensymphony.xwork2.ActionSupport;
import DAO.FINDDAO;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import entity.book;
import entity.author;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by think on 2016/10/12.
 */
public class findbook extends ActionSupport{
    private String Name;
    private List<book> BOOK;
    private int AuthorID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<book> getBOOK() {
        return BOOK;
    }

    public void setBOOK(List<book> BOOK) {
        this.BOOK = BOOK;
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public String execute() throws UnsupportedEncodingException {
        FINDDAO pd = new FINDDAO();
        AuthorID= pd.findauthor(Name);
        BOOK = pd.findbook(AuthorID);
        return SUCCESS;
    }
}
