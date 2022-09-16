package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.RundomUtils.generateRandomNumberFromRange;
import static hexlet.code.RundomUtils.MAX_RANDOM_NUMBER;

public class GCD {
    public static final String GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static String[][] generateQuestionAnswerPairs() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int number1 = generateRandomNumberFromRange(1, MAX_RANDOM_NUMBER);
            int number2 = generateRandomNumberFromRange(1, MAX_RANDOM_NUMBER);

            //set correct answer
            roundQuestionAnswer[1] = findCorrectAnswer(number1, number2);
            //set question
            roundQuestionAnswer[0] = "Question: " + number1 + " " + number2;
        }

        return array;
    }

    private static String findCorrectAnswer(int firstNumber, int secondNumber) {
        int smallestNumber = Math.min(firstNumber, secondNumber);
        String correctAnswer = null;

        for (int j = 1; j <= smallestNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                correctAnswer = String.valueOf(j);
            }
        }

        return correctAnswer;
    }

    public static void launchGame() {
        Engine.runGame(GAME_TASK, generateQuestionAnswerPairs());
    }
}
