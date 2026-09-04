import static java.lang.IO.*;

void main() {
    // Einfache Ausgabe auf der Konsole
    println("Moin! Wie heißt du?");
    
    // Benutzereingabe einlesen
    String name = readln();

    if (name == null || name.isBlank()) {
        println("Keine Eingabe erhalten.");
        return;
    }
    
    // Formatierte Ausgabe mit dem eingegebenen Namen
    println("Hi " + name + ", willkommen in Java 25!");
}
