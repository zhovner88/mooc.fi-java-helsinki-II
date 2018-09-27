package moving.domain;

import java.util.Objects;

public class Item implements Comparable<Item>, Thing{

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int compareTo(Item item) {
        return this.getVolume() - item.getVolume();
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
}
