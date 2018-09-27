package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{

    private int maximumCapacity;
    private  List<Thing> box;

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public Box(int maxCapacity) {
        this.maximumCapacity = maxCapacity;
        box = new ArrayList<Thing>();
    }

    @Override
    public int getVolume() {
        int capacityValue = 0;
        for (Thing eachThing: box) {
            capacityValue += eachThing.getVolume();
        }
        return capacityValue;
    }

    public boolean addThing(Thing t) {
        if (this.getVolume() + t.getVolume() > maximumCapacity) {
            return false;
        }
        if(this.getVolume() + t.getVolume() <= maximumCapacity) {
            box.add(t);
        }
        return true;
    }
}
