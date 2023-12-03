public class Aufgabe4 {

	public static void main(String[] args) {
		int[] zahlen = {1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6, 7, 9};
		
		viererfolge(zahlen);
		

	}

	public static boolean viererfolge(int[] zahlen)
	{
		for (int i = 0; i<zahlen.length-3; i++)
		{
			if (zahlen[i] == zahlen[i+1] && zahlen[i] == zahlen[i+2] && zahlen[i] == zahlen[i+3] && zahlen[i] == zahlen[i+4])
			{
				System.out.println(true);
				return true;
			}
			
		}
		return false;
		
	}
	
}