package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    private static final String EVEN_TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final int NUM_RANGE = 100;
    private static boolean isEven() {
        int random = Engine.random(Even.NUM_RANGE);
        System.out.println(Engine.QUESTION + random);
        return random % 2 == 0;
    }
    public static void game() {
        String userName = Engine.greetGetName(EVEN_TASK);
        int count = 0;
        while (count < Engine.NUM_OF_ATTEMPTS) {
            String answer = isEven() ? "yes" : "no";
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
