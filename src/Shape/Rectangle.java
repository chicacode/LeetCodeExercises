package Shape;

public class Rectangle extends Shape{
    private double width;
    private double height;
    private double length;

    public Rectangle(double w, double h, double l) {
        this.height = h;
        this.width = w;
        this.length = l;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // Geri's solution
    @Override
    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
    @Override
    public double getVolume() {
        return this.height * this.width * this.length;
    }
}
