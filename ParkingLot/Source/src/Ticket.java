package src;
import java.util.*;

public class Ticket{
    private String vehiclePlate;
    private int slotNumber;
    private Date startDate;
    public Ticket(String vehiclePlate, int slotNumber){
        this.vehiclePlate = vehiclePlate;
        this.slotNumber = slotNumber;
        this.startDate = new Date();
    };
    public String getVehiclePlate(){
        return vehiclePlate;
    }
    public int getSpot(){
        return slotNumber;
    }
    public Date getStartDate(){
        return startDate;
    }
}