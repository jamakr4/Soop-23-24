
public class Aufgabe04 {

    public static String convertMillisec(long ms) {
    	long stunden = ms/3600000;
    	long minuten = (ms % 3600000) / 60000;
    	long millisek = (ms % 60000)/1000;
    	
    	String ausgabe = String.format("%02d:%02d:%02d", stunden, minuten, millisek);
    	return ausgabe;
    }

    public static void main(String[] args) {
    	
    }
}