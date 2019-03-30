import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int number;
    private Airport destination;

    public Flight(Plane plane, int flightNumber, Airport destination){
        this.plane = plane;
        this.number = flightNumber;
        this.destination = destination;
    }


}
