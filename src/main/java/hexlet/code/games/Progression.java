package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int PROGRESSION_LENGTH = 7;
    private static final int PROGRESSION_RANGE = 100;
    private static final String UNKNOWN_NUM = "..";
    private static final String PROGRESSION_TASK = "What number is missing in the progression?";
    private static String[][] gameParams;

    public static String[] getProgression(int startNum, int step, int length) {
        String[] numArray = new String[length];
        for (int i = 0; i < length; i++) {
            numArray[i] = Integer.toString(startNum);
            startNum += step;
        }
        return numArray;
    }

    public static String[] progression() {
        int skipNum = Utils.random(PROGRESSION_LENGTH);
        int startNum = Utils.random(PROGRESSION_RANGE);
        int step = Utils.random(PROGRESSION_LENGTH) + 1;
        int numToReturn = 0;
        String[] progression = getProgression(startNum, step, PROGRESSION_LENGTH);
        String[] numArray = new String[PROGRESSION_LENGTH];
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i == skipNum) {
                numArray[i] = UNKNOWN_NUM;
                numToReturn = startNum;
            } else {
                numArray[i] = progression[i];
            }
            startNum += step;
        }
        return new String[]{String.join(" ", numArray), Integer.toString(numToReturn)};
    }

    public static void gameParameters() {
        gameParams = new String[Engine.ROUNDS_NUMBER][Engine.PARAMETERS_NUMBER];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            gameParams[i] = progression();
        }
    }

    public static void startGame() {
        gameParameters();
        Engine.game(PROGRESSION_TASK, gameParams);
    }
}
