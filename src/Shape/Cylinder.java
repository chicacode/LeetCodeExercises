package Shape;

public class Cylinder extends Circle {

    private double height;


    public Cylinder(double height, double r) {
        super(r);
        this.height = height;

    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Geometry
    @Override
    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * this.height;
    }
    
}
