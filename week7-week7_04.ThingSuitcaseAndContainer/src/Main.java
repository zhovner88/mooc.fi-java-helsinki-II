
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!

        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", i+1);
            Suitcase suitcase = new Suitcase(brick.getWeight());
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }

    }

}
