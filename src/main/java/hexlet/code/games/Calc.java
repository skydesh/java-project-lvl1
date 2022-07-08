package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int SUM = 1;
    private static final int SUBTRACTION = 2;
    private static final String CALC_TASK = "What is the result of the expression?";
    private static final int RANGE_NUMBER = 11;
    private static final int NUM_OF_OPERATIONS = 3;
    private static final String[] MATH_OPERATORS = {" + ", " - ", " * "};
    private static int a;
    private static int b;

    private static String[] taskExpression(int y, int z, String mathOperator) {
        String mathExpression = y + mathOperator + z;
        return switch (mathOperator) {
            case " + " -> new String[]{mathExpression, Integer.toString(y + z)};
            case " - " -> new String[]{mathExpression, Integer.toString(y - z)};
            case " * " -> new String[]{mathExpression, Integer.toString(y * z)};
            default -> {
                System.err.println("'" + mathOperator + "' "
                        + "is wrong operator.");
                throw new RuntimeException();
            }
        };
    }

    private static String[] taskSelector() {
        int expressionNum = Utils.random(NUM_OF_OPERATIONS);
        return switch (expressionNum) {
            case SUM -> taskExpression(a, b, MATH_OPERATORS[0]);
            case SUBTRACTION -> taskExpression(a, b, MATH_OPERATORS[1]);
            default -> taskExpression(a, b, MATH_OPERATORS[2]);
        };
    }

    public static String[][] gameParameters() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            a = Utils.random(RANGE_NUMBER);
            b = Utils.random(RANGE_NUMBER);
            gameParam[i] = taskSelector();
        }
        return gameParam;
    }

    public static void startGame() {
        Engine.game(CALC_TASK, gameParameters());
    }
}
