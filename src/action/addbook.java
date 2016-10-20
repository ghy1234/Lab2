package action;

import com.opensymphony.xwork2.ActionSupport;
import DAO.ADDDAO;
import DAO.FINDDAO;
/**
 * Created by think on 2016/10/13.
 */
public class addbook extends ActionSupport{
    private int ISBN;
    private String title;
    private int authorid;
    private String publisher;
    private String publishdate;
    private int price;


    private String name;
    private int age;
    private String country;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String execute(){
        ADDDAO pd = new ADDDAO();
        FINDDAO pd1 = new FINDDAO();
        authorid = pd1.findauthor(name);
        if(authorid == 0)
        {
            return "noauthor";
        }
        else {
            int i = pd.addbook(ISBN, title, authorid, publisher, publishdate, price);
            if (i != 0) {
                return SUCCESS;
            } else {
                return INPUT;
            }
        }
    }

}
