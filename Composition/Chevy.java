import java.util.*;

class Car{
    protected double miles;
    protected String carType;

    Car(){
        this.miles = 0;
        this.carType = "";
    }

    Car(double miles, String carType){
        this.miles = miles;
        this.carType = carType;
    }

}

class ChevyEngine{
    String engineType;
    double engineSize;
    String engineSeries;

    ChevyEngine(){
        this.engineType = "";
        this.engineSize = 0;
        this.engineSeries = "";
    }

    ChevyEngine(String engineType, double engineSize, String engineSeries){
        this.engineType = engineType;
        this.engineSize = engineSize;
        this.engineSeries = engineSeries;
    }

}

class ChevyProduct extends Car{

    private int year;
    private String make;
    private String model;
    ChevyEngine engine;

    ChevyProduct(){
        super();
        engine = new ChevyEngine();
    }

    ChevyProduct(int year, String make, String model, double miles, String carType, String engineSeries, double engineSize, String engineType){
        super(miles, carType);
        this.make = make;
        this.model = model;
        this.year = year;
        engine = new ChevyEngine(engineType, engineSize, engineSeries);
    }

    public void showInfo(){
        System.out.println("Vehicle Type: " + carType + "\nVehicle Year: " + year + "\nVehicle Make: " + this.make +
            "\nVehicle Model: " + this.model + "\nVehicle Miles: " + miles + "\nEngine Type: " + engine.engineType +
            "\nEngine Series: " + engine.engineSeries + "\nEngine Size: " + engine.engineSize);
    }
}

public class Chevy{
    public static void main(String[] args) {
        ChevyProduct test = new ChevyProduct(1999, "Chevy", "Tahoe", 2000, "Truck", "Hemi", 5.0, "V8");
        test.showInfo();
    }
}

