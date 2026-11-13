package Mengenrabatt;

import java.util.Scanner;

public class Mengenrabatt {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Bestellmenge ein: ");
        int bestellmenge = scanner.nextInt();

        if (bestellmenge < 0) {
            System.out.println("Die Bestellmenge darf nicht negativ sein.");
            main(args);
            return;
        }

        double rabatt;
        if (bestellmenge >= 500) {
            rabatt = 0.30;
        } else if (bestellmenge >= 200) {
            rabatt = 0.15;
        } else if (bestellmenge >= 100) {
            rabatt = 0.08;
        } else {
            rabatt = 0.0;
        }

        double rechnungsbetrag = bestellmenge * 8.50 * (1 - rabatt);
        System.out.printf("Rechnungsbetrag: %.2f EUR%n", rechnungsbetrag);

    }
}
