package src;

public class Elevator{
    /* 1. request has a direction and the floor 
     * 2. A person request from floor 0 to floor 5. On the way, another person in floor 1 wants to go to floor 0. The elevator will go to floor 5 first and then go to floor 1 to pick the other person.
     */
    private int currentFloor;
    Status status;
    public Elevator(int currentFloor){
        this.currentFloor = currentFloor;
        this.status = Status.IDLE;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void setCurrentFloor(int floor){
        this.currentFloor = floor;
    }
}