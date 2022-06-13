package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static String getName() {
        return name;
    }
    public static void greet() {
        Scanner scn = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scn.next();
        System.out.println("Hello, " + name + "!");
    }
}
