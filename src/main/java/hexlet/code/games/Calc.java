package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int SUM = 1;
    private static final int SUBTRACTION = 2;
    private static final String MATH_SUM = " + ";
    private static final String MATH_SUBTRACTION = " - ";
    private static final String MATH_MULTIPLICATION = " * ";
    private static final String CALC_TASK = "What is the result of the expression?";
    private static final int RANGE_NUMBER = 11;
    private static final int NUM_OF_OPERATIONS = 3;
    private static int a;
    private static int b;

    private static String[] taskExpression(int y, int z, String mathOperator) {
        String mathExpression = y + mathOperator + z;
        return switch (mathOperator) {
            case MATH_SUM -> new String[]{mathExpression, Integer.toString(y + z)};
            case MATH_SUBTRACTION -> new String[]{mathExpression, Integer.toString(y - z)};
            default -> new String[]{mathExpression, Integer.toString(y * z)};
        };
    }

    private static String[] taskSelector() {
        int expressionNum = (int) (Math.random() * NUM_OF_OPERATIONS);
        return switch (expressionNum) {
            case SUM -> taskExpression(a, b, MATH_SUM);
            case SUBTRACTION -> taskExpression(a, b, MATH_SUBTRACTION);
            default -> taskExpression(a, b, MATH_MULTIPLICATION);
        };
    }

    public static String[][] game() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            a = (int) (Math.random() * RANGE_NUMBER);
            b = (int) (Math.random() * RANGE_NUMBER);
            gameParam[i] = taskSelector();
        }
        return gameParam;
    }

    public static void toGame() {
        Engine.startGame(CALC_TASK, game());
    }
}
