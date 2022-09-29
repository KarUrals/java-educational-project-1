package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.RundomUtils.generateRandomNumberFromRange;
import static hexlet.code.RundomUtils.MAX_RANDOM_NUMBER;

public class CalculatorGame {
    public static final String GAME_TASK = "What is the result of the expression?";
    private static final int NUMBER_OF_OPERATIONS = 3;

    public static void launchGame() {
        Engine.runGame(GAME_TASK, generateQuestionAnswerPairs());
    }

    private static String[][] generateQuestionAnswerPairs() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int number1 = generateRandomNumberFromRange(1, MAX_RANDOM_NUMBER);
            int number2 = generateRandomNumberFromRange(1, MAX_RANDOM_NUMBER);

            String operator = String.valueOf(generateRandomNumberFromRange(1, NUMBER_OF_OPERATIONS));

            //set correct answer
            switch (operator) {
                case "1" -> {
                    roundQuestionAnswer[1] = String.valueOf(number1 + number2);
                    operator = " + ";
                }
                case "2" -> {
                    roundQuestionAnswer[1] = String.valueOf(number1 - number2);
                    operator = " - ";
                }
                case "3" -> {
                    roundQuestionAnswer[1] = String.valueOf(number1 * number2);
                    operator = " * ";
                }
                default -> {
                }
            }
            //set question
            roundQuestionAnswer[0] = "Question: " + number1 + operator + number2;
        }

        return array;
    }
}
