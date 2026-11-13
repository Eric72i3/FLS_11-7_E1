package Math.Random.Math;

public class Random {
    public static void main(String[] args) {
        int zahl2 = (int) (Math.random() *6)+1 ;
        System.out.println(zahl2);
        if(zahl2 == 6) {
            System.out.println("Gewonnen!");
        } else {
            System.out.println("Verloren!");
        }
    }
}
