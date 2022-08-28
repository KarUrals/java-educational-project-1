package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = gameSelection();
        String name;

        switch (choice) {
            case 1:
                name = Greeting.output();
                break;
            case 2:
                name = Greeting.output();
                Player player = new Player(name);
                Even.start(player);
                break;
        }


    }

    public static int gameSelection() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }

}
