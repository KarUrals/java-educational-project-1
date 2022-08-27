package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        return name;
    }
}
