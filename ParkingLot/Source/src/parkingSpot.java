package src;

public class parkingSpot{
    private int Id;
    private boolean occupied;
    private VehicleType type;
    public parkingSpot(int Id, VehicleType type){
        this.Id = Id;
        this.occupied = false;
        this.type = type;
    }
    public boolean isOccupied(){
        return occupied;
    }
    public void setEmpty(){
        this.occupied = false;
    }
    public int getId(){
        return Id;
    }
    public void occupySpot(){
        this.occupied = true;
    }

}