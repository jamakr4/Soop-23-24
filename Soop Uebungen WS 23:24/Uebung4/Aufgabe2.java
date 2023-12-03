import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ergebnis=0;
		
			while(ergebnis <= 100)
			{
				int zahl = scan.nextInt();
				ergebnis += zahl;
		}
			System.out.println(ergebnis);
	}

}