package Deck;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:20am
 */

import Deck.Shufflers.IShuffler;
import PlayingCard.Card;
import PlayingCard.Ranks;
import PlayingCard.Suites;

import java.util.ArrayList;
import java.util.Arrays;

public class StandardDeck extends Deck {


    public StandardDeck(IShuffler shuffler) {
        super(shuffler);
        Arrays.asList(Suites.values()).forEach(suite ->
                Arrays.asList(Ranks.values()).forEach(rank ->
                        cards.add(new Card(rank, suite))));
    }

    public Deck clone() {
        Deck clone = new StandardDeck(shuffler);
        ArrayList<Card> cards = this.getCards();
        ArrayList<Card> clonedCards = new ArrayList<>(cards.size());
        for(Card card : cards) {
            clonedCards.add(card.clone());
        }
        clone.setCards(clonedCards);
        return clone;
    }
}
