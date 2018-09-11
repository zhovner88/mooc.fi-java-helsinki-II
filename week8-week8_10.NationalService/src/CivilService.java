public class CivilService implements  NationalService {

    private int daysLeft;

    public CivilService() {
        daysLeft = 362;
    }

    public int getDaysLeft() {
        return this.daysLeft;
    }

    public void work() {
        while (daysLeft>0) {
            daysLeft--;
            break;
        }
    }
}
