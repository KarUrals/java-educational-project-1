package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final String GAME_TASK = "What number is missing in the progression?";

    public static String[][] run() {
        final int step = 10;
        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;

        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        String question;

        for (String[] pair: array) {
            int firstProgressionNumber = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            int progressionStep = Engine.setRandomNumber(-step, step);
            int progressionSize = Engine.setRandomNumber(minProgressionSize, maxProgressionSize);
            int index = Engine.setRandomNumber(0, progressionSize - 1);
            int[] task = new int[progressionSize];

            question = "Question: ";
            for (int i = 0; i < progressionSize; i++) {
                task[i] = firstProgressionNumber + progressionStep * i;
                if (i == index) {
                    pair[1] = String.valueOf(task[i]);
                    question += ".. ";
                } else {
                    question += task[i] + " ";
                }
            }

            pair[0] = question;
        }

        return array;
    }
}
