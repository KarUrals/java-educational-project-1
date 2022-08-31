package hexlet.code.games;

import hexlet.code.Engine;
public class GCD implements Games {
    @Override
    public final void displayTask() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public final void runGameRound() {
        int number1 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
        int number2 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
        Engine.setCorrectAnswer("1");
        for (int i = 1; i <= Math.min(Math.abs(number1), Math.abs(number2)); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                Engine.setCorrectAnswer(String.valueOf(i));
            }
        }
        System.out.println("Question: " + number1 + " " + number2);

        Engine.setUserAnswer();
        Engine.answerAnalyse(Engine.getPlayer(), Engine.getUserAnswer(), Engine.getCorrectAnswer());
    }
}
