package hexlet.code;

public class Greeting {

    public static String output() {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        String name = Answer.getAnswer();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
