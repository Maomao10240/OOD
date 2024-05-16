package src;


public interface Parking{
    //return ticket
    public Ticket park(Vehicle vehicle) throws Exception;
    //return how much to pay
    public int unPark(Ticket ticket) throws Exception;
}