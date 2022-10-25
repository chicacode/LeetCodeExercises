package CarRecord.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import CarRecord.src.Car.Car;
import CarRecord.src.CarRecord.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Class Car Instantiated
        Car tesla = new Car("Model 3", 2016, true, 5, 5, 4, 2, 190, 67, 32, " Gray", "Tesla");

        System.out.println(tesla);
        // • Make a record to store information about a car.
        CarRecord bmw = new CarRecord(" BMW ", " Serie 5", 2020);
        CarRecord nissan = new CarRecord(" Nissan ", " Murano", 2009);
        CarRecord ferrari = new CarRecord(" Ferrari ", " Arno XI", 2017);
        CarRecord mercedes = new CarRecord(" Mercedes Benz ", " Clase A Berlina", 2010);
        

        // • Create an ArrayList of Car objects.
       
        try{
        ArrayList<CarRecord> recordOfCarsList = new ArrayList<CarRecord>(5);
        List<CarRecord> carCollections = new ArrayList();
        
        carCollections.add(bmw);
        carCollections.add(mercedes);
        carCollections.add(ferrari);
        carCollections.add(nissan);
        recordOfCarsList.addAll(carCollections);

        System.out.println(recordOfCarsList);
        recordOfCarsList.sort(Comparator.comparingInt(CarRecord::getYear));

        for(CarRecord car : recordOfCarsList){
        // • Sort the ArrayList of cars by year (Ascending) and print them out.
            
            System.out.println(" XXXXXXXXXXXXXXXXXXXXX LIST XXXXXXXXXXXXXXXXXXXX" );
            System.out.println(car);
            System.out.println(" XXXXXXXXXXXXXXXXXXXXX STRING XXXXXXXXXXXXXXXXXXXX" );
            System.out.println(" make: " +  car.make() + "model: " +  car.model() + " year: " + car.year());
            System.out.println("  \n " );
        }
       
        }catch(Exception e){
            System.out.println("ERROR: "+ e);
        }

    }

}
