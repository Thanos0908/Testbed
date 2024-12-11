package gr.aueb.cf.ch3;

/**
 * Calculate the sum and mul of
 * first 10 integers.
 */
public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("The sum is : " + sum + " and the mul is " + mul);
    }
}
