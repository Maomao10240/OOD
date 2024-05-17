package src;

public class Request{
    private int currentFloor;
    private int desFloor;
    private Status direction;
    public Request(int currentFloor, int desFloor, Status direction){
        this.currentFloor = currentFloor;
        this.desFloor = desFloor;
        this.direction = direction;

    }
    public Status getDirection(){
        return direction;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public int getDesFloor(){
        return desFloor;
    }
}