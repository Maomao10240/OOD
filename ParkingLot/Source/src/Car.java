package src;


public class Car extends Vehicle{
    private String brand;
    public Car(String plateNumber, VehicleType type, String brand){
        super(plateNumber, VehicleType.MEDIUM);
        this.brand = brand;
    }
}