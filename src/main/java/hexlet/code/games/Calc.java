package hexlet.code.games;

import hexlet.code.Engine;

public class Calc implements Games {

    @Override
    public void displayTask() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public void runGameRound() {
        int number1 = Engine.setNumber(1, 99);
        int number2 = Engine.setNumber(1, 99);
        int sign = Engine.setNumber(1, 3);

        switch (sign) {
            case 1:
                Engine.correctAnswer = String.valueOf(number1 + number2);
                System.out.println("Question: " + number1 + " + " + number2);
                break;
            case 2:
                Engine.correctAnswer = String.valueOf(number1 - number2);
                System.out.println("Question: " + number1 + " - " + number2);
                break;
            case 3:
                Engine.correctAnswer = String.valueOf(number1 * number2);
                System.out.println("Question: " + number1 + " * " + number2);
                break;
        }

        Engine.askPlayerAnswer();
        Engine.answerAnalyse(Engine.player, Engine.answer, Engine.correctAnswer);
    }
}
