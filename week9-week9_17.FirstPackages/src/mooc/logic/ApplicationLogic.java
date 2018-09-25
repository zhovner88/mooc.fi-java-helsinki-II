package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface testUserInterface;

    public ApplicationLogic(UserInterface ui) {
        testUserInterface = ui;
    }

    public void execute(int howManyTimes) {
        int times = howManyTimes;
        while (times > 0) {
            System.out.println("The application logic works");
            testUserInterface.update();
            times--;
        }
    }

}
