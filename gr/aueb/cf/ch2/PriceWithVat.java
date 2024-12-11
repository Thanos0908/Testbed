package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat.
 */
public class PriceWithVat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double VAT = 0.24;
        double finalPrice = 0;
        double price = 0;
        double vat = 0;

        System.out.println("Please give the price: ");
        price = sc.nextDouble();
        vat = price * VAT;
        finalPrice = price + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with Vat: %.2f", price, vat, finalPrice);
    }
}
