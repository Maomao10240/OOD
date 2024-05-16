public class Car extends Vehicle{
    private String brand;
    public Car(tring plateNumber, VehicleType type, String brand){
        super(plateNumber, VehicleType.MEDIUM);
        this.brand = brand;
    }
}