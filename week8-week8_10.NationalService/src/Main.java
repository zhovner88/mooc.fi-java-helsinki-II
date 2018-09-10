public class Main {
    public static void main(String[] args) {
        // Test your code here!

        CivilService civil1 = new CivilService();
        System.out.println(civil1.getDaysLeft());

        MilitaryService milit1 = new MilitaryService(55);
        System.out.println(milit1.getDaysLeft());

    }
}
