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
        this.cards = new ArrayList<Card>();
    }

    //prepare the game by shuffling
    public void shuffleDeck() {
        shuffler.shuffle(this);
    }

    public Card dealOneCard() {
        if(cards.size() == 0) {
            return null;
        }
        Card dealtCard = cards.remove(0);
        return dealtCard;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // get status of the deck
    public String toString() {
        String result = cards.get(0).toString();
        for(int i = 1; i < cards.size(); i++) {
            result += ", " + cards.get(i).toString();
        }
        return result;
    }
}
