package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final String GAME_TASK = "What is the result of the expression?";
    private static final int NUMBER_OF_OPERATIONS = 3;

    public static String[][] run() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] pair: array) {
            int number1 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            int number2 = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
            String operator = String.valueOf(Engine.setRandomNumber(1, NUMBER_OF_OPERATIONS));

            switch (operator) {
                case "1":
                    pair[1] = String.valueOf(number1 + number2);
                    operator = " + ";
                    break;
                case "2":
                    pair[1] = String.valueOf(number1 - number2);
                    operator = " - ";
                    break;
                case "3":
                    pair[1] = String.valueOf(number1 * number2);
                    operator = " * ";
                    break;
                default:
                    break;
            }
            pair[0] = "Question: " + number1 + operator + number2;
        }

        return array;
    }
}
