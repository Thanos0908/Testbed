package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateFormatExcersice {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter day, month, year: ");
        Scanner in = new Scanner(System.in);
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        year = year % 1000;
        year = year % 100;

        System.out.printf("%02d/%02d/%02d", day, month, year);

    }
}
