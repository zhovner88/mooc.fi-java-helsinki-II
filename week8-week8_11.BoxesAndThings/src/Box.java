import java.util.ArrayList;

public class Box implements ToBeStored {

    private int maxWeight;
    private ArrayList<ToBeStored> box;
    private int weight;

    public Box(int maxWeight) {
        this.maxWeight = maxWeight;
        box = new ArrayList<ToBeStored>();
        double weight = 0.0;
    }

    public void add(ToBeStored thing) {
        if ((this.weight() + thing.weight()) <= maxWeight) {
            box.add(thing);
            weight += thing.weight();
        } else {
            System.out.println("The box is full");
        }
    }

    public double weight() {
        double returnedWeight = 0.0;
        for (ToBeStored things: box) {
            returnedWeight += things.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " things, total weight " + this.weight() + " kg";
    }

    public void printBoxContent() {
        for (ToBeStored things: box) {
            System.out.println(things);
        }
    }
}
