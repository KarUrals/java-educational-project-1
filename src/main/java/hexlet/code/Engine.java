package hexlet.code;

//import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_NUMBER = 3;
    private static String playerName;
    private static int correctAnswerCount;
    public static final Scanner IN = new Scanner(System.in);

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
    private static void answerAnalyse(String answer, String gameCorrectAnswer) {
        if (answer.equals(gameCorrectAnswer)) {
            System.out.println("Correct!");
            correctAnswerCount++;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + gameCorrectAnswer + "'");
            System.out.println("Let's try again, " + playerName + "!");
            correctAnswerCount = MAX_ROUND_NUMBER + 1;
        }
    }
    private static void endGame() {
        if (correctAnswerCount == MAX_ROUND_NUMBER) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }

    public static void runGame(String gameTask, String[][] questionAnswerArray) {
        greeting();
        showTask(gameTask);
        int i = 0;
        while (correctAnswerCount < MAX_ROUND_NUMBER) {
            String correctAnswer = questionAnswerArray[i][1];
            askQuestion(questionAnswerArray[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = IN.nextLine();
            Engine.answerAnalyse(userAnswer, correctAnswer);
            i++;
        }
        Engine.endGame();
    }
}
