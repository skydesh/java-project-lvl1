package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {
    public static final String PRIME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int NUMBERS_RANGE = 100;

    public static boolean isPrimeNumber(int num) {
        System.out.println(Engine.QUESTION + num);
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void game() {
        int count = 0;
        Engine.greet();
        String userName = Engine.getName();
        Engine.explainTask(PRIME_TASK);
        while (count < 3) {
            String answer = isPrimeNumber(Engine.random(NUMBERS_RANGE)) ? "yes" : "no";
            String userAnswer = Engine.getUserAnswer();
            boolean correct = Engine.checkAnswer(answer, userAnswer, userName);
            if (!correct) {
                return;
            }
            count++;
        }
        Engine.printCongratulations(userName);
    }
}
