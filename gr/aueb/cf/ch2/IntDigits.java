package gr.aueb.cf.ch2;

/**
 * Βρίσκει τα ψηφία ενός διψήφιου αριθμού
 * και τα προσθέτει.
 */
public class IntDigits {

    public static void main(String[] args) {
        int num = 19;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        leftDigit = num / 10;
        rightDigit = num% 10;

        sum = leftDigit + rightDigit;

        System.out.printf("Leftdigit: %d, Rightdigit: %d, Sum: %d", leftDigit, rightDigit, sum);
    }
}
