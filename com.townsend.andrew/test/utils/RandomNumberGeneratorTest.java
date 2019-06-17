package utils;

/*
    Created by Andrew Townsend on June 17th, 2019 @ 12:20am
 */

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class RandomNumberGeneratorTest {

    @Test
    public void test_randomNumberGenerator() { //potentially flaky test, since a random number generator could generate the same number
        int firstNumber = RandomNumberGenerator.generateRandomIntBetweenBounds(0, 1000);
        int secondNumber = RandomNumberGenerator.generateRandomIntBetweenBounds(0, 1000);
        assertNotEquals(firstNumber, secondNumber);
    }
}
