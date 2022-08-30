package hexlet.code;

import hexlet.code.games.Games;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUND_NUMBER = 3;
    public static final int MAX_RANDOM_NUMBER = 99;
    private static String playerName;
    private static Games game;
    private static Player player;
    private static String userAnswer;
    private static String correctAnswer;

    public static int setRandomNumber(int min, int max) {
        int range = max - min + 1;

        return (int) (Math.random() * range) + min;
    }

    public static String getAnswer() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static Player getPlayer() {
        return player;
    }

    public static String getUserAnswer() {
        return userAnswer;
    }
    public static void setUserAnswer() {
        System.out.print("Your answer: ");
        userAnswer = getAnswer();
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
    public static void setCorrectAnswer(String s) {
        correctAnswer = s;
    }

    public static void startGame(Player currentPlayer, Games selectedGame) {
        selectedGame.displayTask();
        while (currentPlayer.getCorrectAnswerCount() < MAX_ROUND_NUMBER) {
            selectedGame.runGameRound();
        }
    }

    public static void endGame(Player currentPlayer) {
        if (currentPlayer.getCorrectAnswerCount() == MAX_ROUND_NUMBER) {
            System.out.println("Congratulations, " + currentPlayer.getName() + "!");
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

    public static void answerAnalyse(Player currentPlayer, String answer, String gameCorrectAnswer) {
        if (answer.equals(gameCorrectAnswer)) {
            System.out.println("Correct!");
            currentPlayer.increaseCorrectAnswersCount();
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + gameCorrectAnswer + "'");
            System.out.println("Let's try again, " + currentPlayer.getName() + "!");
            currentPlayer.exitGames();
        }
    }

    public static void launchGame(Games selectedGame) {
        game = selectedGame;
        greeting();
        createNewPlayer();
        startGame(player, game);
        endGame(player);
    }
}
