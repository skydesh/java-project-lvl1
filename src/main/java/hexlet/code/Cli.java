package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String GREETING = "Welcome to the Brain Games!";

    public static void greet() {
        System.out.println(GREETING);
        Scanner scn = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scn.next();
        System.out.println("Hello, " + name + "!");
    }
}
