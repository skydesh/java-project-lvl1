package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String GREETING = "Welcome to the Brain Games!";
    private static String name;
    public static String getName() {
        return name;
    }
    public static void greet() {
        System.out.println(GREETING);
        Scanner scn = Engine.scanner();
        System.out.print("May I have your name? ");
        name = scn.next();
        System.out.println("Hello, " + name + "!");
    }
}
