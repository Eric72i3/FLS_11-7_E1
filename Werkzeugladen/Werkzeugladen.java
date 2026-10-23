import java.util.Scanner;

public class Werkzeugladen {
    public static void main(String[] args) {
    int totalPreis = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Willkommen im Werkzeugladen!");
    System.out.println("Wie viele Muttern möchten Sie kaufen?");
    int muttern = scanner.nextInt();
    System.out.println("Wie viele Schrauben möchten Sie kaufen?");
    int schrauben = scanner.nextInt();
    System.out.println("Wie viele Unterlegscheiben möchten Sie kaufen?");
    int unterlegscheiben = scanner.nextInt();
    totalPreis = (muttern * 3) + (schrauben * 5) + (unterlegscheiben * 1);

    if(schrauben > muttern ){
        System.out.println("Überprüfen sie ihre Eingabe da sie Mehr Muttern als Schrauben Haben");
        System.out.println("Sie haben " + muttern + " Muttern und " + schrauben + " Schrauben eingegeben. Sagen sie bitte ob das korrekt ist (ja/nein)");
        String korrekt = scanner.next();
        if(korrekt.equals("nein")) {
            System.out.println("Bitte geben Sie ihre Eingabe erneut ein.");
        }else if(korrekt.equals("ja")) {
         System.out.println("Vielen Dank für Ihren Einkauf! ihr preis ist: " + totalPreis + " cts");
        } else {
            System.out.println("Ungültige Eingabe. Bitte geben Sie 'ja' oder 'nein' ein.");
        }
    } else {
         
        System.out.println("Vielen Dank für Ihren Einkauf! ihr preis ist: " + totalPreis + " cts");
    }
    }
}