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

        switch (Engine.getAnswer()) {
            case "1":
                Engine.greeting();
                break;
            case "2":
                Engine.launchGame(new Even());
                break;
            case "3":
                Engine.launchGame(new Calc());
                break;
            case "4":
                Engine.launchGame(new GCD());
                break;
            case "5":
                Engine.launchGame(new Progression());
                break;
            case "6":
                Engine.launchGame(new Prime());
                break;
            default:
                break;
        }
    }
}
