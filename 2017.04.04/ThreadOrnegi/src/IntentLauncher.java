import java.util.ArrayList;

public class IntentLauncher extends Thread{
	
	private static long SLEEP_TIME = 5;
	private ArrayList<String> liste;
	
	public IntentLauncher(int SLEEP_TIME,ArrayList<String> liste){
		this.SLEEP_TIME = SLEEP_TIME;
		this.liste = liste;
	}
	
	public void run() {
		try {
			for (int j = 0; j < liste.size(); j++) {
				System.out.println(liste.get(j));
				Thread.sleep(SLEEP_TIME*1000);
			}
			
		} catch (Exception e) {
			System.out.println("HATA: "+e.getMessage());
		}
	}
	
}