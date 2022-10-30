package User;

import java.util.InputMismatchException;
import java.util.Scanner;

import Enums.GoalsOption;
import Person.Person;

public class User extends Person {

    private long phone;
    private String birthday;
    private String gender;
    private double measuresWeight;
    private double measuresHeight;
    private double totalBmi;
    private GoalsOption userGoal;

    public User(long phone, String birthday, String gender, double measuresWeight, double measuresHeight,
            double totalBmi, String userid, String firstName,
            String lastName, String userName, GoalsOption setGoal) {
        super(userid, firstName, lastName, userName);
        this.phone = phone;
        this.birthday = birthday;
        this.gender = gender;
        this.measuresWeight = measuresWeight;
        this.measuresHeight = measuresHeight;
        this.totalBmi = totalBmi;
        this.userGoal = setGoal;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
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

    public static double BMI(double measuresHeight, double measuresWeight) {
        double bmi = measuresWeight / (measuresHeight * measuresHeight);
        return bmi;
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

            try {
                System.out.println("Please enter your phone number");
                long phoneNumber = userInfoData.nextLong();
                phone = phoneNumber;

            } catch (NumberFormatException e) {
                System.out.println(" Input error! non numeric data");
            }

            System.out.println("Your phone number is: " + phone);

            System.out.println("Enter birthdate in the following format MM-dd-YYYY:");
            String birthday = userInfoData.next();

            System.out.println("Enter your gender");
            String gender = userInfoData.next();

            System.out.println("Enter your WEIGHT in KG");
            double measuresWeight = userInfoData.nextDouble();

            try {
                System.out.println("Enter your HEIGHT in CM (ex:1.65)");
                double height = userInfoData.nextDouble();
                measuresHeight = height;
            } catch (NumberFormatException e) {
                System.out.println(" Input error! non entered a valid number");
            }
            double bmi = BMI(measuresHeight, measuresWeight);

            ;

            System.out.println("Your Body Mass Index (BMI) is ");
            System.out.printf("%.2f", bmi);
            System.out.println("  kg/m2 so you are: ");

            // Conditions to find out BMI category
            if (bmi < 18.5)
                System.out.print(" Underweight");

            else if (bmi >= 18.5 && bmi < 24.9)
                System.out.print(" Healthy");

            else if (bmi >= 24.9 && bmi < 30)
                System.out.print(" Overweight");

            else if (bmi >= 30)
                System.out.print(" Suffering from Obesity");

            System.out.println(" \n");
            System.out.println(" XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println(" Please enter your Goal");
            System.out.println(" A. Lose Body Fat");
            System.out.println(" B. Increase Body Muscle");
            String goal = userInfoData.next();

            GoalsOption userGoal = GoalsOption.valueOf(goal);


            try{
    
                if (GoalsOption.B == userGoal) {
                    System.out.println("A. Increase Muscle");

                } else {
                    System.out.println("B. Lose Fat");

                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

            System.out.println(" Your goal is: " + userGoal);

            User user = new User(
                    phone,
                    birthday,
                    gender,
                    measuresWeight,
                    measuresHeight,
                    bmi,
                    userName,
                    name,
                    lastName,
                    userName,
                    userGoal);

            userInfoData.close();
            System.out.println("-------------");
            System.out.println("Welcome to APPETITE: " + user.getUserName());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }
}
