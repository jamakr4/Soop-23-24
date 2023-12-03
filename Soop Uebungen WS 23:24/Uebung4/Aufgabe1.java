import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte positive Ganzzahl eingeben");
		int zahl = scan.nextInt();
		int i =0;
		int ergebnis=0;
		
		if (zahl < 0)
		{
			System.out.println("Das ist keine positive Ganzzahl");
		}
		else 
		{
			while(i <= zahl)
			{
			
				ergebnis += i;
				i++;
			}
			System.out.println(ergebnis);
		}

	}

}