package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzGameTest {
    private FizzBuzzGame game;

    @Before
    public void setUp() {
        game = new FizzBuzzGame();
        game.start(100);
    }

    @Test
    public void should_return_1_when_have_1() {
        String word = game.parseNumberToWord(1);
        assertEquals("1", word);
    }

    @Test
    public void should_return_Fizz_when_have_4() {
        String word = game.parseNumberToWord(4);
        assertEquals("4", word);
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        String word = game.parseNumberToWord(3);
        assertEquals("Fizz", word);
    }

    @Test
    public void should_return_Fizz_when_have_3_multiplier_like_9() {
        String word = game.parseNumberToWord(9);
        assertEquals("Fizz", word);
    }

    @Test
    public void should_return_FizzBuzz_when_have_3_and_5_multiplier_like_15() {
        String word = game.parseNumberToWord(15);
        assertEquals("FizzBuzz", word);
    }

    @Test
    public void should_return_Fizz_when_have_3_and_5_and_7_multiplier_like_35() {
        String word = game.parseNumberToWord(35);
        assertEquals("Fizz", word);
    }

}
