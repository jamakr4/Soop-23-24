
public class Aufgabe8 {

	public static void main(String[] args) {
		long ergebnis[] = primfaktoren(42);
		
		for (int i=0; i<ergebnis.length; i++)
		{
			if (ergebnis[i] != 0) // 0 ist kein Prim Faktor
			{	
			System.out.print(ergebnis[i] + ", " );
			}
		}

	}
   
	public static long[] primfaktoren(long x)
	{
		
		int l = (int) x; // Maximale Länge Array
		int zaehler = 2; // Algorhytmus Zähler
		int a = 0; // Array Zähler
		long ergebnis[] = new long[l];
		
		while (x>1) 
		{
			
		if (x%zaehler == 0)
			{
			x = x/zaehler;
			
			ergebnis[a] = zaehler;
			a++;
			
			}
		else
		{
			zaehler ++;
			
		}
		
	}
		return ergebnis;
	}
}