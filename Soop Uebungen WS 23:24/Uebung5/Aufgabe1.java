import java.util.Scanner;
public class Aufgabe1 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int eingabe1 = scan.nextInt();
    	int eingabe2 = scan.nextInt();
        int ergebnis = max(eingabe1, eingabe2);
        System.out.println("Die größere Zahl ist: " + ergebnis);
    }

    public static int max(int pA, int pB) 
    {
        if (pA < pB) {
            return pB;
        } 
        else  
        {
            return pA;
        }
        
    }
}
