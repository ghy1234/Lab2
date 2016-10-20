package action;

import com.opensymphony.xwork2.ActionSupport;
import DAO.UPDATEDAO;
import entity.author;
import entity.book;
/**
 * Created by think on 2016/10/12.
 */
public class updatebook extends ActionSupport{
    private String name;
    private String publisher;
    private String publishdate;
    private int price;
    private int isbn;
    private int authorid;

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String execute(){
        book BOOK = new book();
        author AUTHOR = new author();
        UPDATEDAO pd = new UPDATEDAO();
        BOOK = pd.selectbook(isbn);
        AUTHOR = pd.selectauthor(name);
        authorid = AUTHOR.getAuthorID();
        BOOK.setAuthorID(authorid);
        BOOK.setPublishDate(publishdate);
        BOOK.setPublisher(publisher);
        BOOK.setPrice(price);
        int i = pd.updatebook(BOOK);
        if(i > 0)
        {
            return SUCCESS;
        }
        else
        {
            return INPUT;
        }
    }

}

