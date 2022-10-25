package CarRecord.src.Car;

import CarRecord.src.Vehicle.Vehicle;

public class Car extends Vehicle {

        // - make (String)
        // - model (String)
        // - year (int)
    private String model;
    private int year;
    private boolean isAutomatic;
    private int numberOfPassengers;
    private int numberOfDoors;
    private int numberOfWheels;
    private int numberOfLuggages;

    public Car(String model, int year, boolean isAutomatic, int numberOfPassengers, int numberOfDoors, int numberOfWheels, int numberOfLuggages, int maxSpeed, int acceleration, int breakStrength, String color, String make) {
        super(maxSpeed, acceleration, breakStrength, color, make);
        this.model = model;
        this.year = year;
        this.isAutomatic = isAutomatic;
        this. numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.numberOfLuggages = numberOfLuggages;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean isIsAutomatic() {
        return this.isAutomatic;
    }

    public boolean getIsAutomatic() {
        return this.isAutomatic;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfLuggages() {
        return this.numberOfLuggages;
    }

    public void setNumberOfLuggages(int numberOfLuggages) {
        this.numberOfLuggages = numberOfLuggages;
    }

    @Override
    public void drive(){
        System.out.println("Driving the car");
    }

    @Override
    public void start(){
        System.out.println("Starting the car");
    }

    @Override
    public void breakAcceleration(){
        System.out.println("Breaking the car");
    }
       
    public String toString(){
        return " Car make: " + this.getMake() + " model: " + this.model + " year: " + this.year + " number of passengers availables: " + this.numberOfPassengers ;
    }
    
}
