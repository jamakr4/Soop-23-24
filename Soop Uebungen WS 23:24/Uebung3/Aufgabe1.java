import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie drei Zahlen ein: ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int g = 0;
        int m = 0;
        int k = 0;
        
        System.out.println(a + " "+ b + " "+  c);
        
        if(a>b && a>c) // Finden größter Wert
        {
         g = a;	
        }
        else if (b>a && b>c)
        {
         g=b;
        }
        else if (c>a && c>b)
        {
         g=c;
        }
        
        
        if(b>a && c>a ) // Finden kleinster Wert
        {
         k = a;	
        }
        else if (a>b && c>b)
        {
         k=b;
        }
        else if (a>c && b>c)
        {
         k=c;
        } 
        
        
        if ((g==a || g==b) && (k==a || k==b)) // Finden mittlerer Wert
        {
         m = c;	
        	}
        else if ((g==a || g==c) && (k==a || k==c))
        {
        m=b;
        }
	
        else if ((g==c || g==b) && (k==c || k==b))
	   {
	   m = a;	
       }
              
        System.out.println("Die Reihenfolge lautet: " + g + " " + m + " " + k);

 }
}