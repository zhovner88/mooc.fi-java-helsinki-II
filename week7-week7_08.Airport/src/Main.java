import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.

        Scanner reader = new Scanner(System.in);

        Airport testAirport = new Airport();
        UserInterface testUser = new UserInterface(reader, testAirport);

        testUser.startAirportPanel();
        testUser.startFlightService();

    }
}
