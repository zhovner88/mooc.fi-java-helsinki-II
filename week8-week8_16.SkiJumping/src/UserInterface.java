import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Tournament tournament;

    public UserInterface(Scanner scanner, Tournament tournament) {
        this.scanner = scanner;
        this.tournament = tournament;
    }

    // method adds participants to the tournament list
    public void AddParticipants() {
        System.out.println("Kumpula ski jumping week\n\n" +
                "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            String answer;
            System.out.print("  Participant name: ");
            answer = scanner.nextLine();
            if (answer.equals("")) {
                break;
            }
            tournament.addParticipant(answer);
        }
    }

    // promotes user to start the jump tournament
    public void StartTournament() {
        System.out.println("\nThe tournament begins!");
        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String answer;
            answer = scanner.nextLine();
            if (!answer.equals("jump")) {
                break;
            }
            tournament.startRound();
        }
    }

    public void tournamentResults() {
        tournament.printTournamentresults();
    }
}