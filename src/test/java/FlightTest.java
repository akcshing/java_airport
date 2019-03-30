import org.junit.Before;

public class FlightTest {

    Flight flight;
    Plane plane;
    Airport EDI;

    @Before
    public void before(){
        plane = new Plane(PlaneModel.BOEING747, Airline.AF);
        EDI = new Airport(AirportCode.EDI);
        flight = new Flight(plane, 24, EDI);
    }

    
}
