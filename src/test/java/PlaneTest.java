import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneModel.BOEING737, Airline.BA);
    }

    @Test
    public void canGetModel(){
        assertEquals(PlaneModel.BOEING737, plane.getModel());
    }

    @Test
    public void canGetAirline(){
        assertEquals(Airline.BA, plane.getAirline());
    }

    @Test
    public void passengersStartsEmpty(){
        assertEquals(0, plane.passengerCount());
    }
}
