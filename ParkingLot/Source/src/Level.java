package src;

import java.util.*;

public class Level{
    private int levelNumber;
    private List<parkingSpot> mediumParkingSpots;
    private List<parkingSpot> largeParkingSpots;
    public boolean isAvailableMedium;
    public boolean isAvailableLarge;

    private boolean isAvailable;
    public Level(int levelNumber, int numberOfLarge, int numberOfMedium){
        for(int i = 0; i < numberOfLarge; i++){
            largeParkingSpots.add(new parkingSpot(levelNumber*100+i, VehicleType.LARGE));
        }
        System.out.println("Created Level " + levelNumber +" Large parkingspots");
        if(numberOfMedium > 0) isAvailableMedium = true;
        for(int i = 0; i < numberOfMedium; i++){
            mediumParkingSpots.add(new parkingSpot(levelNumber*100+ numberOfLarge+i, VehicleType.MEDIUM));
        }
        System.out.println("Created Level " + levelNumber +" Small parkingspots");
        if(numberOfLarge>0) isAvailableLarge = true;
    }
    public parkingSpot findMediumSpot(){
        for(int i = 0; i < mediumParkingSpots.size(); i++){
            parkingSpot next = mediumParkingSpots.get(i);
            if(!next.isOccupied()){
                return next;
            }
        }
        return null;
    }
    public parkingSpot findLargeSpot(){
        for(int i = 0; i < largeParkingSpots.size(); i++){
            parkingSpot next = largeParkingSpots.get(i);
            if(!next.isOccupied()){
                return next;
            }
        }
        return null;
    }
}