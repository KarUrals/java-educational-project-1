package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start(Player player) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (player.getCorrectAnswerCount() < 3) {
            step(player);
        }

        if (player.getCorrectAnswerCount() == 3) {
            System.out.println("Congratulations, " + player.getName() + "!");
        }
    }

    public static void step(Player player) {
        int number = setNumber();
        String correctAnswer = number % 2 == 0 ? "yes" : "no";

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = Answer.getAnswer();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            player.increaseCorrectAnswersCount();
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
            System.out.println("Let's try again, " + player.getName() + "!");
            player.exitEven();
        }
    }

    public static int setNumber() {
        final int MAX = 100;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        return (int)(Math.random() * range) + MIN;
    }

    public static String getAnswer() {
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        return answer;
    }
}
