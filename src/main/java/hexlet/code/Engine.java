package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_NUMBER = 3;
    public static final Scanner IN = new Scanner(System.in);
    private static String playerName;
    private static int correctAnswerCount;

    public static void runGame(String gameTask, String[][] questionAnswerArray) {
        greeting();
        showTask(gameTask);
        int i = 0;
        while (i < MAX_ROUND_NUMBER) {
            String correctAnswer = questionAnswerArray[i][1];
            askQuestion(questionAnswerArray[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = IN.nextLine();
            if (answerAnalyse(userAnswer, correctAnswer)) {
                System.out.println("Correct!");
                correctAnswerCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'");
                break;
            }
            i++;
        }
        endGame();
    }
    private static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        playerName = IN.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }
    private static void showTask(String task) {
        System.out.println(task);
    }
    private static void askQuestion(String question) {
        System.out.println(question);
    }
    private static boolean answerAnalyse(String answer, String gameCorrectAnswer) {
        return answer.equals(gameCorrectAnswer);
    }

    private static void endGame() {
        String message = correctAnswerCount == MAX_ROUND_NUMBER ? "Congratulations, " : "Let's try again, ";
        System.out.println(message + playerName + "!");
    }
}
