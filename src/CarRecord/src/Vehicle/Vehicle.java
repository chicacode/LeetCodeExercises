package CarRecord.src.Vehicle;

public abstract class Vehicle {

    private int maxSpeed;
    private int acceleration;
    private int breakStrength;
    private String color;
    private String make;

    public Vehicle() {
    }

    public Vehicle(int maxSpeed, int acceleration, int breakStrength, String color, String make) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.breakStrength = breakStrength;
        this.color = color;
        this.make = make;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getBreakStrength() {
        return this.breakStrength;
    }

    public void setBreakStrength(int breakStrength) {
        this.breakStrength = breakStrength;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

   public abstract void drive();

   public abstract void start();

   public abstract void breakAcceleration();

}
