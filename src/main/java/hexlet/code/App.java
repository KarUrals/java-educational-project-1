package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(Engine.getAnswer());

        switch (choice) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.game = new Even();
                Engine.launchGame(Engine.game);
                break;
            case 3:
                Engine.game = new Calc();
                Engine.launchGame(Engine.game);
                break;
        }
    }
}
