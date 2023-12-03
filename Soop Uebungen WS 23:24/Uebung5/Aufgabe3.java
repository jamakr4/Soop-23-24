import java.util.Scanner;
public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ergebnis = quersumme(n);
		System.out.println(ergebnis);
	}

	
	public static int quersumme (int pN)
	{
		
		String laenge = String.valueOf(pN); // Anzahl der Ziffern bestimmen für die Laufzeit der Schleife
		int l = laenge.length();
		
		int i= 0; // Schleifen Zähler 
		int quersumme = 0;
		int ausgabe =0;
		while (i<l)
		{
			quersumme = pN%10; // letzte Zahl bestimmen 
		    ausgabe += quersumme;//letzte Zahl addieren auf Ausgabe
		    pN=pN/10; // letzte Zahl entfernen
			i++; 
		}
		return ausgabe;
	}
}