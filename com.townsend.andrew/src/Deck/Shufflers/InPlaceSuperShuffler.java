package Deck.Shufflers;

import Deck.Deck;
import PlayingCard.Card;
import utils.RandomNumberGenerator;

import java.util.ArrayList;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:33am
 */

public class InPlaceSuperShuffler implements IShuffler {

    private static final int NUM_CARD_TRADES = 1024;

    /*
        Swaps one card at a time, for the number of times specified either by constant or passed in variable
     */
    public void shuffle(Deck deck) {
        shuffleNumTimes(deck, NUM_CARD_TRADES);

    }

    public void shuffleNumTimes(Deck deck, int numberOfSwaps) {
        ArrayList<Card> cards = deck.getCards();
        for(int i = 0; i < numberOfSwaps; i++) {
            int swap = RandomNumberGenerator.generateRandomIntBetweenBounds(0, cards.size());
            int index = RandomNumberGenerator.generateRandomIntBetweenBounds(0, cards.size());
            cards.add(index, cards.remove(swap));
        }
    }
}
