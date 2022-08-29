package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(Engine.getAnswer());

        switch (choice) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.game = new Even();
                Engine.greeting();
                Engine.createNewPlayer();
                Engine.startGame(Engine.player, Engine.game);
                Engine.endGame(Engine.player);
                break;
            case 3:
                Engine.game = new Calc();
                Engine.greeting();
                Engine.createNewPlayer();
                Engine.startGame(Engine.player, Engine.game);
                Engine.endGame(Engine.player);
                break;
        }
    }
}
