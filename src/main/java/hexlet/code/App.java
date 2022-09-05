package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n"
                + "4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");

        switch (Engine.IN.nextLine()) {
            case "1":
                System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
                System.out.println("Hello, " + Cli.getName() + "!");
                break;
            case "2":
                Engine.runGame(Even.GAME_TASK, Even.setQuestionAnswerArray());
                break;
            case "3":
                Engine.runGame(Calc.GAME_TASK, Calc.setQuestionAnswerArray());
                break;
            case "4":
                Engine.runGame(GCD.GAME_TASK, GCD.setQuestionAnswerArray());
                break;
            case "5":
                Engine.runGame(Progression.GAME_TASK, Progression.setQuestionAnswerArray());
                break;
            case "6":
                Engine.runGame(Prime.GAME_TASK, Prime.setQuestionAnswerArray());
                break;
            default:
                break;
        }
    }
}
