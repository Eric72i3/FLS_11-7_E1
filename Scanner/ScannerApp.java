package Scanner;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rechnung;
        double ergebnis;
        boolean laufen = true;
        for (laufen=true; laufen;
        ) {
        System.out.println("Geben Sie ein Welche rechnung sie haben wollen: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");      
        rechnung = sc.nextLine();
        System.out.println("Geben Sie die erste Zahl ein: ");
        double A = sc.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double B = sc.nextDouble();
        switch (rechnung) 
        {
        case "1":
            ergebnis = A + B;
            System.out.println("Ergebnis: " + ergebnis);
            break;
        case "2":
            ergebnis = A - B;
            System.out.println("Ergebnis: " + ergebnis);
            break;
        case "3":
            ergebnis = A * B;
            System.out.println("Ergebnis: " + ergebnis);
            break;
        default:
            System.out.println("Ungültige Eingabe");
        break;
        IO.println("Wollen sie eine weitere Rechnung machen? (ja/nein)"); 
         
        }
        }
        sc.close();
        IO.println("Programm beendet.");
        


 
        
    }
}
