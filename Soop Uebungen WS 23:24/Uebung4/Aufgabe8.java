import java.util.Scanner;

public class Aufgabe8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double epsilon; // Fehler
        double piReihe = 4.0; // 4, weil Reihe * 4
        double piAlt = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9);
        boolean status = false; // Als nächstes plus oder minus
        int i = 3; // startet bei 3, weil 1/1 = 1 // i=Nenner der Leibnizreihe

        System.out.print("Bitte geben Sie den maximalen Fehler (ε) ein: ");
        epsilon = scanner.nextDouble();

        while (Math.abs(piReihe - piAlt) > epsilon) //Betrag bilden aus Näherung durch Schleife-Pi gegeben 
        {
            if (status == false) // Minus
            {
                piAlt = piReihe; // Aktualisiere die vorherige Näherung mit der neuen 
                piReihe -= 4.0 / i; // 4 weil 4*1 = 4 / i
                status = true; // beim nächsten Durlauf plus
            } 
            else if (status == true) // Plus
            {
                piAlt = piReihe; // Aktualisiere die vorherige Näherung mit der neuen
                piReihe += 4.0 / i; // 4 weil 4*1 = 4 / i
                status = false; // beim nächsten Durchlauf minus 
            }

            i += 2; // Nenner bei jedem neuen Durchlauf der Leibnizreihe +2

        System.out.println(piReihe);

    }
  }
}