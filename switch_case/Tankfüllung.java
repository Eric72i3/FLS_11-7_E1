package switch_case;

import java.util.Scanner;

public class Tankfüllung {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was sollen sie tanken? S D oder N");
        String tanken = sc.nextLine();
        System.out.println("Wie viel Liter wollen sie tanken?");
        int liter = sc.nextInt();
        switch (tanken) {
            case "S":
                double preisS = liter * 1.99;
                System.out.println("Sie haben " + liter + " Liter Super getankt. Das kostet: " + preisS + " Euro");
                break;
            case "D":
                double preisD = liter * 2.05;
                System.out.println("Sie haben " + liter + " Liter Diesel getankt. Das kostet: " + preisD + " Euro");
                break;
            case "N":
                double preisN = liter * 1.90;
                System.out.println("Sie haben " + liter + " Liter Normal getankt. Das kostet: " + preisN + " Euro");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }
                sc.close();
        }
    }

