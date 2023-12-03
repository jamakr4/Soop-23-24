
public class Aufgabe6 {

	public static void main(String[] args) {
		
		double[] ausgabeArray = quadrate(4,8,16,64,144);
		
		for (int i = 0; i<ausgabeArray.length; i++) // ausgabeArray ausgeben
		{
		System.out.println(ausgabeArray[i]);
		}

	}

	public static double[] quadrate (int a, int b, int c, int d, int f)
	{
		int[] eingabeArray = {a,b,c,d,f};
		double ausgabeArray[] = new double[eingabeArray.length];
		
		for (int i = 0; i<eingabeArray.length; i++)
		{
			
			ausgabeArray[i] = Math.sqrt(eingabeArray[i]);
		}
		
		return ausgabeArray;
	}
	
}