package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] run() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] pair: array) {
            int number = Engine.setRandomNumber(2, Engine.MAX_RANDOM_NUMBER);
            pair[0] = "Question: " + number;
            pair[1] = "yes";
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    pair[1] = "no";
                    break;
                }
            }
        }

        return array;
    }
}
