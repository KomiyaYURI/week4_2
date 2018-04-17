package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        boolean special;
        StringBuilder personalResult = new StringBuilder();

        for (int i = 1; i <= 100; i++)
        {
            special = false;
            personalResult.setLength(0);

            if (i % 3 == 0 || i % 10 == 3 || i / 10 == 3) {
                special = true;
                personalResult.append("Fizz");
            }
            if (i % 5 == 0 || i % 10 == 5 || i / 10 == 5) {
                special = true;
                personalResult.append("Buzz");
            }
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                special = true;
                personalResult.append("Whizz");
            }

            if (!special)
                personalResult.append(Integer.toString(i));

            results.add(personalResult.toString());
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String parseNumberToWord(int i) {
        return results.get(i-1);
    }
}


