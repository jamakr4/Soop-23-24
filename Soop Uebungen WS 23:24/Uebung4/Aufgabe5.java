import java.util.Scanner;
public class Aufgabe5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Höhe: ");
		int hoehe = scan.nextInt();
		
		System.out.println("Breite: ");
		int breite = scan.nextInt();
		int i=0;
		
		while (i<hoehe)
		{
			System.out.println("*".repeat(breite));
			i++;
		}
	}
	

}