package Admin;
import Person.Person;

public class Admin extends Person{
    private boolean isAdmin;


    public Admin(boolean isAdmin, String userid, String firstName, String lastName, String userName) {
        super(userid, firstName, lastName, userName);
        this.isAdmin = isAdmin;
    }

    public boolean isIsAdmin() {
        return this.isAdmin;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
