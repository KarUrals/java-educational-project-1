package hexlet.code.games;

import hexlet.code.Engine;

public class Calc implements Games {

    @Override
    public final void displayTask() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public final void runGameRound() {
        final int numberOfOperations = 3;

        int number1 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
        int number2 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
        String operator = String.valueOf(Engine.setRandomNumber(1, numberOfOperations));

        switch (operator) {
            case "1":
                Engine.setCorrectAnswer(String.valueOf(number1 + number2));
                operator = " + ";
                break;
            case "2":
                Engine.setCorrectAnswer(String.valueOf(number1 - number2));
                operator = " - ";
                break;
            case "3":
                Engine.setCorrectAnswer(String.valueOf(number1 * number2));
                operator = " * ";
                break;
            default:
                break;
        }
        System.out.println("Question: " + number1 + operator + number2);

        Engine.setUserAnswer();
        Engine.answerAnalyse(Engine.getPlayer(), Engine.getUserAnswer(), Engine.getCorrectAnswer());
    }
}
