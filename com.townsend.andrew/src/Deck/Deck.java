package Deck;

/*
    Created by Andrew Townsend on June 17th, 2019 @ 12:04am
 */

import Deck.Shufflers.IShuffler;
import PlayingCard.Card;

import java.util.ArrayList;

public abstract class Deck {
    ArrayList<Card> cards;
    IShuffler shuffler;

    public Deck(IShuffler shuffler) {
        this.shuffler = shuffler;
        this.cards = new ArrayList<>();
    }

    // prepare the game by shuffling.  Could add a "Cut the Deck" operation here, if desired
    public void shuffleDeck() {
        shuffler.shuffle(this);
    }

    // deals one card, off the top of the deck.  Could be overriden to deal from the bottom
    public Card dealOneCard() {
        if(cards.size() == 0) {
            return null; // could throw an exception here, but an empty deck is a valid state
        }
        Card dealtCard = cards.remove(cards.size() - 1); // deal from the end of the array; faster.
        return dealtCard;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    protected void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public abstract Deck clone();

    // get status of the deck
    public String toString() {
        String result = cards.get(0).toString();
        for(int i = 1; i < cards.size(); i++) {
            result += ", " + cards.get(i).toString();
        }
        return result;
    }

    // only checks the contents of the cards array to see if the cards are in the same order
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Deck)) { return false; }
        Deck deck = (Deck) object;
        ArrayList<Card> cards = this.getCards();
        ArrayList<Card> comparisonCards = deck.getCards();
        if(this.getCards().size() != cards.size()) { return false; }
        for(int i = 0; i < cards.size(); i++) {
            if(!cards.get(i).equals(comparisonCards.get(i))) {
                return false;
            }
        }
        return true;
    }
}
