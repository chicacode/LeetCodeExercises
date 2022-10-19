package Shape;

public class Sphere extends Cylinder {

    public Sphere(double height, double r) {
        super(height, r);
    }

    @Override
    public double getVolume() {
        return (4/3) * Math.PI * (getRadius() * getRadius() * getRadius());
    }
    
}
