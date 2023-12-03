import java.util.Scanner;
public class Aufgabe6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double eingabe1 = scan.nextDouble();
		double eingabe2 = scan.nextDouble();
		double eingabe3 = scan.nextDouble();
		double eingabe4 = scan.nextDouble();
		
		double abstand = abstand(eingabe1, eingabe2, eingabe3, eingabe4);
		System.out.println(abstand);

	}
	public static double abstand(double x1, double y1, double x2, double y2)
	{
		double abstand = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1) * (y2-y1)));
		return abstand;
	}
}
