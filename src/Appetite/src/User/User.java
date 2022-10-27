package User;

import java.util.InputMismatchException;
import java.util.Scanner;

import Enums.GoalsOption;
import Person.Person;

public class User extends Person {

    private int phone;
    private String birthday;
    private String gender;
    private int age;
    private double measuresWeight;
    private double measuresHeight;
    private double measuresNeck;
    private double measuresWaist;
    private double totalBmi;
    private GoalsOption userGoal;

    public User(int phone, String birthday, String gender, int age, double measuresWeight, double measuresHeight,
            double measuresNeck, double measuresWaist, double totalBmi, String userid, String firstName,
            String lastName, String userName, GoalsOption setGoal) {
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
        this.userGoal = setGoal;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
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

    public void getUserInfo() {
        Scanner userInfoData;

        try {

            userInfoData = new Scanner(System.in);
            System.out.println("Please enter your firstname");
            String name = userInfoData.next();

            System.out.println("Please enter your lastName");
            String lastName = userInfoData.next();

            System.out.println("Please enter your userName");
            String userName = userInfoData.next();

            System.out.println("Please enter your phone");
            int phone = userInfoData.nextInt();

            System.out.println("Please enter your birthday");
            String birthday = userInfoData.next();

            System.out.println("Please enter your gender");
            String gender = userInfoData.next();

            System.out.println("Please enter your age");
            int age = userInfoData.nextInt();

            System.out.println("Please enter your weight");
            double measuresWeight = userInfoData.nextDouble();

            System.out.println("Please enter your height");
            double measuresHeight = userInfoData.nextDouble();

            System.out.println("Please enter your cm neck");
            double neck = userInfoData.nextDouble();

            System.out.println("Please enter your cm waist");
            double measuresWaist = userInfoData.nextDouble();

            System.out.println("Please enter your BMI");
            double bmi = userInfoData.nextDouble();

            // System.out.println("Please enter your Goal");
            // String goal = userInfoData.next();

            // GoalsOption userGoal = GoalsOption.valueOf(goal);

            User user = new User(
                    phone,
                    birthday,
                    gender,
                    age,
                    measuresWeight,
                    measuresHeight,
                    neck,
                    measuresWaist,
                    bmi,
                    userName,
                    name,
                    lastName,
                    userName,
                    userGoal);

            userInfoData.close();
            System.out.println("-------------");
            System.out.println("Welcome to APPETITE" + user.getUserName());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }
}
