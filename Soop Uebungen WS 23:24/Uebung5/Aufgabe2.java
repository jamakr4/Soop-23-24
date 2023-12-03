import java.util.Scanner;
public class Aufgabe2 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int eingabe1 = scan.nextInt();
    	int eingabe2 = scan.nextInt();
    	boolean eingabe3 = scan.nextBoolean();
        int ergebnis = minmax(eingabe1, eingabe2, eingabe3);
        System.out.println(ergebnis);
    }

    public static int minmax(int pA, int pB, boolean pMax) 
    {
        if (pMax) //größere returnen
        { 
            if (pA < pB) 
            {
                return pB;
            } 
            else 
            {
                return pA;
            }
        } 
        else // kleinere returnen
        {
            if (pA < pB) {
                return pA;
            } 
            else 
            {
                return pB;
            }
        }
    }
}
