import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(24, flight.getNumber());
    }

    @Test
    public void canGetAirport(){
        assertEquals(EDI, flight.getDestination());
    }

    @Test
    public void canGetTicketsAvailable(){
        assertEquals(605, flight.getTicketsAvailable());
    }
}
