import java.util.Scanner;

public class Aufagbe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie a, b, c ein: ");
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
       
       double Ns1 = ((-1)*b + Math.sqrt(b*b - 4*a*c))/(2*a);
       
       double Ns2 = ((-1)*b - Math.sqrt(b*b - 4*a*c))/(2*a);

       
       
       if(Double.isNaN(Ns1) && Double.isFinite(Ns2))
       {
       System.out.println("Die Nullstellen liegt bei " + Ns2);       
       }
       
       else if(Double.isNaN(Ns2) && Double.isFinite(Ns1))
       {
       System.out.println("Die Nullstellen liegt bei " + Ns1);       
       }
       else if(Double.isNaN(Ns1) && Double.isNaN(Ns2))
       {
       System.out.println("Die Gleichung hat keine reellen Nullstellen");
       }
       else if (Double.isFinite(Ns1) && Double.isFinite(Ns2))
       {
       System.out.println("Die Nullstellen liegen bei " + Ns1 + " und " + Ns2);   
       }
}
} 