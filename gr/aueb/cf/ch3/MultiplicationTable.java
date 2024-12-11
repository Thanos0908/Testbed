package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;
        final int MAX_MULTIPLIER = 10;

        System.out.println("Enter an integer: ");
        inputNum = scanner.nextInt();

        while (i <= MAX_MULTIPLIER) {
            System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
            i++;
        }
    }
}
