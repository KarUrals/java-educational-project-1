package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RundomUtils;

public class Progression {
    public static final String GAME_TASK = "What number is missing in the progression?";

    public static String[][] setQuestionAnswerArray() {
        final int step = 10;
        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;

        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int firstProgressionNumber = RundomUtils.returnRandomNumber(1, RundomUtils.MAX_RANDOM_NUMBER);
            int progressionStep = RundomUtils.returnRandomNumber(-step, step);
            int progressionSize = RundomUtils.returnRandomNumber(minProgressionSize, maxProgressionSize);
            int index = RundomUtils.returnRandomNumber(0, progressionSize - 1);

            int[] roundProgression = makeProgression(progressionSize, firstProgressionNumber, progressionStep);

            //set correct answer
            roundQuestionAnswer[1] = findCorrectAnswer(roundProgression, index);
            //set question
            roundQuestionAnswer[0] = buildQuestion(roundProgression, index);
        }

        return array;
    }
    private static int[] makeProgression(int size, int firstNumber, int step) {
        int[] progression = new int[size];
        for (int i = 0; i < size; i++) {
            progression[i] = firstNumber + step * i;
        }
        return progression;
    }
    private static String buildQuestion(int[] progression, int index) {
        StringBuilder strBld = new StringBuilder("Question: ");
        for (int i = 0; i < progression.length; i++) {
            if (i == index) {
                strBld.append(".. ");
            } else {
                strBld.append(progression[i] + " ");
            }
        }

        return strBld.toString();
    }

    private static String findCorrectAnswer(int[] progression, int index) {
        String correctAnswer = null;

        for (int i = 0; i < progression.length; i++) {
            if (i == index) {
                correctAnswer = String.valueOf(progression[i]);
            }
        }

        return correctAnswer;
    }
}
