package src;


public abstract class Vehicle{
    protected String plateNumber;
    protected VehicleType type;
    public Vehicle(String plateNumber, VehicleType type){
        this.plateNumber = plateNumber;
        this.type = type;
    }
    public String getPlateNumber(){
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }
    public VehicleType getType(){
        return type;
    }
    public void setType(VehicleType type){
        this.type = type;
    }
}