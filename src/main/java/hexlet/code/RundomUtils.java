package hexlet.code;

import java.util.Random;

public class RundomUtils {

    public static final int MAX_RANDOM_NUMBER = 99;
    private static final Random RANDOMIZER = new Random();

    public static int generateRandomNumberFromRange(int min, int max) {
        int range = max - min + 1;

        return RANDOMIZER.nextInt(range) + min;
    }
}
