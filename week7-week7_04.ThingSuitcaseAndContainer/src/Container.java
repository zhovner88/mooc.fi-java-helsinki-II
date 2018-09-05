import java.util.ArrayList;

public class Container {

    private int maxWeightLimit;
    private ArrayList<Suitcase> container;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if((totalWeightContainer() + suitcase.totalWeight() <= maxWeightLimit)) {
            container.add(suitcase);
        }

    }

    public int totalWeightContainer() {
        int weight = 0;
        for (Suitcase suitcase : container ) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase suitecase:container) {
            suitecase.printThings();
        }
    }

    @Override
    public String toString() {
        return container.size() + " suitcases " + "(" + totalWeightContainer() + " kg)";
    }
}
