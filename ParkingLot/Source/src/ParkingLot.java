public class ParkingLot implements Parking{
    private List<Level> levels;


    public boolean initializeParking(int numLevels, int numberOfLarge, int numberofMedium){
        for(int i = 0; i < numLevels; i++){
            Level level = new Level(i, numberOfLarge, numberofMedium);
            levels.add(level);
        }
        return true;
    }



    @Override
    public Ticket park(Vehicle vehicle){
        parkingSpot nextAvailble;
        
    }
}