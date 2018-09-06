import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String input = "add\n"  + "cheese\n" + "juusto\n" +
//                "add\n"  + "bier\n" + "olut\n" +
//                "add\n"  + "book\n" + "kirja\n" +
//                "add\n"  + "computer\n" + "tietokone\n" +
//                "add\n"  + "auto\n" + "car\n" +
//                "quit\n";

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();

//        ArrayList<String> translations = dictionary.translationList();
//        for(String translation: translations) {
//            System.out.println(translation);
//        }
    }
}
