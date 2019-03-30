public enum PlaneModel {
    BOEING737(215),
    BOEING747(605),
    BOEING767(550),
    BOEING777(330),
    BOEING787(375);

    private final int capacity;

    PlaneModel(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
