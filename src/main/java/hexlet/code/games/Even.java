package hexlet.code.games;

import hexlet.code.Engine;

public class Even implements Games {

    @Override
    public void displayTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public void runGameRound() {
        int number = Engine.setRandomNumber(1, Engine.MAX_RANDOM_NUMBER);
        Engine.setCorrectAnswer(number % 2 == 0 ? "yes" : "no");
        System.out.println("Question: " + number);

        Engine.setUserAnswer();
        Engine.answerAnalyse(Engine.getPlayer(), Engine.getUserAnswer(), Engine.getCorrectAnswer());
    }
}
