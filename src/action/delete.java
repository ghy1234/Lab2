package action;

import com.opensymphony.xwork2.ActionSupport;
import DAO.DELETEDAO;

/**
 * Created by think on 2016/10/12.
 */
public class delete extends ActionSupport{
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String execute() {
        DELETEDAO pd = new DELETEDAO();
        int i = pd.deletebook(isbn);
        if(i>0)
        {
            return SUCCESS;
        }
        else
        {
            return INPUT;
        }
    }
}
