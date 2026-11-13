package Math.Random.Math;

public class Pasch {
    public static void main(String[] args) {
        int zahl1 = (int) (Math.random() *6)+1 ;
        System.out.println(zahl1);
        int zahl2 = (int) (Math.random() *6)+1 ;
        System.out.println(zahl2);
        if(zahl1 == zahl2) {
            System.out.println("Pasch!");
        } else {
            System.out.println("Kein Pasch!");
        }
    }
}


