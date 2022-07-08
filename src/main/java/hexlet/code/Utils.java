package hexlet.code;

import java.util.Random;

public class Utils {
    public static final Random RANDOM = new Random();

    public static int random(int range) {
        return RANDOM.nextInt(range);
    }

    public static int random(int min, int range) {
        return min + RANDOM.nextInt((range - min) + 1);
    }
}
