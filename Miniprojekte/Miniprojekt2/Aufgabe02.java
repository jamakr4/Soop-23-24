import java.util.Scanner; 
public class Aufgabe02 {
     public static int summe(int n) {
         
         String test = String.valueOf(n); // Konvertiere von int zu String
         int laenge = test.length(); // Laenge der Zahl bestimmen 
         int summe = 0;
 
         for (int i = 1; i < laenge - 1; i++) // laenge -1, weil 
         {
             summe += Integer.parseInt(test.substring(i, i + 1)); // Wandelt i-te Stelle vom String zu Int um und erhöt die i-te Stelle um 1
         }
 
         return summe;
     }
 
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
 
         System.out.println("Zahl eingeben: ");
         int zahl = scan.nextInt();
 
         int sum = summe(zahl);
 
         System.out.println("Die Summe der Eingabe unter der Bedingung das die 1. und letzte Stelle ignoriert werden lautet " + sum);
     }
 }