package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RundomUtils;

public class Even {
    public static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[][] setQuestionAnswerArray() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        int number;

        for (String[] roundQuestionAnswer: array) {
            number = RundomUtils.returnRandomNumber(1, RundomUtils.MAX_RANDOM_NUMBER);
            //set question
            roundQuestionAnswer[0] = "Question: " + number;
            //set correct answer
            roundQuestionAnswer[1] = number % 2 == 0 ? "yes" : "no";
        }

        return array;
    }
}
