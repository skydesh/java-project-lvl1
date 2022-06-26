package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    private static final int PROGRESSION_LENGTH = 7;
    public static final int PROGRESSION_RANGE = 100;
    private static final String UNKNOWN_NUM = "..";
    public static final String PROGRESSION_TASK = "What number is missing in the progression?";

    public static int progression() {
        int startNum = Engine.random(PROGRESSION_RANGE);
        int step = Engine.random(PROGRESSION_LENGTH) + 1;
        int skipNum = Engine.random(PROGRESSION_LENGTH);
        int numToReturn = 0;
        System.out.print(Engine.QUESTION);
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i == skipNum) {
                System.out.print(UNKNOWN_NUM + " ");
                numToReturn = startNum;
            } else {
                System.out.print(startNum + " ");
            }
            startNum += step;
        }
        System.out.println();
        return numToReturn;
    }

    public static void game() {
        int count = 0;
        String userName = Engine.greetGetName(PROGRESSION_TASK);
        while (count < Engine.NUM_OF_ATTEMPTS) {
            String answer = Integer.toString(progression());
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
