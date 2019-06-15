package PlayingCard;

/*
    Created by Andrew Townsend on June 15th, 2019 @ 5:04am
 */

public enum Suites {
    SPADES ("S"),
    CLUBS ("C"),
    DIAMONDS ("D"),
    HEARTS ("H");

    private final String shortCode;

    Suites(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public String toString() {
        return this.getShortCode();
    }
}
