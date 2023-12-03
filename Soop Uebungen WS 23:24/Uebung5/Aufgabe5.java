import java.util.Scanner;

public class Aufgabe5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eingabe = scan.nextInt();
        int ergebnis = zaehlRueckwaerts(eingabe);
        System.out.println(ergebnis);
    }

    public static int zaehlRueckwaerts(int pE) {
        int ausgabe = 0;

        while (pE > 0) {
            int letzteZiffer = pE % 10; // letzte Ziffer erhalten
           ausgabe = ausgabe * 10 + letzteZiffer; // Ziffern umkehren
            pE /= 10; // letzte Ziffer entfernen
        }

        return ausgabe;
    }

}