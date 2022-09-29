package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_NUMBER = 3;
    public static final Scanner IN = new Scanner(System.in);
    private static String playerName;

    public static void runGame(String gameTask, String[][] questionAnswerArray) {
        greeting();
        System.out.println(gameTask);
        int i = 0;
        while (i < MAX_ROUND_NUMBER) {
            String correctRoundAnswer = questionAnswerArray[i][1];
            String roundQuestion = questionAnswerArray[i][0];
            System.out.println(roundQuestion);
            System.out.print("Your answer: ");
            String userAnswer = IN.nextLine();
            if (!userAnswer.equals(correctRoundAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctRoundAnswer + "'");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
            i++;
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
    private static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        playerName = IN.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }
}
