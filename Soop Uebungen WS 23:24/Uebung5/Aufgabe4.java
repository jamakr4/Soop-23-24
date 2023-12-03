import java.util.Scanner;
public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int eingabe = scan.nextInt();
		int ergebnis = gauss(eingabe);
		System.out.println(ergebnis);

	}
	public static int gauss(int n)
	{
		
		int ergebnis = n*(n+1)/2;
		return ergebnis;
	}
}