package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String CALC_TASK = "What is the result of the expression?";
    private static final int RANGE_NUMBER = 11;
    private static final int NUM_OF_OPERATIONS = 3;
    private static final String[] MATH_OPERATORS = {" + ", " - ", " * "};

    private static int calculate(int b, int a, String mathOperator) {
        return switch (mathOperator) {
            case " + " -> a + b;
            case " - " -> a - b;
            case " * " -> a * b;
            default -> throw new RuntimeException("'" + mathOperator + "' "
                        + "is wrong operator.");
        };
    }

    public static void startGame() {
        String[][] gameParams = new String[Engine.ROUNDS_NUMBER][Engine.PARAMETERS_NUMBER];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            int a = Utils.random(RANGE_NUMBER);
            int b = Utils.random(RANGE_NUMBER);
            int operator = Utils.random(NUM_OF_OPERATIONS);
            gameParams[i] = new String[] {a + MATH_OPERATORS[operator] + b,
                    Integer.toString(calculate(a, b, MATH_OPERATORS[operator]))};
        }
        Engine.game(CALC_TASK, gameParams);
    }
}
