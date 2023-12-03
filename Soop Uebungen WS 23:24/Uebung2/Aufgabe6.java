import java.util.Scanner;

public class Aufgabe6 
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Zahl eigeben ");
		int eingabe = scan.nextInt();
		
		int tausender = (eingabe / 1000);
		int rest = (eingabe % 1000);
		int hunderter = (rest / 100);
		rest = (rest % 100);
		int zehner = (rest/10);
		int einer = (rest % 10);
		
		if (tausender == 0)
		{
			
		}
		if (tausender == 1)
		{
		 System.out.println("eintausend");	
		}
		if (tausender == 2)
		{
			System.out.println("zweitausend");	
		}
		if (tausender == 3)
		{
			System.out.println("dreitausend");	
		}
		if (tausender == 4)
		{
			System.out.println("viertausend");	
		}
		if (tausender == 5)
		{
			System.out.println("fuenftausend");	
		}
		if (tausender == 6)
		{
			System.out.println("sechstausend");	
		}
		if (tausender == 7)
		{
			System.out.println("siebentausend");	
		}
		if (tausender == 8)
		{
			System.out.println("achttausend");	
		}
		if (tausender == 9)
		{
			System.out.println("neuntausend");	
		}
		
		if (hunderter == 0)
		{
			
		}
		if (hunderter == 1)
		{
		 System.out.println("einhundert");	
		}
		if (hunderter == 2)
		{
			System.out.println("zweihundert");	
		}
		if (hunderter == 3)
		{
			System.out.println("dreihundert");	
		}
		if (hunderter == 4)
		{
			System.out.println("vierhundert");	
		}
		if (hunderter == 5)
		{
			System.out.println("fuenfhundert");	
		}
		if (hunderter == 6)
		{
			System.out.println("sechshundert");	
		}
		if (hunderter == 7)
		{
			System.out.print("siebenhundert");	
		}
		if (hunderter == 8)
		{
			System.out.println("achthundert");	
		}
		if (hunderter == 9)
		{
			System.out.println("neunhundert");	
		}
		
		if (einer == 0)
		{
			
		}
		if (einer == 1)
		{
		 System.out.println("einund");	
		}
		if (einer == 2)
		{
			System.out.println("zweiund");	
		}
		if (einer == 3)
		{
			System.out.println("dreiund");	
		}
		if (einer == 4)
		{
			System.out.println("vierund");	
		}
		if (einer == 5)
		{
			System.out.println("fuenfund");	
		}
		if (einer == 6)
		{
			System.out.println("sechsund");	
		}
		if (einer == 7)
		{
			System.out.print("siebebund");	
		}
		if (einer == 8)
		{
			System.out.println("achtund");	
		}
		if (einer == 9)
		{
			System.out.println("neunund");	
		}
		
		if (zehner == 0)
		{
			
		}
		if (zehner == 1)
		{
		 System.out.println("zehn");	
		}
		if (zehner == 2)
		{
			System.out.println("zwanzig");	
		}
		if (zehner == 3)
		{
			System.out.println("dreissig");	
		}
		if (zehner == 4)
		{
			System.out.println("vierzig");	
		}
		if (zehner == 5)
		{
			System.out.println("fuenfzig");	
		}
		if (zehner == 6)
		{
			System.out.println("sechszig");	
		}
		if (zehner == 7)
		{
			System.out.print("siebzig");	
		}
		if (zehner == 8)
		{
			System.out.println("achtzig");	
		}
		if (zehner == 9)
		{
			System.out.println("neunhzig");	
		}
		if(eingabe == 0)
		{
		System.out.println("Null");
		}
	}
}