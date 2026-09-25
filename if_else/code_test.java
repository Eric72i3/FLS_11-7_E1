package if_else;

import java.util.Scanner;
public class code_test {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Geben Sie eine Zahl ein: ");
        int zahl = sc.nextInt();
        if (zahl == 12345678)
        {
            IO.println("Die Zahl ist richtig");
        }
        else
        {
            IO.println("Die Zahl ist falsch");
        }
        sc.close();

}
}