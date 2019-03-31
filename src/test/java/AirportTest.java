import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airportHK;
    Airport airportSF;
    Plane plane;

    @Before
    public void before(){
        airportHK = new Airport(AirportCode.HKG);
        airportSF = new Airport(AirportCode.SFO);
        plane = new Plane(PlaneModel.BOEING777, Airline.AF);
    }

    @Test
    public void canGetCode(){
        assertEquals(AirportCode.HKG, airportHK.getCode());
    }

    @Test
    public void hangarStartsEmpty(){
        assertEquals(0, airportHK.getPlanes().size());
    }

    @Test
    public void canAddPlaneToHangar(){
        airportHK.addPlane(plane);
        assertEquals(1, airportHK.getPlanes().size());
    }

    @Test
    public void canCreateFlights(){
        airportHK.addPlane(plane);
        assertEquals(1, airportHK.getPlanes().size());
        assertEquals(0, airportHK.getFlights().size());
        airportHK.createFlight(plane,1, airportSF);
        assertEquals(1, airportHK.getFlights().size());
    }

    @Test
    public void canSellTickets(){
        airportHK.addPlane(plane);
        airportHK.createFlight(plane,1, airportSF);
        airportHK.sellTicket(1);
        assertEquals(1, airportHK.getFlights().size());
        Flight flight = airportHK.getFlight(1);
        assertEquals(329, flight.getTicketsAvailable());
    }
}
