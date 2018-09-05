
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");

    }

    private static void printWithSmileys(String characterString) {
        printUpperBottomRow(findStringLengthPrint(characterString));
        printMiddleRow(characterString);
        printUpperBottomRow(findStringLengthPrint(characterString));

    }

    private static int findStringLengthPrint(String characterString) {
        int lengthToPrint = 0;
        if (ifOdd(characterString)) {
            lengthToPrint = (characterString.length()-1 + 7)/2;
        } else if (!ifOdd(characterString)) {
            lengthToPrint = (characterString.length()-1 + 6)/2;
        }
        return lengthToPrint;
    }

    private static void printUpperBottomRow(int timesToPrint) {
        int printedCounter = 0;
        while (printedCounter <= timesToPrint) {
            System.out.print(":)");
            printedCounter++;
        }
        System.out.print("\n");
    }

    private static void printMiddleRow(String characterString) {
        if (ifOdd(characterString)) {
            System.out.println(":) " + characterString + "  :)");
        } else if (!ifOdd(characterString)) {
            System.out.println(":) " + characterString + " :)");
        }
    }

    private static boolean ifOdd(String characterString) {
        boolean result = false;
        if (characterString.length() % 2 == 1) {
            result = true;
        }
        return result;
    }

}
