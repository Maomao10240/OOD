package src;

import java.util.PriorityQueue;
import java.util.Queue;


public class ElevatorController{
    //request to go up: pick up the person from bottom to up
    Queue<Request> upRequest = new PriorityQueue<>((a,b)->a.getDesFloor() - b.getDesFloor());
    //request to go down; pick up the person from top to bottom
    Queue<Request> downRequest = new PriorityQueue<>((b,a)->a.getDesFloor() - b.getDesFloor());
    Elevator elevator = new Elevator(0);
    public ElevatorController(){
    }
    //start from floor 0; go up and then go down; if not started at floor 0: go up and then go down and go up;
    public void addRequest(Request request){
        if(request.getDirection() == Status.UP){
            if(request.getCurrentFloor() != elevator.getCurrentFloor()){ //need to go up to pick up the person first; 
                upRequest.offer(new Request(request.getCurrentFloor(), request.getCurrentFloor(), Status.UP));
            }
            upRequest.offer(request);
        }else{
            if(request.getCurrentFloor() != elevator.getCurrentFloor()){ //need to go down/up to pick up the person first; 
                downRequest.offer(new Request(request.getCurrentFloor(), request.getCurrentFloor(), Status.UP));
            }
            downRequest.offer(request);
        }
        
    }
    //Request one go from floor 2 to 4; Request two go from floor 5 to floor 1;
    public void processRequests(){
        while(!upRequest.isEmpty()){
            Request tmp = upRequest.poll();
            elevator.setCurrentFloor(tmp.getDesFloor());
            System.out.println("Elevator goes to floor: " + tmp.getDesFloor());
        }
        while(!downRequest.isEmpty()){
            Request tmp = downRequest.poll();
            elevator.setCurrentFloor(tmp.getDesFloor());
            System.out.println("Elevator goes to floor: " + tmp.getDesFloor());
        }
    }
    public static void main(String[] args){
        ElevatorController controller = new ElevatorController();
        Request request1 = new Request(2, 4, Status.UP);
        Request request2 = new Request(5, 1, Status.DOWN);
        controller.addRequest(request1);
        controller.addRequest(request2);
        controller.processRequests();

    }


}