import java.util.Scanner;

public class Aufgabe7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int n = scan.nextInt();
		double summe = 0.0;
		int i = 0;
		
		while(i<n)
		{
			i++;
		    summe += 1.0/(2*i)  ;
		}
		
		System.out.println(summe);

	}

}
