public enum Airline {
    BA("British Airways"),
    FR("Ryanair"),
    TK("Turkish Airlines"),
    BE("Flybe"),
    AF("Air France"),
    UA("United Airlines");

    private final String name;

    Airline(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
