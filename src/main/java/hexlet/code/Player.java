package hexlet.code;

public class Player {
    private String name;
    private int correctAnswerCount;

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

    public void exitGames() {
        this.correctAnswerCount = Engine.MAX_ROUND_NUMBER + 1;
    }
}
