package action;


import com.opensymphony.xwork2.ActionSupport;
import DAO.ADDDAO;
import DAO.FINDDAO;
/**
 * Created by think on 2016/10/13.
 */
public class addauthor extends ActionSupport{
    private String name;
    private int age;
    private String country;

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
        int i = pd.addauthor(name, age, country);
        if (i != 0) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }
}
