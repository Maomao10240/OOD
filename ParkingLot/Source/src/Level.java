public class Level{
    private int levelNumber;
    private List<parkingSpot> mediumParkingSpots;
    private List<parkingSpot> largeParkingSpots;

    private boolean isAvailable;
    public Level(int levelNumber, int numberofMedium, int numberofMedium){
        for(int i = 0; i < numberOfLarge; i++){
            parkingSpots.add(new parkingSpot(levelNumber*100+i, VehicleType.LARGE));
        }
        System.out.println("Created Level " + levelNumber +" Large parkingspots");
        for(int i = 0; i < numberofMedium; i++){
            parkingSpots.add(new parkingSpot(levelNumber+ numberOfLarge+i, VehicleType.MEDIUM));
        }
        System.out.println("Created Level " + levelNumber +" Small parkingspots");
    }
}