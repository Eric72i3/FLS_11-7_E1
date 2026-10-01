import java.util.Scanner;

public class Beispiel01 {
    public static void main(String[] args) {
        int kundennummer, anzahl;
        double preis, gesamtpreis;
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie Ihre Kundennummer ein: ");
        kundennummer = sc.nextInt();

        System.out.print("Geben Sie die Anzahl ein: ");
        anzahl = sc.nextInt();

        System.out.print("Geben Sie den Stückpreis ein: ");
        preis = sc.nextDouble();

        gesamtpreis = preis * anzahl;

        if (kundennummer < 100) {
            gesamtpreis = gesamtpreis * 0.95;
        }

        if (anzahl < 20) {
            gesamtpreis = gesamtpreis + 15;
        } else if (anzahl < 50) {
            gesamtpreis = gesamtpreis + 5;
        }

        System.out.printf("Gesamtpreis: %.2f EUR%n", gesamtpreis);
        sc.close();
    }
}
