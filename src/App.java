import Shape.Circle;
import Shape.Cylinder;
import Shape.Rectangle;
import Shape.Sphere;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Rectangle r1 = new Rectangle(20, 50, 0);
        Circle c1 = new Circle(20);
       
        final DecimalFormat decfor = new DecimalFormat("0.00");

        double c1Circle = c1.getArea();
        double r1Rectangle =  r1.getArea();

        double p1Rectangle = r1.getPerimeter();
        double p1Circle = c1.getPerimeter();
        double c1CircleRadius = c1.getRadius();
       
        Cylinder c2Cylinder = new Cylinder(90, c1CircleRadius);

        Sphere s1 = new Sphere(c2Cylinder.getHeight(), c1CircleRadius);

        System.out.println(" ***************** AREA ***************** ");
        System.out.println("Area of Rectangle R1 is : " + r1Rectangle);
        System.out.printf("Area of Circle C1 is : " + decfor.format(c1Circle) + " \n");

        System.out.println(" ***************** PERIMETERS ***************** ");
        System.out.println("Perimeter of Rectangle R1 is : " + p1Rectangle);
        System.out.println("Perimeter of Circle C1 is : " + decfor.format(p1Circle));


        System.out.println(" ***************** RADIUS ***************** ");
        System.out.println("Radius of Circle C1 is : " + c1CircleRadius);

        System.out.println(" ***************** VOLUME ***************** ");
        System.out.println("Volume of Cylinder is : " + decfor.format(c2Cylinder.getVolume()));
        System.out.println("Volume of Sphere s1 is : " + decfor.format(s1.getVolume()));
    }
}
