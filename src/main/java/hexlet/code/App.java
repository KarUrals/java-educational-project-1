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
        String playerChoice = Engine.IN.nextLine();
        switch (playerChoice) {
            case "1" -> {
                System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
                System.out.println("Hello, " + Cli.getName() + "!");
            }
            case "2" -> Even.launchGame();
            case "3" -> Calc.launchGame();
            case "4" -> GCD.launchGame();
            case "5" -> Progression.launchGame();
            case "6" -> Prime.launchGame();
            default -> {
            }
        }
    }
}
