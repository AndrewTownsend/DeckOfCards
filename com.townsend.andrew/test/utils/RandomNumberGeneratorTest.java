package utils;

/*
    Created by Andrew Townsend on June 17th, 2019 @ 12:20am
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomNumberGeneratorTest {

    @Test
    public void test_randomNumberGenerator() {
        int firstNumber = RandomNumberGenerator.generateRandomIntBetweenBounds(0, 1000);
        int secondNumber = RandomNumberGenerator.generateRandomIntBetweenBounds(0, 1000);
        assertNotEquals(firstNumber, secondNumber);
    }
}