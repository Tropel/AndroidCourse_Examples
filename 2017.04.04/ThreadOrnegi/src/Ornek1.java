import java.util.ArrayList;


public class Ornek1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("G�LE");
		liste.add("G�LE");
		liste.add("GEN�LER....");
		IntentLauncher il = new IntentLauncher(1,liste);
		il.start();

	}

	
}
