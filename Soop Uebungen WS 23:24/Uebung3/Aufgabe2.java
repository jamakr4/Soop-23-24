import java.util.Scanner;
public class Aufgabe2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bitte Zahl eingeben ");
		int eingabe = scan.nextInt();
		int endung = eingabe;
		
		while(endung >10)
		{
		endung = (endung -10);
	}
		
 switch(endung)
 {
 case 0:
	 System.out.println(eingabe + " endet auf null");
	 break;
 case 1:
	 System.out.println(eingabe + " endet auf eins");
	 break; 
 case 2:
	 System.out.println(eingabe + " endet auf zwei");
	 break;
 case 3:
	 System.out.println(eingabe + " endet auf drei");
	 break;
 case 4:
	 System.out.println(eingabe + " endet auf vier");
	 break;
 case 5:
	 System.out.println(eingabe + " endet auf fuenf");
	 break;
 case 6:
	 System.out.println(eingabe + " endet auf sechs");
	 break;
 case 7:
	 System.out.println(eingabe + " endet auf sieben");
	 break;
 case 8:
	 System.out.println(eingabe + " endet auf acht");
	 break;
 case 9:
	 System.out.println(eingabe + " endet auf neun");
	 break;
 }
 }
}