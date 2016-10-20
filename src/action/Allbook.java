package action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import DAO.PAGEDAO;
import entity.book;
/**
 * Created by think on 2016/10/11.
 */
public class Allbook extends ActionSupport{
    private int pagenumber;
    private int pagesize;
    private int totalpage;
    private List<book> allbook;

    public int getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public List<book> getAllbook() {
        return allbook;
    }

    public void setAllbook(List<book> allbook) {
        this.allbook = allbook;
    }

    public String execute(){
        PAGEDAO pd = new PAGEDAO();
        allbook = pd.allbook();
        return SUCCESS;
    }



}
