package src;


public class main {

	public static void main(String[] args) throws Exception {
		ParkingLot parkingLot = new ParkingLot(3);

		parkingLot.initializeParking(2, 4);

	    Car car = new Car("Mh12", "BMW");
	    Car car1 = new Car("Mh", "BMW");

		Ticket ticket = parkingLot.park(car);
        Ticket ticket1 = parkingLot.park(car1);

		System.out.println(ticket.getSpot());
		System.out.println(ticket1.getSpot());

		Bus bus = new Bus("Mh13", "META");

		Ticket ticket2 = parkingLot.park(bus);
		System.out.println(ticket2.getSpot());
		
		int cost1 = parkingLot.unPark(ticket2);
		System.out.println(cost1);
		
		int cost2 = parkingLot.unPark(ticket2);
		System.out.println(cost2);

	}

}