package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String MESSAGE_CORRECT = "Correct!";
    private static final String CONGRATULATIONS = "Congratulations, ";
    private static final String QUESTION = "Question: ";
    private static final String USER_ANSWER = "Your answer: ";
    private static final String GREETING = "Welcome to the Brain Games!";
    public static final int ROUNDS_NUMBER = 3;
    public static final int PARAMETERS_NUMBER = 2;

    public static void game(String task, String[][] gameParameters) {
        System.out.println(GREETING);
        System.out.print("May I have your name? ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        String answer;
        String userAnswer;
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println(QUESTION + gameParameters[i][0]);
            answer = gameParameters[i][1];
            System.out.print(USER_ANSWER);
            userAnswer = scn.nextLine();
            if (userAnswer.equals(answer)) {
                System.out.println(MESSAGE_CORRECT);
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + answer + "'" + ".\n" + "Let's try again, " + name + "!");
                return;
            }
            System.out.println(CONGRATULATIONS + name + "!");
        }
    }
}
