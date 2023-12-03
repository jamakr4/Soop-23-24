import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Name Person 1: "); //Eingabe Daten Person 1
        String eingabe1Name =scan.nextLine();
        
        System.out.println("Vorname Person 1: ");
        String eingabe1Vorname =scan.nextLine();
        
        System.out.println("Geburtstag Person 1: ");
        String eingabe1Geburtsdatum =scan.nextLine();
        
        System.out.println("Geschlecht Person 1: ");
        String eingabe1Geschlecht =scan.nextLine();
        
        System.out.println("Guthaben Person 1: ");
        String eingabe1Guthaben =scan.nextLine();
		
        
        System.out.println("Name Person 2: "); // Eingabe Daten Person 2
        String eingabe2Name =scan.nextLine();
        
        System.out.println("Vorname Person 2: ");
        String eingabe2Vorname =scan.nextLine();
        
        System.out.println("Geburtsdatum Person 2: ");
        String eingabe2Geburtsdatum =scan.nextLine();
        
        System.out.println("Geschlecht Person 2: ");
        String eingabe2Geschlecht =scan.nextLine();
        
        System.out.println("Guthabe Person 2: ");
        String eingabe2Guthaben =scan.nextLine();
        
        System.out.printf("%-7s %-16s %-14s %-12s %8s%n", "Person", "Name", "Geburtsdatum", "Geschlecht", "Guthaben"); // Formatierte Ausgabe
        System.out.println("--------------------------------------------------------------");

        System.out.printf("%4s    %-16s %-14s %-12s %8s%n", 1, eingabe1Name + " " + eingabe1Vorname, eingabe1Geburtsdatum, eingabe1Geschlecht, eingabe1Guthaben);
        System.out.printf("%4s    %-16s %-14s %-12s %8s%n", 2, eingabe2Name + " " + eingabe2Vorname, eingabe2Geburtsdatum, eingabe2Geschlecht, eingabe2Guthaben);
       
        // % steht für den Beginn einer Formatierungsanweisung
        //- sagt das die Formatierung linksbündig ist, ohne - wäre sie rechtsbündig
        // 16 steht für die Breite des Feldes
        // s steht für String
        // erst Formatierung definieren dann Variablen dahinter
	
	}









	
	
}
