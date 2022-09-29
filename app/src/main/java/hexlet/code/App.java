package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

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
            case "2" -> EvenGame.launchGame();
            case "3" -> CalculatorGame.launchGame();
            case "4" -> GCDGame.launchGame();
            case "5" -> ProgressionGame.launchGame();
            case "6" -> PrimeGame.launchGame();
            default -> {
            }
        }
    }
}
