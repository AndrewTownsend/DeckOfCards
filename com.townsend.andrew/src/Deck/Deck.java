package Deck;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:20am
 */

import Deck.shufflers.IShuffler;
import PlayingCard.Card;
import PlayingCard.Ranks;
import PlayingCard.Suites;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private ArrayList<Card> cards;
    private IShuffler shuffler;

    public Deck(IShuffler shuffler) {
        this.shuffler = shuffler;
        this.cards = new ArrayList<>(52); //assumption this will be a standard deck with 52 cards
        Arrays.asList(Suites.values()).forEach(suite ->
                Arrays.asList(Ranks.values()).forEach(rank ->
                        cards.add(new Card(rank, suite))));
    }

    //prepare the game by shuffling
    public void shuffleDeck() {
        shuffler.shuffle(cards);
    }

    public Card dealOneCard() {
        if(cards.size() == 0) {
            return null;
        }
        Card dealtCard = cards.remove(0);
        return dealtCard;
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
