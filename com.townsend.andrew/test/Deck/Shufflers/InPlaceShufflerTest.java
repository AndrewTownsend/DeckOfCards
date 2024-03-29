package Deck.Shufflers;

/*
    Created by Andrew Townsend on June 17th, 2019 @ 12:28am
 */

import Deck.Deck;
import Deck.StandardDeck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InPlaceShufflerTest {

    Deck deck;
    InPlaceShuffler shuffler;

    @Before
    public void setup() {
        shuffler = new InPlaceShuffler();
        deck = new StandardDeck(shuffler);
    }

    @Test
    public void test_shuffle() {
        Deck comparisonDeck = deck.clone();
        Assert.assertTrue(deck.equals(comparisonDeck));
        deck.shuffleDeck();
        Assert.assertFalse(deck.equals(comparisonDeck));
    }
}
