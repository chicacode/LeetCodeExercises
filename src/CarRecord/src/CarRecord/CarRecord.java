package CarRecord.src.CarRecord;

import java.io.Serializable;

public record CarRecord(String make, String model, int year) implements Serializable{
    public CarRecord(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }
           
}
