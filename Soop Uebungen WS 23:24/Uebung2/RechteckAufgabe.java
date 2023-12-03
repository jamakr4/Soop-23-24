import java.util.Scanner;

public class RechteckAufgabe 
{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bitte Laenge eingeben ");
		int laenge = scan.nextInt();
		System.out.print("Bitte Breite eingeben ");
        int breite = scan.nextInt();

		int umfang = (2*breite + 2*laenge);
		int flaeche = (breite* laenge);

	System.out.println("Fuer die eigebenen Parameter Laenge = " + laenge + " und Breite = " + breite + 
			" betraegt der Umfang " + umfang + " LE und der Flaecheninhalt beträgt " + flaeche + " FE");

	}
}