import java.util.ArrayList;

public class Plane {

    private PlaneModel model;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneModel model, Airline airline){
        this.model = model;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }


    public PlaneModel getModel() {
        return this.model;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public int passengerCount() {
        return this.passengers.size();
    }
}
