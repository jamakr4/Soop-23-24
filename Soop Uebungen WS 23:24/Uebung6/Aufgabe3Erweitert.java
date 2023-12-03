
public class Aufgabe3Erweitert {

	public static void main(String[] args) {
        int n = 4; // Anzahl der Stellen im Muster
        generatePattern(n);
    }

    public static void generatePattern(int n) 
    {
        for (int i = 0; i < Math.pow(2, n); i++) 
        {
            String binary = Integer.toBinaryString(i);
            
            while (binary.length() < n) 
            {
                binary = "0" + binary;
            }
            System.out.println(binary);
        }
    }
}