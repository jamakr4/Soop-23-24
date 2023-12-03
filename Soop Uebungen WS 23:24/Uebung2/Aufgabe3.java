import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Zahl eingeben ");
		int eingabe1 = scan.nextInt();
		System.out.print("Bitte Zahl eingeben ");
		int eingabe2 = scan.nextInt();

		if (eingabe1 < eingabe2) 
		{
			System.out.print(eingabe1 + " ist kleiner als " + eingabe2);
		} 
		else if (eingabe1 > eingabe2) 
		{
			System.out.print(eingabe1 + " ist groeßer als " + eingabe2);
		} 
		else if (eingabe1 == eingabe2) 
		{
			System.out.print(eingabe1 + " ist gleich " + eingabe2);
		}
	}
}