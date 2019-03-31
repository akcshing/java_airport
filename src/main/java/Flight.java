import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int number;
    private Airport destination;
    private int ticketsAvailable;

    public Flight(Plane plane, int flightNumber, Airport destination){
        this.plane = plane;
        this.number = flightNumber;
        this.destination = destination;
        this.ticketsAvailable = plane.getModel().getCapacity();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int getNumber(){
        return this.number;
    }

    public Airport getDestination(){
        return this.destination;
    }

    public void sellTicket(){
        if (this.ticketsAvailable>0){
            this.ticketsAvailable -= 1;
        }
    }

    public int getTicketsAvailable(){
        return this.ticketsAvailable;
    }
}
