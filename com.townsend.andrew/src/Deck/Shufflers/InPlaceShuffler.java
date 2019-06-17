package Deck.Shufflers;

import Deck.Deck;
import PlayingCard.Card;
import utils.RandomNumberGenerator;

import java.util.ArrayList;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:30am
 */

public class InPlaceShuffler implements IShuffler {

    // passes over the deck one time, randomizing it.
    public void shuffle(Deck deck) {
        ArrayList<Card> cards = deck.getCards();
        for(int i = 0; i < cards.size(); i++) {
            int newIndex = RandomNumberGenerator.generateRandomIntBetweenBounds(0, cards.size());
            cards.add(newIndex, cards.remove(i));
        }
    }
}
