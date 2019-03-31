import java.util.ArrayList;

public class Airport {

    private AirportCode code;
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;

    public Airport(AirportCode code){
        this.code = code;
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public AirportCode getCode(){
        return this.code;
    }

    public ArrayList<Plane> getPlanes(){
        return this.hangar;
    }

    public void addPlane(Plane plane){
        this.hangar.add(plane);
    }

    public ArrayList<Flight> getFlights(){
        return this.flights;
    }

    public void createFlight(Plane plane, int flightNumber, Airport destination){
        if (this.hangar.contains(plane)){
            this.flights.add(new Flight(plane, flightNumber, destination));
        }
    }
}
