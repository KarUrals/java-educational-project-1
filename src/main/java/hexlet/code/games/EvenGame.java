package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.RundomUtils.generateRandomNumberFromRange;
import static hexlet.code.RundomUtils.MAX_RANDOM_NUMBER;

public class EvenGame {
    public static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void launchGame() {
        Engine.runGame(GAME_TASK, generateQuestionAnswerPairs());
    }

    private static String[][] generateQuestionAnswerPairs() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        int number;

        for (String[] roundQuestionAnswer: array) {
            number = generateRandomNumberFromRange(1, MAX_RANDOM_NUMBER);
            //set question
            roundQuestionAnswer[0] = "Question: " + number;
            //set correct answer
            roundQuestionAnswer[1] = isEven(number) ? "yes" : "no";
        }

        return array;
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

