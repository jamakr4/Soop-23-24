
import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Zahl eingeben ");
		Double eingabe = scan.nextDouble();
		
		Double r = ((int) (eingabe*100 + 0.5)/100.0);
		
		System.out.println(r);
	}

}