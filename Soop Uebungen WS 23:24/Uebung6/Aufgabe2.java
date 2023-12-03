
public class Aufgabe2 {

	public static void main(String[] args) {
		double[] nst = nullstellen(1, 2, 1);
		
		for (int i = 0; i < nst.length; i++)
		{
			System.out.println(nst[i]);
		}

	}

	public static double[] nullstellen(double a, double b, double c) // Array Typ Double returnen
	{
double diskriminante = (b * b) - (4 * a * c);
		
		if (diskriminante > 0 ) // 2 NS
		{
			double Ns1 = ((-1)*b + Math.sqrt(b*b - 4*a*c))/(2*a);  
		    double Ns2 = ((-1)*b - Math.sqrt(b*b - 4*a*c))/(2*a);
			
		    double[] nst = new double [2];
		    nst[0] = Ns1;
		    nst[1] = Ns2;
		    
		    return nst;
		}
		
		else if (diskriminante == 0) // 1NS
		{
			double Ns1 = ((-1)*b + Math.sqrt(b*b - 4*a*c))/(2*a);
			
			double[] nst = new double [1];
		    nst[0] = Ns1;
			 return nst;
		}
		
		else // Keine NS
		{
			double[] nst = new double [0];
			return nst;
		}
		
	}
	
}
