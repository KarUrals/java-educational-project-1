package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_NUMBER = 3;
    public static final int MAX_RANDOM_NUMBER = 99;
    private static String playerName;
    private static int correctAnswerCount;
    private static String userAnswer;
    private static String correctAnswer;
    private static Random random = new Random();

    public static int setRandomNumber(int min, int max) {
        int range = max - min + 1;

        return random.nextInt(range) + min;
    }

    public static String getAnswer() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void setUserAnswer() {
        System.out.print("Your answer: ");
        userAnswer = getAnswer();
    }

    public static void setCorrectAnswer(String s) {
        correctAnswer = s;
    }

    public static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        playerName = getAnswer();
        System.out.println("Hello, " + playerName + "!");
    }

    public static void endGame() {
        if (correctAnswerCount == MAX_ROUND_NUMBER) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }

    public static void showTask(String task) {
        System.out.println(task);
    }

    public static void askQuestion(String question) {
        System.out.println(question);
    }
    public static void answerAnalyse(String answer, String gameCorrectAnswer) {
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
    public static void runGame(String gameTask, String[][] questionAnswerArray) {
        greeting();
        showTask(gameTask);
        int i = 0;
        while (correctAnswerCount < MAX_ROUND_NUMBER) {
            setCorrectAnswer(questionAnswerArray[i][1]);
            askQuestion(questionAnswerArray[i][0]);
            Engine.setUserAnswer();
            Engine.answerAnalyse(userAnswer, correctAnswer);
            i++;
        }
        Engine.endGame();
    }
}
