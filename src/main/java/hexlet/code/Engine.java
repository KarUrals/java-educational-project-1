package hexlet.code;

import hexlet.code.games.Games;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_NUMBER = 3;
    public static String playerName;
    public static Games game;
    public static Player player;
    public static String answer;
    public static String correctAnswer;

    public static int setNumber(int min, int max) {
        int range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }

    public static String getAnswer() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void startGame(Player player, Games game) {
        game.displayTask();
        while (player.getCorrectAnswerCount() < MAX_ROUND_NUMBER) {
            game.runGameRound();
        }
    }

    public static void endGame(Player player) {
        if (player.getCorrectAnswerCount() == MAX_ROUND_NUMBER) {
            System.out.println("Congratulations, " + player.getName() + "!");
        }
    }

    public static void createNewPlayer() {
        player = new Player(playerName);
    }

    public static void greeting() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        playerName = getAnswer();
        System.out.println("Hello, " + playerName + "!");
    }

    public static void answerAnalyse(Player player, String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            player.increaseCorrectAnswersCount();
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
            System.out.println("Let's try again, " + player.getName() + "!");
            player.exitGames();
        }
    }

    public static void askPlayerAnswer() {
        System.out.print("Your answer: ");
        answer = getAnswer();
    }
}
