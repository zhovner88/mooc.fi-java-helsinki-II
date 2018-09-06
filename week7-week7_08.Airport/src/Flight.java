import java.util.ArrayList;

public class Flight {

    private String planeId;
    private String departure;
    private String destination;

    public Flight(String planeId, String departure, String destination) {
        this.planeId = planeId;
        this.departure = departure;
        this.destination = destination;
    }

    public String getPlaneId() {
        return planeId;
    }

    @Override
    public String toString() {
        return "(" + departure + "-" + destination + ")";
    }
}
