package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] setQuestionAnswerArray() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int number = Engine.setRandomNumber(2, Engine.MAX_RANDOM_NUMBER);

            //set question
            roundQuestionAnswer[0] = "Question: " + number;
            //set correct answer
            roundQuestionAnswer[1] = "yes";
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    roundQuestionAnswer[1] = "no";
                    break;
                }
            }
        }

        return array;
    }
}
