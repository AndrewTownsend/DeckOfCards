package PlayingCard;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:01am
 */

public class Card {
    private Ranks rank;
    private Suites suite;

    // constructor for basic "Poker"-style card
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

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Card)) { return false; }
        Card card = (Card) object;
        return this.rank == card.rank && this.suite == card.suite;
    }
}
