import java.util.ArrayList;


public class Ornek1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("GÜLE");
		liste.add("GÜLE");
		liste.add("GENÇLER....");
		IntentLauncher il = new IntentLauncher(1,liste);
		il.start();

	}

	
}
