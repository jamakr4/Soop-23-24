import java.util.Scanner;
public class Aufgabe6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Höhe: ");
		int hoehe = scan.nextInt();
		
		System.out.println("Breite: ");
		int breite = scan.nextInt();
		int i=0;
		
		System.out.println("*".repeat(breite));
		
		while (i<hoehe-2)
		{
			System.out.println("*"+ " ".repeat(breite-2) + "*");
			i++;
		}
		
		System.out.println("*".repeat(breite));
	}
	

}