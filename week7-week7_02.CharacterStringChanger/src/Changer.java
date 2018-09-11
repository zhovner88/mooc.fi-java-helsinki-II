import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<Change>();
    }

    void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {

        for (Change eachChange:changes) {
            characterString = eachChange.change(characterString);
        }

        return characterString;
    }
}
