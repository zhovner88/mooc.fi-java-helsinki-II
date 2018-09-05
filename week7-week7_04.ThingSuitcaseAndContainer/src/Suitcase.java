import java.util.ArrayList;

public class Suitcase {


    private int maxWeightLimit;
    private ArrayList<Thing> suitcase;

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        suitcase = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if ((totalWeight() + thing.getWeight()) <= maxWeightLimit) {
            suitcase.add(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : suitcase) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Thing thing:suitcase) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {

        // check if suitcase is empty
        if (suitcase.size() == 0) {
            return null;
        }

        // define local variables
        Thing heaviest = new Thing("Heaviest", 0);


        // check for the heaviest thing
        for (Thing thing:suitcase) {
            if (heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
    }

    public String toString() {
        if (suitcase.size() == 0) {
            return "empty (0 kg)";
        } else if (suitcase.size() == 1) {
            return suitcase.size() + " thing (" + totalWeight() + " kg)";
        }
        return suitcase.size() + " things (" + totalWeight() + " kg)";
    }

}
