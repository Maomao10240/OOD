package src;

import java.util.*;

public class ParkingLot implements Parking{
    private List<Level> levels;
    private int numLevels;
    public ParkingLot(int numLevels){
        this.numLevels = numLevels;
    }

    public boolean initializeParking(int numberOfLarge, int numberofMedium){
        for(int i = 0; i < numLevels; i++){
            Level level = new Level(i, numberOfLarge, numberofMedium);
            levels.add(level);
        }
        return true;
    }



    @Override
    public Ticket park(Vehicle vehicle){
        parkingSpot nextAvailble;
        if(vehicle.getType() == VehicleType.MEDIUM){
            nextAvailble = findMedium();
        }else{
            nextAvailble = findLarge();
        }
        Ticket ticket = new Ticket(vehicle.getPlateNumber(),nextAvailble.getId());
        nextAvailble.occupySpot();
        return ticket;
        
    }

    public parkingSpot findMedium(){
        for(int i = 0; i < numLevels; i++){
            if(levels.get(i).isAvailableMedium){
                return levels.get(i).findMediumSpot();
            }
        }
        return null;
    }
    public parkingSpot findLarge(){
        for(int i = 0; i < numLevels; i++){
            if(levels.get(i).isAvailableLarge){
                return levels.get(i).findLargeSpot();
            }
        }
        return null;
    }
}