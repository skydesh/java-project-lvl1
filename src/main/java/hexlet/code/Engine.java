package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String MESSAGE_CORRECT = "Correct!";
    private static final String CONGRATULATIONS = "Congratulations, ";
    public static final String QUESTION = "Question: ";
    public static final String USER_ANSWER = "Your answer: ";
    public static final int NUM_OF_ATTEMPTS = 3;
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
    public static void errorMessage(String answer, String userAnswer, String name) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + answer + "'" + ".\n" + "Let's try again, " + name + "!");
    }
    public static String getUserAnswer() {
        System.out.print(USER_ANSWER);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }
    public static boolean checkAnswer(String answer, String userAnswer, String name) {
        if (userAnswer.equals(answer)) {
            System.out.println(MESSAGE_CORRECT);
            return true;
        } else {
            errorMessage(answer, userAnswer, name);
        }
        return false;
    }
    public static void printCongratulations(String name) {
        System.out.println(CONGRATULATIONS + name + "!");
    }
    public static int random(int range) {
        return (int) (Math.random() * range);
    }
    public static String greetGetName(String task) {
        Cli.greet();
        System.out.println(task);
        return Cli.getName();
    }
    public static void exit() { }
}
