package if_else;

import java.util.Scanner;

public class Kleinste_Zahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein: ");
        int zahl1 = sc.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        int zahl2 = sc.nextInt();
        System.out.println("Geben Sie die dritte Zahl ein: ");
        int zahl3 = sc.nextInt();
        if (zahl1 <= zahl2 && zahl1 <= zahl3) {
            System.out.println("Die kleinste Zahl ist: " + zahl1);
        } else if (zahl2 <= zahl1 && zahl2 <= zahl3) {
            System.out.println("Die kleinste Zahl ist: " + zahl2);
        } else {
            System.out.println("Die kleinste Zahl ist: " + zahl3);
        }
    }
}
