public class MilitaryService  implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        while (daysLeft>0) {
            daysLeft--;
            break;
        }
    }
}
