package src;


public class Bus extends Vehicle{
    private String company;
    public Bus(String plateNumber, String company){
        super(plateNumber, VehicleType.LARGE);
        this.company = company;
    }
}