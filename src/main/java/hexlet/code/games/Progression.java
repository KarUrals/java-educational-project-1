package hexlet.code.games;

import hexlet.code.Engine;

public class Progression implements Games {
    @Override
    public final void displayTask() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public final void runGameRound() {
        final int step = 10;
        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;

        int firstProgressionNumber = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
        int progressionStep = Engine.setRandomNumber(-step, step);
        int progressionSize = Engine.setRandomNumber(minProgressionSize, maxProgressionSize);
        int index = Engine.setRandomNumber(0, progressionSize - 1);
        int[] array = new int[progressionSize];

        System.out.print("Question: ");
        for (int i = 0; i < progressionSize; i++) {
            array[i] = firstProgressionNumber + progressionStep * i;
            if (i == index) {
                Engine.setCorrectAnswer(String.valueOf(array[i]));
                System.out.print(".. ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        Engine.setUserAnswer();
        Engine.answerAnalyse(Engine.getPlayer(), Engine.getUserAnswer(), Engine.getCorrectAnswer());
    }
}
