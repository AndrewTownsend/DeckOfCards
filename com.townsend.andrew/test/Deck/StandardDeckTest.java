package Deck;

/*
    Created by Andrew Townsend on June 17th, 2019 @ 12:24am
 */

import Deck.Shufflers.IShuffler;
import Deck.Shufflers.InPlaceShuffler;
import PlayingCard.Card;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StandardDeckTest {

    StandardDeck deck;
    IShuffler shuffler;

    @Before
    public void setup() {
        shuffler = new InPlaceShuffler();
        deck = new StandardDeck(shuffler);
    }

    @Test
    public void test_getACard() {
        Card card = deck.dealOneCard();
        assertNotNull(card);
        assertTrue(card.toString().length() >= 2);
    }

    @Test
    public void test_getAllCards() {
        ArrayList<Card> cards = deck.getCards();
        assertTrue(cards.size() > 0);
    }
}
