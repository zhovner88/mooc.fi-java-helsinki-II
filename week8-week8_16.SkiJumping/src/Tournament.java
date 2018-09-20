import java.util.*;

public class Tournament {

    private List<Participant> game;
    private int roundNumber;
    Random rand;

    public Tournament() {
        game = new ArrayList<Participant>();
        rand = new Random();
    }

    public void addParticipant(String name) {
        game.add(new Participant(name));
    }

    public void startRound() {

        System.out.println("\nRound " + ++roundNumber);
        printStatistics();
        System.out.println("\nResults of round " + roundNumber);
        for (Participant eachParticipant: game) {

            int jumpLength = rand.nextInt((120 - 60) + 1) + 60;
            eachParticipant.addJump(jumpLength); //adds jump to the arrayList of jumps
            int[] judgeVotes = generatePoints();

            System.out.println("  " + eachParticipant.getName());
            System.out.println("    length: " + jumpLength);
            System.out.print("    judge votes: [");

            printVotes(judgeVotes);
            eachParticipant.addPoints(calculateSumVotes(judgeVotes)+jumpLength);

        }
    }

    // generates an array of integer votes
    public int[] generatePoints() {
        int[] judjePoints = new int[5];
        for (int i = 0; i < judjePoints.length; i++) {
            int randomNumber = rand.nextInt((20 - 10) + 1) + 10;
            judjePoints[i] = randomNumber;
        }
        return judjePoints;
    }

    // calculates the sum of votes per round for participant
    public int calculateSumVotes(int[] votes) {
        int sum = 0;
        Arrays.sort(votes);

        for (int i=1; i<votes.length-1; i++) {
            sum += votes[i];
        }
        return sum;
    }

    // prints votes one by one in line
    public void printVotes(int[] votes) {
        for (int i=0; i < votes.length-1; i++) {
            System.out.print(votes[i] + ", ");
        }
        System.out.print(votes[votes.length-1] + "]\n");
    }

    // prints statistics per participant
    public void printStatistics() {
        int participantNumber = 0;
        Collections.sort(game);
        System.out.println("\nJumping order:");
        for (Participant each: game) {
            System.out.println("  " + ++participantNumber + ". " + each);
        }
    }

    // prints final tournament results
    public void printTournamentresults() {
        int postion = 0;
        System.out.println("\nThanks!\n\nTournament results:");
        System.out.println("Position    Name");
        Collections.sort(game);
        Collections.reverse(game);
        for (Participant person: game) {
            System.out.println(++postion + "           " + person);
            System.out.print("            jump lengths: ");
            person.printJumps();
        }
    }
}
