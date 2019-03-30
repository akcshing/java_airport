import java.util.ArrayList;

public class Airport {

    private AirportCode code;
    private ArrayList<Plane> hangar;

    public Airport(AirportCode code){
        this.code = code;
        this.hangar = new ArrayList<>();
    }


}
