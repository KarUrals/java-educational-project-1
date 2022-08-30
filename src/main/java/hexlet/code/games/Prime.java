package hexlet.code.games;

import hexlet.code.Engine;

public class Prime implements Games {
    @Override
    public final void displayTask() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public final void runGameRound() {
        int number = Engine.setRandomNumber(2, Engine.MAX_RANDOM_NUMBER);

        Engine.setCorrectAnswer("yes");
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                Engine.setCorrectAnswer("no");
                break;
            }
        }

        System.out.println("Question: " + number);

        Engine.setUserAnswer();
        Engine.answerAnalyse(Engine.getPlayer(), Engine.getUserAnswer(), Engine.getCorrectAnswer());
    }
}
