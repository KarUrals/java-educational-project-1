package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final String GAME_TASK = "What number is missing in the progression?";

    public static String[][] setQuestionAnswerArray() {
        final int step = 10;
        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;

        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int firstProgressionNumber = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            int progressionStep = Engine.setRandomNumber(-step, step);
            int progressionSize = Engine.setRandomNumber(minProgressionSize, maxProgressionSize);
            int index = Engine.setRandomNumber(0, progressionSize - 1);

            //set correct answer
            roundQuestionAnswer[1] = findCorrectAnswer(progressionSize, firstProgressionNumber, progressionStep, index);
            //set question
            roundQuestionAnswer[0] = buildQuestion(progressionSize, firstProgressionNumber, progressionStep, index);
        }

        return array;
    }
    private static String buildQuestion(int progressionSize, int firstNumber, int step, int index) {
        StringBuilder strBld = new StringBuilder("Question: ");

        for (int i = 0; i < progressionSize; i++) {
            int num = firstNumber + step * i;
            if (i == index) {
                strBld.append(".. ");
            } else {
                strBld.append(num + " ");
            }
        }

        return strBld.toString();
    }

    private static String findCorrectAnswer(int progressionSize, int firstNumber, int step, int index) {
        String correctAnswer = null;

        for (int i = 0; i < progressionSize; i++) {
            int num = firstNumber + step * i;
            if (i == index) {
                correctAnswer = String.valueOf(num);
            }
        }

        return correctAnswer;
    }
}
