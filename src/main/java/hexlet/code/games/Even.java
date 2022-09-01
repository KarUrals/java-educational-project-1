package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[][] run() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        int number;
        String correctAnswer;

        for (String[] pair: array) {
            number = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            pair[0] = "Question: " + number;
            pair[1] = correctAnswer;
        }

        return array;
    }
}
