package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει έναν αριθμό
 * και το σύστημα επιστρέφει το άθροισμα
 * όλων των άρτιων μέχρι αυτόν τον αριθμό.
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;
        boolean nextNum = false;

        System.out.println("Insert a number: ");
        inputNum = scanner.nextInt();

        //  sum??
        while (i <= inputNum) {
            sum += i;
            i += 2;
        }


        System.out.printf("The sum of even numbers up to %d is %d", inputNum, sum);
    }
}
