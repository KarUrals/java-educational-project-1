package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    public static final String GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static String[][] run() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        int number1;
        int number2;
        String correctAnswer = "1";

        for (String[] pair: array) {
            number1 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            number2 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            for (int j = 1; j <= Math.min(Math.abs(number1), Math.abs(number2)); j++) {
                if (number1 % j == 0 && number2 % j == 0) {
                    correctAnswer = String.valueOf(j);
                }
            }
            pair[0] = "Question: " + number1 + " " + number2;
            pair[1] = correctAnswer;
        }

        return array;
    }
}
