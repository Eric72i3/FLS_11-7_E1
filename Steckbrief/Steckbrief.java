package Steckbrief;
import java.util.Scanner;

public class Steckbrief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alter = 0;
        char geschlecht = 'M';
        String name = "";

        System.out.println("Geben Sie den Wert für alter ein");
        alter = sc.nextInt();
        System.out.println("Geben Sie den Wert für geschlecht ein");
        geschlecht = sc.next().charAt(0);
        System.out.println("Geben Sie den Wert für name ein");
        name = sc.next();

        System.out.println("Steckbrief:");
        System.out.println("Alter: " + alter);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Name: " + name);

        sc.close();
    }

    
}
