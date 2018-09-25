package mooc.logic;

import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface test = new TextUserInterface();
        ApplicationLogic app = new ApplicationLogic(test);
        app.execute(5);
    }
}
