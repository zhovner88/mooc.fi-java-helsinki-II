import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt

        File f = new File("src/textfile.txt");
        Printer printer = new Printer(f.getName());

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
