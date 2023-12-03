public class Aufgabe03 {

    public static boolean isValidTransaction(double credit, double transaction) {

    	if ((credit - transaction) >= 0)
    	{
    	
    	return true;
    	}
    	else  
    	{
    		return false;
    	}
    }

    public static String recommendation(String type) {

    	if (type.equals ("Vegetarisch"))
    	{
    		return "Salatbar";
    	}
    	else if (type.equals ("Low Carb"))
    	{
    		return "Menü 2";
    	}
    	else if (type.equals ("Kleiner Hunger"))
    	{
    		return "Menü 1";
    	}
    	else if (type.equals ("Hunger"))
    	{
    		return "Grill";
    	}
   	
    	return "Fehler";
    }

    public static double price(String menu) {

    	if (menu.equals ("Salatbar"))
    	{
    		return 2.5;
    	}
    	else if (menu.equals ("Menü 1"))
    	{
    		return 1.0;
    	}
    	else if (menu.equals ("Menü 2"))
    	{
    		return 1.2;
    	}
    	else if (menu.equals ("Grill"))
    	{
    		return 3.8;
    	}
   	
    	return 0;
    }

    public static void main(String[] args) {

    }

}
