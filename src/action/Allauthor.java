package action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import DAO.AUTHORDAO;
import entity.author;
/**
 * Created by think on 2016/10/12.
 */
public class Allauthor extends ActionSupport{
    private List<author> allauthor;

    public List<author> getAllauthor() {
        return allauthor;
    }

    public void setAllauthor(List<author> allauthor) {
        this.allauthor = allauthor;
    }

    public String execute(){
        AUTHORDAO pd = new AUTHORDAO();
        allauthor = pd.allauthor();
        return SUCCESS;
    }
}
