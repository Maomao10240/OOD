package src;


public class Car extends Vehicle{
    private String brand;
    public Car(String plateNumber, String brand){
        super(plateNumber, VehicleType.MEDIUM);
        this.brand = brand;
    }
}