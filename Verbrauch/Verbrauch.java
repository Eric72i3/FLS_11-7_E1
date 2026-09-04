package Verbrauch;
import java.util.Scanner;

public class Verbrauch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Gib die gefahrenen Kilometer ein: ");
        double kilometer = scanner.nextDouble();
        
        System.out.print("Gib den verbrauchten Kraftstoff ein: ");
        double kraftstoff = scanner.nextDouble();
        
  
        if (kilometer != 0) {
            double verbrauch = (kraftstoff / kilometer) * 100;
            
            System.out.println("\nDurchschnittsverbrauch: " + verbrauch + " Liter pro 100 km");
        } else {
            System.out.println("\nFEHLER: Kann keinen Verbrauch berechnen, wenn Sie 0 Kilometer gefahren sind!");
        }
        
        scanner.close();
    }
}