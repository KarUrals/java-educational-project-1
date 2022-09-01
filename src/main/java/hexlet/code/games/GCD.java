package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    public static final String GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static String[][] setQuestionAnswerArray() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int number1 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            int number2 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);

            //set correct answer
            for (int j = 1; j <= Math.min(Math.abs(number1), Math.abs(number2)); j++) {
                if (number1 % j == 0 && number2 % j == 0) {
                    roundQuestionAnswer[1] = String.valueOf(j);
                }
            }
            //set question
            roundQuestionAnswer[0] = "Question: " + number1 + " " + number2;
        }

        return array;
    }
}
