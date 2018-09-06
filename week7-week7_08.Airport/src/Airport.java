import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private HashMap<Airplane, Flight> activePlanes;
    private ArrayList<Airplane> planesPool;
    private ArrayList<Flight> flights;

    public Airport() {
        activePlanes = new HashMap<Airplane, Flight>();
        planesPool = new ArrayList<Airplane>();
        flights = new ArrayList<Flight>();
    }

    // add new plane to the planes array list

    public void addPlane(String PlaneID, int capacity) {
        planesPool.add(new Airplane(PlaneID, capacity));
    }

    // add new flight to the Flights array list

    public void addFlight(String flightID, String Departure, String destination) {
        flights.add(new Flight(flightID, Departure, destination));
    }

    // prints all plances

    public void printPlanes() {
        for (Airplane plane:planesPool) {
            System.out.println(plane);
        }
    }

    // prints plane info

    public void printPlaneInfo(String planeID) {
        for (Airplane plane:planesPool) {
            if (plane.getPlaneID().equals(planeID)) {
                System.out.println(plane);
            }
        }
    }


    // prints all active flights

    public void printFlights() {
        for (Flight flight:flights) {
            for (Airplane plane:planesPool) {
                if (plane.getPlaneID().equals(flight.getPlaneId())) {
                    System.out.println(plane + " " + flight);
                }
            }
        }
    }

}
