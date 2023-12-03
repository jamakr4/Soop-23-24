
import java.util.Scanner;

public class Aufgabe4 
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Zahl eingeben ");
		int eingabe1 = scan.nextInt();
		System.out.print("Bitte Zahl eingeben ");
		int eingabe2 = scan.nextInt();
		
		if (eingabe1 % eingabe2 == 0)
		{
			System.out.print(eingabe1 + " ist durch " + eingabe2 + " teilbar" );
		}
		else if (eingabe1 % eingabe2 != 0)
		{
			System.out.print(eingabe1 + " ist nicht durch " + eingabe2 + " teilbar" );
		}
		
   }
}