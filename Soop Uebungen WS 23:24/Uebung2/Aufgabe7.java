
import java.util.Scanner;

public class Aufgabe7 
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Programm auswählen: ");
	    System.out.println(" 0 berechnet Geschwindigkeit aus Weg und Zeit, ");
		System.out.println(" 1 berechnet Kraft aus Masse und Beschleunigung, ");
		System.out.println(" 2 berechnet  Widerstand aus Spannung und Stromstärke");
		System.out.println(" 3 berechnet Leistung aus Spannung und Stromstärke");
		int auswahl = scan.nextInt();
		
		if(auswahl == 0)
		{
			System.out.print("Sie haben das Programm zur Berechnung von Geschwindigkeit aus Weg und Zeit gewählt");
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println(" Bitte Wert für Weg  eingeben ");
			int strecke = scan.nextInt();
			System.out.println(" Bitte Wert für Beschleunigung in Meter pro Sekunde eigeben ");
			int zeit = scan.nextInt();
			double geschwindigkeit = (strecke/zeit);
			System.out.println(" Die Geschwindigkeit aus der Strecke " + strecke + " in Metern und " + zeit + " in Sekunde beträgt " + geschwindigkeit  + " Meter pro Sekunde");
		}
		
		if(auswahl == 1)
		{
			System.out.print("Sie haben das Programm zur Berechnung von Kraft in Newton aus Masse in KG und Beschleunigung in Meter pro Sekunde gewählt");
			Scanner scan2 = new Scanner(System.in);
			
			System.out.println(" Bitte Wert für Masse in KG eingeben ");
			int masse = scan.nextInt();
			System.out.println(" Bitte Wert für Beschleunigung in Meter pro Sekunde eigeben ");
			int beschleunigung = scan.nextInt();
			
			int kraft = (masse * beschleunigung);
			System.out.println(" Die Kraft aus Masse " + masse + " Kg und " + beschleunigung + " Meter pro Sekunde beträgt " + kraft + " in Newton");
		}
		
		if(auswahl == 2)
		{
			System.out.print("Sie haben das Programm zur Berechnung von Wiederstand in Ohm aus Spannung in Volt und Stromstärke in Ampere gewählt");
			Scanner scan3 = new Scanner(System.in);
			
			System.out.println(" Bitte Wert für Spannung in Volt eingeben ");
			int spannung = scan.nextInt();
			System.out.println(" Bitte Wert für Stromstaerke in Ampere eigeben ");
			int stromstaerke = scan.nextInt();
			
			int wiederstand = (spannung/stromstaerke);
			System.out.println(" Der Wiederstand aus Spannung " + spannung + " Volt und " + stromstaerke + " in Ampere beträgt " + wiederstand + " in Ohm");
		}
		
		if(auswahl == 3)
		{
			System.out.print("Sie haben das Programm zur Berechnung von Leistung in Watt aus Spannung in Volt und Stromstärke in Ampere gewählt");
			Scanner scan4 = new Scanner(System.in);
			
			System.out.println(" Bitte Wert für Spannung in Volt eingeben ");
			int spannung = scan.nextInt();
			System.out.println(" Bitte Wert für Stromstaerke in Ampere eigeben ");
			int stromstaerke = scan.nextInt();
			
			int leistung = (spannung*stromstaerke);
			System.out.println(" Die Leistung aus der  Spannung " + spannung + " in Volt und der " + stromstaerke + " in Ampere beträgt " + leistung + " in Watt");
		}
	}
}