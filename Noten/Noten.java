package Noten;
public class Noten 
  { 
  public static void main(String[] args) {
    
    int klausur1, klausur2, test1, test2, anzahl; 
    double notenschnitt; 
    klausur1 = 2; 
    klausur2 = 3; 
    test1 = 4; 
    test2 = 2; 
    anzahl = 6; 
    double note;
    notenschnitt = (klausur1*2 + klausur2*2 + test1 +test2)/ (double) anzahl; 
    double rundungk = (double) notenschnitt;
    int rundungok = (int) notenschnitt;
    double kommer =rundungk - rundungok ;
    kommer =  kommer * 100;
    kommer = kommer + 0.5;
    kommer = (int) kommer;
    kommer = kommer / 100;
    
    System.out.println ("Kommastelle = " + kommer);
    System.out.println("Kommastelle = " + kommer);
    System.out.println("1.Klausur: " + klausur1); 
    System.out.println("2.Klausur: " + klausur2); 
    System.out.println("1.Test:           " + test1); 
    System.out.println("2.Test:           " + test2); 
    System.out.println("________________________"); 
    System.out.println("Notenschnitt = " + notenschnitt); 
    notenschnitt = notenschnitt + 0.5;
    note = (int) notenschnitt;
    System.out.println("Rundung = " + note);
    System.out.println("________________________");
    } 
  }