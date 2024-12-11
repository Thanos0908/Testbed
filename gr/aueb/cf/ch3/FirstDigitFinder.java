package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο αριστερά ψηφίο
 * ενός ακεραίου.
 */
public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        int firstDigit = 0;

        System.out.println("Enter a positive number: ");
        inputNum = scanner.nextInt();

        tempNum = inputNum;

        while (tempNum >= 10) {
            tempNum /= 10;
        }

        firstDigit = tempNum;

        System.out.printf("The first digit of %d", firstDigit);
    }
}
