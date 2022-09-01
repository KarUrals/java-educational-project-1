package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final String GAME_TASK = "What is the result of the expression?";
    private static final int NUMBER_OF_OPERATIONS = 3;

    public static String[][] run() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];
        String correctAnswer = null;

        int number1;
        int number2;
        String operator;
        for (String[] pair: array) {
            number1 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            number2 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            operator = String.valueOf(Engine.setRandomNumber(1, NUMBER_OF_OPERATIONS));

            switch (operator) {
                case "1":
                    correctAnswer = String.valueOf(number1 + number2);
                    operator = " + ";
                    break;
                case "2":
                    correctAnswer = String.valueOf(number1 - number2);
                    operator = " - ";
                    break;
                case "3":
                    correctAnswer = String.valueOf(number1 * number2);
                    operator = " * ";
                    break;
                default:
                    break;
            }
            pair[0] = "Question: " + number1 + operator + number2;
            pair[1] = correctAnswer;
        }

        return array;
    }
}
