package gr.aueb.cf.ch2;

/**
 * Asks the user to enter a temperature in Fahrenheit degrees and converts it
 * to Celsius.
 */

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        int temp = 0;

        System.out.println("Please enter a temperature in Fahrenheit degrees: ");
        Scanner in = new Scanner(System.in);
        temp = in.nextInt();

        System.out.printf("%d degrees Fahrenheit equals %d degrees celsius", temp, 5 * (temp - 32) / 9);
    }
}
