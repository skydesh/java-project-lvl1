package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    private static final int PROGRESSION_LENGTH = 7;
    private static final int PROGRESSION_RANGE = 100;
    private static final String UNKNOWN_NUM = "..";
    private static final String PROGRESSION_TASK = "What number is missing in the progression?";

    public static String[] progression() {
        int startNum = Engine.random(PROGRESSION_RANGE);
        int step = Engine.random(PROGRESSION_LENGTH) + 1;
        int skipNum = Engine.random(PROGRESSION_LENGTH);
        int numToReturn = 0;
        String[] numArray = new String[PROGRESSION_LENGTH];
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i == skipNum) {
                numArray[i] = UNKNOWN_NUM;
                numToReturn = startNum;
            } else {
                numArray[i] = Integer.toString(startNum);
            }
            startNum += step;
        }
        return new String[]{String.join(" ", numArray), Integer.toString(numToReturn)};
    }

    public static String[][] game() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            gameParam[i] = progression();
        }
        return gameParam;
    }
    public static void toGame() {
        Engine.startGame(PROGRESSION_TASK, game());
    }
}
