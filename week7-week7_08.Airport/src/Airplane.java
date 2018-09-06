public class Airplane {

    private String planeID;
    private int capacity;

    public Airplane(String planeID, int capacity) {
        this.planeID = planeID;
        this.capacity = capacity;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return planeID + " (" + capacity + " ppl)";
    }
}
