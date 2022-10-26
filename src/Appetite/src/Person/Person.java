package Person;
import java.util.UUID;

public class Person {

    private final String userid;
    private final String firstName;
    private final String lastName;
    private String userName;


    public Person(String userid, String firstName, String lastName, String userName) {
        this.userid = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}