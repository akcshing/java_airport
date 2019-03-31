import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private AirportCode code;
    private ArrayList<Plane> hangar;
    private HashMap<Integer, Flight> flights;
//    private HashMap<Integer, Integer> tickets;


    public Airport(AirportCode code){
        this.code = code;
        this.hangar = new ArrayList<>();
        this.flights = new HashMap<>();
//        this.tickets = new HashMap<>();
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

    public HashMap getFlights(){
        return this.flights;
    }

    public Flight getFlight(int flightNumber){
        return this.flights.get(flightNumber);
    }

    public void createFlight(Plane plane, int flightNumber, Airport destination){
        if (this.hangar.contains(plane)){
            this.flights.put(flightNumber, (new Flight(plane, flightNumber, destination)));
        }
    }

    public void sellTicket(int flightNumber){
        Flight flight = this.flights.get(flightNumber);
        flight.sellTicket();
    }
}
