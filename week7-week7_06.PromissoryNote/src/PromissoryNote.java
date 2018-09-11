import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> promisoryNote;

    public PromissoryNote() {

        promisoryNote = new HashMap<String, Double>();

    }

    public void setLoan(String toWhom, double value) {
        promisoryNote.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {

        if (this.promisoryNote.containsKey(whose)) {
            return promisoryNote.get(whose);
        }
        return 0;

    }

}
