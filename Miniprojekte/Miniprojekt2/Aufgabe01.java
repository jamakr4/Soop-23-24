import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die Höhe des Dreiecks an: ");
        int h = scan.nextInt();   

        if (h<10) // Für Pyramiden unter 10, da andere Regeln für kleine Pyramiden gelten
        {
        
        
        double d = 0; // Muster bestehenden aus zahlen und Sternchen und plus Zeichen pro 1x Hoehe +0,5 
        int e = 0;
        while (e < h) 
        {
            d = d + 0.5;
            e++;
        }
        d = d + 0.5;
        d = d * h;
 
        
        int a = 1;
        int i = 0;
        int umbruch = 1;
        int einrueckung = (h - 1) * 2; // Leerzeichen werden ab erster Zeile weniger (-2 pro Zeile)

        while (i < d) // Soweit wie die pyramide hoch ist werden die Zeilen ausgegeben 
        {
            for (int k = 0; k < einrueckung; k++) // Schleife für die Einrückung mit leerzeichen
            {
                System.out.print(" ");
            }

            int j = 0; // Muss vor jedem neuen Durchlauf resetet werden
            while (j < umbruch && i < d) // Schleife für die Zeilen Umbrüche
            {
                if (i + 1 >= 10) // Für die Zaheln zwischen 1 - 9
                {
                    System.out.print("+" + (i + 1) + "*");
                } 
                else // für die Zaheln 10...
                {
                    System.out.print("++" + (i + 1) + "*");
                }
                i++;
                j++;
            }

            System.out.println(); // Zeilenumbruch
            a = a + umbruch;
            umbruch++;
            einrueckung -= 2; 
        }
    }
        
        else if (h>=10) // Das selbe wie oben nur für Pyramiden ab der Höhe 10, da dort andere Regeln gelten
        {
        	double d = 0;
            int e = 0;
            while (e < h) {
                d = d + 0.5;
                e++;
            }
            d = d + 0.5;
            d = d * h;
            
            int a = 1;
            int i = 0;
            int umbruch = 1;
            int einrueckung = (h - 1) * 3; 

            while (i < d) 
            {
                for (int k = 0; k < einrueckung; k++) {
                    System.out.print(" ");
                }

                int j = 0;
                while (j < umbruch && i < d) {
                    if (i + 1 <= 9) {
                        System.out.print("+++" + (i + 1) + "**");
                    } else if (i + 1 <= 99) {
                        System.out.print("++" + (i + 1) + "**");
                    } else {
                        System.out.print("++" + (i + 1) + "*");
                    }
                    i++;
                    j++;
                }

                System.out.println();
                a = a + umbruch;
                umbruch++;
                einrueckung -= 3;        
                }
        }
}
}