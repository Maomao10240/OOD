public class Bus extends Vehicle{
    private String company;
    public Bus(tring plateNumber, VehicleType type, String company){
        super(plateNumber, VehicleType.LARGE);
        this.company = company
    }
}