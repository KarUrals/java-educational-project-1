package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.RundomUtils.generateRandomNumberFromRange;
import static hexlet.code.RundomUtils.MAX_RANDOM_NUMBER;

public class ProgressionGame {
    public static final String GAME_TASK = "What number is missing in the progression?";

    public static void launchGame() {
        Engine.runGame(GAME_TASK, generateQuestionAnswerPairs());
    }

    private static String[][] generateQuestionAnswerPairs() {
        final int step = 10;
        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;

        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int firstProgressionNumber = generateRandomNumberFromRange(1, MAX_RANDOM_NUMBER);
            int progressionStep = generateRandomNumberFromRange(-step, step);
            int progressionSize = generateRandomNumberFromRange(minProgressionSize, maxProgressionSize);
            int index = generateRandomNumberFromRange(0, progressionSize - 1);

            int[] roundProgression = generateProgression(progressionSize, firstProgressionNumber, progressionStep);

            //set correct answer
            roundQuestionAnswer[1] = String.valueOf(roundProgression[index]);
            //set question
            roundQuestionAnswer[0] = buildQuestion(roundProgression, index);
        }

        return array;
    }
    private static int[] generateProgression(int size, int firstNumber, int step) {
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
}
