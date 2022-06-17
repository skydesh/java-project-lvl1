package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Gcd;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    private static final int EXIT = 0;
    private static final String GAME_SELECTOR =
            "Please enter the game number and press Enter.";

    public static void main(String[] args) {
        Scanner scn = Engine.scanner();
        System.out.println(GAME_SELECTOR);
        System.out.println(GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALC + " - Calc\n"
                + GCD + " - GCD\n"
                + PROGRESSION + " - Progression\n"
                + PRIME + " - Prime\n"
                + EXIT + " - Exit");
        System.out.print("Your choice: ");
        int userChoice = scn.nextInt();
        switch (userChoice) {
            case EVEN -> Even.game();
            case CALC -> Calc.game();
            case GCD -> Gcd.game();
            case PROGRESSION -> Progression.game();
            case PRIME -> Prime.game();
            default -> Engine.exit();
        }
    }
}
