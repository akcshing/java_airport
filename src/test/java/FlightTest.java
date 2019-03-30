import org.junit.Before;

public class FlightTest {

    Flight flight;
    Plane plane;
    Airport EDI;

    @Before
    public void before(){
        this.plane = new Plane(PlaneModel.BOEING747, Airline.AF);

        this.flight = new Flight(plane, 24, )
    }
}
