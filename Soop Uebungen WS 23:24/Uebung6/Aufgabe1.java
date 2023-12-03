import java.util.Scanner;
public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie a, b, c ein ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double diskriminante = (b * b) - (4 * a * c);
		
		if (diskriminante > 0 ) // 2 NS
		{
			double Ns1 = ((-1)*b + Math.sqrt(b*b - 4*a*c))/(2*a);  
		    double Ns2 = ((-1)*b - Math.sqrt(b*b - 4*a*c))/(2*a);
			
			System.out.println("Die Nullstellen sind " + Ns1 + " " + Ns2);
		}
		
		else if (diskriminante == 0) // 1NS
		{
			double Ns1 = ((-1)*b + Math.sqrt(b*b - 4*a*c))/(2*a);
			
			System.out.println("Die Nullstelle ist " + Ns1);
		}
		
		else 
		{
			System.out.println("Es gibt keine Nullstellen ");
		}

	}

}
