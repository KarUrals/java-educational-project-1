package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] run() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        int number;
        String correctAnswer;

        for (String[] pair: array) {
            number = Engine.setRandomNumber(2, Engine.MAX_RANDOM_NUMBER);
            correctAnswer = "yes";
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
            pair[0] = "Question: " + number;
            pair[1] = correctAnswer;
        }

        return array;
    }
}
