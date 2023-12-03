
public class Aufgabe7 {

	public static void main(String[] args) {
		istPrim(1);

	}

	public static boolean istPrim(long x)
	{
		int zaehler = 2;
		boolean status = true;
		
		if (x<2)
		{
		  return true; // 1 wäre eine Primzahl	
		}
		
		while(zaehler<x)
		{
			if(x%zaehler == 0)
			{
				return false;
			}
			else
			{
			zaehler++;
			}
		}
		return status;
	}
	
}