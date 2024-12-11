package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * And car is running (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean lightsOn = false;
        Scanner in = new Scanner(System.in);
        int speed = 0;

        System.out.println("Please insert if it is raining: ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the speed: ");
        speed = in.nextInt();

        System.out.println("Please insert if it is dark: ");
        isDark = in.nextBoolean();

        lightsOn = isRaining && ((speed > MAX_CAR_SPEED) || isDark);

        System.out.println("Lights on " + lightsOn);
    }
}
