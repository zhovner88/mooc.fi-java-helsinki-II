import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card eachCard: hand) {
            System.out.println(eachCard);
        }
    }

    @Override
    public int compareTo(Hand comparable) {

        int sum1 = 0;
        int sum2 = 0;

        for (Card eachCard: hand) {
            sum1 += eachCard.getValue();
        }

        for (Card eachCard: comparable.hand) {
            sum2 += eachCard.getValue();
        }

        if (sum1 == sum2) {
            return 0;
        } else if(sum1 < sum2) {
            return -1;
        } else {
            return 1;
        }

    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }

}
