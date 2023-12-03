import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Untere Grenze eingeben: ");
		int untereGrenze = scan.nextInt();
		System.out.println("Obere Grenze eingeben: ");
		int obereGrenze = scan.nextInt();
		
		int i = untereGrenze;
		
		System.out.println("Untere Grenze: " + untereGrenze);
		System.out.println("Obere Grenze: " + obereGrenze);
		System.out.print("Die Reihe lautet ");
		
		
		while(i <= obereGrenze)
		{
			if (i%3 == 0 || i%4 == 0)
			{
			System.out.print(i + " ");
			}
			i++;
		}
		
		
	}

}