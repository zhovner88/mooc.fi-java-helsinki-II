import java.util.ArrayList;
import java.util.Objects;

public class Participant implements Comparable<Participant> {

    private String name;
    private int points;
    private ArrayList<Integer> jumps;

    public Participant(String name) {
        this.name = name;
        points = 0;
        jumps = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addJump(int jump) {
        jumps.add(jump);
    }

    public void printJumps() {
        for (int i = 0; i < jumps.size()-1; i++) {
            System.out.print(jumps.get(i) + " m, ");
        }
        System.out.print(jumps.get(jumps.size()-1) + " m\n");
    }

    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant)) return false;
        Participant that = (Participant) o;
        return points == that.points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }

    public int compareTo(Participant participant) {
        return this.points - participant.points;
    }
}
