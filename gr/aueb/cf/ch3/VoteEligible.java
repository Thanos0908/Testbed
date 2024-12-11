package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18.
 * Ελέγχει εάν μία ηλικία έχει δικαίωμα να ψηφήσει.
 */
public class VoteEligible {

    public static void main(String[] args) {
        final int vottingAge = 18;
        boolean isEligible = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter age: ");
        int age = in.nextInt();

        isEligible = age > vottingAge;

        System.out.printf("%d is eligible to vote: %b", age, isEligible);

    }
}
