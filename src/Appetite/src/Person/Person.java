package Person;
import java.sql.Date;

import Enums.GoalsOption;
import User.User;

public class Person extends User{


    private int phone;
    private Date birthday;
    private String gender;
    private int age;
    private double measuresWeight;
    private double measuresHeight;
    private double measuresNeck;
    private double measuresWaist;
    private double totalBmi;
    private GoalsOption userGoal;


    public Person(int phone, Date birthday, String gender, int age, double measuresWeight, double measuresHeight, double measuresNeck, double measuresWaist, double totalBmi, String userid, String firstName, String lastName, String userName, GoalsOption userGoal) {
        super(userid, firstName, lastName, userName);
        this.phone = phone;
        this.birthday = birthday;
        this.gender = gender;
        this.age = age;
        this.measuresWeight = measuresWeight;
        this.measuresHeight = measuresHeight;
        this.measuresNeck = measuresNeck;
        this.measuresWaist = measuresWaist;
        this.totalBmi = totalBmi;
        this.userGoal = userGoal;
    }


    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMeasuresWeight() {
        return this.measuresWeight;
    }

    public void setMeasuresWeight(double measuresWeight) {
        this.measuresWeight = measuresWeight;
    }

    public double getMeasuresHeight() {
        return this.measuresHeight;
    }

    public void setMeasuresHeight(double measuresHeight) {
        this.measuresHeight = measuresHeight;
    }

    public double getMeasuresNeck() {
        return this.measuresNeck;
    }

    public void setMeasuresNeck(double measuresNeck) {
        this.measuresNeck = measuresNeck;
    }

    public double getMeasuresWaist() {
        return this.measuresWaist;
    }

    public void setMeasuresWaist(double measuresWaist) {
        this.measuresWaist = measuresWaist;
    }

    public double getTotalBmi() {
        return this.totalBmi;
    }

    public void setTotalBmi(double totalBmi) {
        this.totalBmi = totalBmi;
    }

    public GoalsOption getUserGoal() {
        return userGoal;
    }

    public void setUserGoal(GoalsOption userGoal) {
        this.userGoal = userGoal;
    }
    

}