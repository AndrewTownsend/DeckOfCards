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

    public Card clone() {
        return new Card(this.rank, this.suite);
    }

    public String toString() {
        return rank.toString() + suite.toString();
    }

    public boolean equals(Card card) {
        return this.rank == card.rank && this.suite == card.suite;
    }
}
