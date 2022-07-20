package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int PROGRESSION_LENGTH = 7;
    private static final int PROGRESSION_RANGE = 100;
    private static final String UNKNOWN_NUM = ".. ";
    private static final String PROGRESSION_TASK = "What number is missing in the progression?";

    public static int[] getProgression(int startNum, int step, int length) {
        int[] numArray = new int[length];
        for (int i = 0; i < length; i++) {
            numArray[i] = startNum + step * i;
        }
        return numArray;
    }

    public static String[] progression() {
        int skipNum = Utils.random(PROGRESSION_LENGTH);
        int startNum = Utils.random(PROGRESSION_RANGE);
        int step = Utils.random(PROGRESSION_LENGTH) + 1;
        int numToReturn = 0;
        int[] progression = getProgression(startNum, step, PROGRESSION_LENGTH);
        StringBuilder questionProgression = new StringBuilder();
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i == skipNum) {
                questionProgression.append(UNKNOWN_NUM);
                numToReturn = startNum;
            } else {
                questionProgression.append(progression[i]).append(" ");
            }
            startNum += step;
        }
        return new String[]{String.valueOf(questionProgression), Integer.toString(numToReturn)};
    }

    public static void startGame() {
        String[][] gameParams = new String[Engine.ROUNDS_NUMBER][Engine.PARAMETERS_NUMBER];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            gameParams[i] = progression();
        }
        Engine.game(PROGRESSION_TASK, gameParams);
    }
}
