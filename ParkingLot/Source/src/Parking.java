public interface Parking{
    public Ticket park(Vehicle vehicle) throw Exception;
    public int unPark(Ticket ticket) throw Exception;
}