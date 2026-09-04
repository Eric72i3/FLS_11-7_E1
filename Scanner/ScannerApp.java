package Scanner;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rechnung;
        double ergebnis;
        System.out.println("Geben Sie ein Welche rechnung sie haben wollen: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");      
        rechnung = sc.nextLine();        ;
        System.out.println("Geben Sie die erste Zahl ein: ");
        double A = sc.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double B = sc.nextDouble();
        if(rechnung.equals("1")) {
            ergebnis = A + B;
            System.out.println("Ergebnis: " + ergebnis);
        } else if(rechnung.equals("2")) {
            ergebnis = A - B;
            System.out.println("Ergebnis: " + ergebnis);
        } else if(rechnung.equals("3")) {
            ergebnis = A * B;
            System.out.println("Ergebnis: " + ergebnis);
        } else {
            System.out.println("Ungültige Eingabe");
        }
        sc.close();


 
        
    }
}
