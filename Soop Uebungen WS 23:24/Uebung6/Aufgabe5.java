
public class Aufgabe5 {

	public static void main(String[] args) {
		int[] eingabeArray = {1,2,3,4,5};
		doppel(eingabeArray);
	}
public static void doppel(int[]eingabeArray)
{
	
	int ausgabeArray[] = new int[eingabeArray.length];
	
	for (int i = 0; i<eingabeArray.length; i++) // eingabeArray Werte x2 in ausgabeArray schreiben
	{
		ausgabeArray[i] = eingabeArray[i] * 2;
		
	}
	
	
	for (int i = 0; i<ausgabeArray.length; i++) // ausgabeArray ausgeben
	{
	System.out.println(ausgabeArray[i]);
	}
  }

}