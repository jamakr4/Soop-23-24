
import java.util.Scanner;

public class Aufgabe5 
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte untere Intervallgrenze eingeben ");
		int intervall1 = scan.nextInt();
		System.out.print("Bitte obere Intervallgrenze eingeben ");
		int intervall2 = scan.nextInt();
		System.out.print("Bitte Zahl eingeben ");
		int zahl = scan.nextInt();
		
		if (zahl >= intervall1 && zahl <= intervall2)
		{
			System.out.print(zahl + " liegt im Intervall " + intervall1 + " und " + intervall2);
		}
		else 
		{
			System.out.print(zahl + " liegt nicht im Intervall " + intervall1 + " und " + intervall2);	
		}
   }
} 