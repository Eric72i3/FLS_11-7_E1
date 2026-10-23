package if_else;
import java.util.Scanner;

public class Volljährigkeit {
    public static void main(String[] args) {
        int alter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Alter ein: ");
        alter = scanner.nextInt();
        if (alter >= 18) {
            System.out.println("Du bist volljährig.");
        } else {
            System.out.println("Du bist minderjährig.");
        }
        scanner.close();
    }
}
