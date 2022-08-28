package hexlet.code;

public class Player {
    private String name;
    private int correctAnswerCount;
    private final int EXIT = 4;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCorrectAnswerCount() {
        return this.correctAnswerCount;
    }

    public void increaseCorrectAnswersCount() {
        correctAnswerCount++;
    }

    public void exitEven() {
        this.correctAnswerCount = EXIT;
    }
}
