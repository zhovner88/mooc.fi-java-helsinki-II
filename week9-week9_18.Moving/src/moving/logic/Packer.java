package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        for (Thing eachThing: things) {
            Box box = new Box(boxesVolume);
            box.addThing(eachThing);
            boxes.add(box);
        }
        return boxes;
    }
}
