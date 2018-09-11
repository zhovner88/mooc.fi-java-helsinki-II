import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {

    private Dictionary dictionary;
    private Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
    }

    public void start() {
        String answer;

        System.out.println("Statement:");
        System.out.println("\tadd - adds a word pair to the dictionary");
        System.out.println("\translate - asks a word and prints its translation");
        System.out.println("\tquit - quit the text user interface");


        while (true) {
            System.out.print("Statement: ");
            answer = reader.nextLine();

            if (answer.equals("quit")) {
                System.out.println("Cheers");
                break;
            } else if (answer.equals("translate")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(word));
            } else if (answer.equals("add")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                dictionary.add(word, translation);
            }

            else {
                System.out.println("Uknown statement");
            }

        }
    }
}
