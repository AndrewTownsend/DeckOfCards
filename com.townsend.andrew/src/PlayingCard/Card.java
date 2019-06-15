package PlayingCard;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:01am
 */

public class Card {
    private Ranks rank;
    private Suites suite;

    public Card(Ranks rank, Suites suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public String toString() {
        return rank.toString() + suite.toString();
    }
}
