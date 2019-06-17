import Deck.StandardDeck;
import Deck.Shufflers.InPlaceSuperShuffler;
import PlayingCard.Card;

public class DeckDemo {

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:45am
 */

    public static void main(String[] args) {

        StandardDeck deck = new StandardDeck(new InPlaceSuperShuffler()); //low grade dependency injection.  Pick InPlaceSuperShuffler to be our shuffler, mostly because it's my favorite
        System.out.println(deck);
        deck.shuffleDeck(); //prepare game
        System.out.println(deck);
        Card dealtCard = deck.dealOneCard();
        System.out.println(dealtCard);
    }
}
