package Test;
import java.util.Scanner;
import static java.lang.IO.*;

public class Arbeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double april;
        double mai;
        double juni;
        System.out.println("Geben Sie den Wert für April ein: ");
        april = sc.nextDouble();
        System.out.println("Geben Sie den Wert für Mai ein: ");
        mai = sc.nextDouble();
        System.out.println("Geben Sie den Wert für Juni ein: ");
        juni = sc.nextDouble();
        double durchschnitt = (april + mai + juni) / 3;
        durchschnitt = (int) (durchschnitt * 100 + 0.5) / 100.0;
        System.out.println("Niederschlag");
        System.out.println("April: " + april);
        System.out.println("Mai: " + mai);
        System.out.println("Juni: " + juni);
        System.out.println("Durchschnitt: " + durchschnitt);
        sc.close();
    }
}