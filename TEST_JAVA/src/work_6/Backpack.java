package work_6;

import java.util.ArrayList;

public class Backpack {
    private final float CARRYING = 100;
    private ArrayList<Thing> things;
    private float allWeight = 0;

    public Backpack() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) {
        if (allWeight + thing.getWeight() <= CARRYING) {
            things.add(thing);
            allWeight += thing.getWeight();
        }
    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    public Thing get(int position) {
        return things.get(position);
    }

    public int size() {
        return things.size();
    }
}
