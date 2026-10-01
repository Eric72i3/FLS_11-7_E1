import java.util.Scanner;

public class Werkzeugladen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anzahl Schrauben: ");
        int schrauben = sc.nextInt();

        System.out.print("Anzahl Muttern: ");
        int muttern = sc.nextInt();

        System.out.print("Anzahl Unterlegscheiben: ");
        int unterlegscheiben = sc.nextInt();

        int gesamtbetragCent = (schrauben * 5) + (muttern * 3) + unterlegscheiben;

        if (schrauben > muttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung!");
        } else {
            System.out.println("Die Bestellung ist okay.");
        }

        System.out.printf("Gesamtbetrag: %d Cent (%.2f EUR)%n", gesamtbetragCent, gesamtbetragCent / 100.0);
        sc.close();
    }
}
