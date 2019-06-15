import Deck.Deck;
import Deck.shufflers.InPlaceSuperShuffler;

public class DeckDemo {

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:45am
 */

    public static void main(String[] args) {

        Deck deck = new Deck(new InPlaceSuperShuffler()); //low grade dependency injection.  Pick InPlaceSuperShuffler to be our shuffler, mostly because it's my favorite
        System.out.println(deck);
        deck.shuffleDeck(); //prepare game
    }
}
