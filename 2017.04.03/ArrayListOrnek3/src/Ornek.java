import java.util.ArrayList;


public class Ornek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Hayvan> hayvanlar = new ArrayList<Hayvan>();
		hayvanlar.add(new Hayvan("Kedi",1,"Beyaz"));
		hayvanlar.add(new Hayvan("Kaplan",5,"Sarý"));
		
		for (Hayvan hayvan : hayvanlar) {
			System.out.println(hayvan.getAd());
		}
	}

}
