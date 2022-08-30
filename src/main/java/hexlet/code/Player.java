package hexlet.code;

public class Player {
    private String name;
    private int correctAnswerCount;

    public Player(String enteredName) {
        this.name = enteredName;
    }

    public String getName() {
        return name;
    }

    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public void increaseCorrectAnswersCount() {
        correctAnswerCount++;
    }

    public void exitGames() {
        this.correctAnswerCount = Engine.MAX_ROUND_NUMBER + 1;
    }
}
