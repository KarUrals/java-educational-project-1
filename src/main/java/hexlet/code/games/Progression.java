package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final String GAME_TASK = "What number is missing in the progression?";

    public static String[][] run() {
        final int step = 10;
        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;

        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        int firstProgressionNumber;
        int progressionStep;
        int progressionSize;
        int index;

        String correctAnswer = null;
        String question;

        for (String[] pair: array) {
            firstProgressionNumber = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            progressionStep = Engine.setRandomNumber(-step, step);
            progressionSize = Engine.setRandomNumber(minProgressionSize, maxProgressionSize);
            index = Engine.setRandomNumber(0, progressionSize - 1);
            int[] task = new int[progressionSize];

            question = "Question: ";
            for (int i = 0; i < progressionSize; i++) {
                task[i] = firstProgressionNumber + progressionStep * i;
                if (i == index) {
                    correctAnswer = String.valueOf(task[i]);
                    question += ".. ";
                } else {
                    question += task[i] + " ";
                }
            }

            pair[0] = question;
            pair[1] = correctAnswer;
        }

        return array;
    }
}
