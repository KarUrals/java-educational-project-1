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
                Engine.setGame(new Even());
                Engine.launchGame(Engine.getGame());
                break;
            case "3":
                Engine.setGame(new Calc());
                Engine.launchGame(Engine.getGame());
                break;
            case "4":
                Engine.setGame(new GCD());
                Engine.launchGame(Engine.getGame());
                break;
            case "5":
                Engine.setGame(new Progression());
                Engine.launchGame(Engine.getGame());
                break;
            case "6":
                Engine.setGame(new Prime());
                Engine.launchGame(Engine.getGame());
                break;
            default:
                break;
        }
    }
}
