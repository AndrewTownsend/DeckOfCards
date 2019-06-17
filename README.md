# DeckOfCards
Deck of Cards implementation

Implements a simple representation of a Deck of Cards, along with a suite of basic unit tests.  Has support for:

* Variable sized decks
* Different types of shuffling implementations
* The ability to deal one card at a time, from the top of the deck (can be overriden)
* Comparisons between decks for equality, and the ability to clone a deck along with it's state

Future Proofing concerns:

* Needs further implementation to have an Ace card be either high or low, but that would mostly be a concern of whatever Game is being implemented
* If a game using cards other than "Poker cards" is needed, refactoring would probably have to happen to the Card class