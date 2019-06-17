package utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    public static int generateRandomIntBetweenBounds(int lowerBound, int upperBound) {
        return ThreadLocalRandom.current().nextInt(lowerBound, upperBound);
    }
}
