package work_6;

public class Main {

    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.add(new Thing(25, 40));
        backpack.add(new Thing(75, 40));
        backpack.add(new Thing(75, 40));

        for (var item : backpack.getThings()) {
            System.out.println(item.getCost() + " " + item.getWeight());
        }
    }
}

