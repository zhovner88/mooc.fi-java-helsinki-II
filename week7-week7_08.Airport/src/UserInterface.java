import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private Airport airport;

    public UserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }


    public void printStartAirportPanelInfo() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    public void printFlightServiceInfo() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }

    public void startAirportPanel() {
        String answer;
        System.out.println("Airport panel\n--------------------");

        while (true) {

            printStartAirportPanelInfo();
            answer = reader.nextLine();

            if (answer.equals("x")) {
                break;
            }

            if (answer.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCapacity = reader.nextInt();
                airport.addPlane(planeID, planeCapacity);

            } else if (answer.equals("2")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String airportCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationCode = reader.nextLine();
                airport.addFlight(planeID, airportCode, destinationCode);
            }

        }
    }

    public void startFlightService() {
        String answer;
        System.out.println("Flight service\n--------------------");

        while (true) {
            printFlightServiceInfo();
            answer = reader.nextLine();

            if (answer.equals("x")) {
                break;
            }

            if (answer.equals("1")) {
                airport.printPlanes();
            } else if (answer.equals("2")) {
                airport.printFlights();
            } else if (answer.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                airport.printPlaneInfo(planeID);
            }
        }
    }

}
