public enum AirportCode {
    EDI("Edinburgh Airport", "Scotland"),
    GLA("Glasgow Airport", "Scotland"),
    ATL("Hartsfield–Jackson Atlanta International Airport", "USA"),
    PEK("Beijing Capital International Airport", "China"),
    DXB("Dubai International Airport", "Dubai"),
    HND("Tokyo Haneda Airport", "Japan"),
    LHR("London Heathrow Airport", "United Kingdom"),
    HKG("Hong Kong International Airport", "Hong Kong"),
    FRA("Frankfurt Airport", "Germany"),
    MAD("Madrid Barajas Airport", "Spain"),
    SFO("San Francisco International Airport", "USA"),
    LAS("McCarran International Airport", "USA");

    private final String name;
    private final String country;

    AirportCode(String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getName(){
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }
}
