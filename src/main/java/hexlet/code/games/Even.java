package hexlet.code.games;

import hexlet.code.Engine;

public class Even implements Games {

    @Override
    public void displayTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public void runGameRound() {
        int number = Engine.setNumber(1, 99);
        Engine.correctAnswer = number % 2 == 0 ? "yes" : "no";
        System.out.println("Question: " + number);

        Engine.askPlayerAnswer();
        Engine.answerAnalyse(Engine.player, Engine.answer, Engine.correctAnswer);
    }
}
