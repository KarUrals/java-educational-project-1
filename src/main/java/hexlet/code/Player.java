package hexlet.code;

public class Player {
    private String name;
    private int correctAnswerCount;

    public Player(String enteredName) {
        this.name = enteredName;
    }

    public final String getName() {
        return name;
    }

    public final  int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public final void increaseCorrectAnswersCount() {
        correctAnswerCount++;
    }

    public final void exitGames() {
        this.correctAnswerCount = Engine.MAX_ROUND_NUMBER + 1;
    }
}
