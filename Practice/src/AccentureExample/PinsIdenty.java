package AccentureExample;

import java.util.Arrays;

public class PinsIdenty {
    public static void main(String[] args) {
        int[] pins = {1234,8975,5656,2589};
        int[] validPins = pins(pins);

        System.out.println("Valid Pins: " + Arrays.toString(validPins));

    }
    public static int[] pins(int[] pins){
        int[] validPins = new int[pins.length];
        int validCount = 0;

        for (int pin : pins) {
            int lastDigit = pin % 10;

            if (lastDigit % 2 == 0 && pin > 1000 && pin < 9999) {
                validPins[validCount++] = pin;
            }
        }
        return Arrays.copyOf(validPins,validCount);
    }
}
