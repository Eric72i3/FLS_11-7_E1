package switch_case;
import java.util.Scanner;

public class Schulnoten {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Note ein: ");
        int note = sc.nextInt();
        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Ungültige Note");
        }
        sc.close();
    }
    
}
