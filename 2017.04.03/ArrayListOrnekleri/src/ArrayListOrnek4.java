import java.util.ArrayList;


public class ArrayListOrnek4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> gunler = new ArrayList<String>();
		gunler.add("Pazartesi");
		gunler.add("Salý");
		gunler.add("Çarþamba");
		gunler.add("Perþembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.set(4, "Cumaa");
		
		for (int i = 0; i < gunler.size(); i++) {
			System.out.println(gunler.get(i));
		}
		System.out.println("---");
		
		for(String gun : gunler){ //FOREACH
			System.out.println(gun);
		}
		

	}

}
