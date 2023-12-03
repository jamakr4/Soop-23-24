import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bitte Zahl eingeben ");
		int eingabe = scan.nextInt();

		if (eingabe % 3 == 0) {
			System.out.print("Die Zahl " + eingabe + " ist durch 3 teilbar");
		} else {
			System.out.print("Die Zahl " + eingabe + " ist nicht durch 3 teilbar");
		}
	}
}