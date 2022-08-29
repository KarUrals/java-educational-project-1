package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements Games {
    @Override
    public void displayTask() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public void runGameRound() {
        int number1 = Engine.setNumber(0, 99);
        int number2 = Engine.setNumber(0, 99);
        Engine.correctAnswer = String.valueOf(1);
        for (int i = 1; i <= Math.min(Math.abs(number1), Math.abs(number2)); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                Engine.correctAnswer = String.valueOf(i);
            }
        }
        System.out.println("Question: " + number1 + " " + number2);
        Engine.askPlayerAnswer();
        Engine.answerAnalyse(Engine.player, Engine.answer, Engine.correctAnswer);
    }
}
