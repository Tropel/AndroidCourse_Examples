
public class Baslangic {

	
	public static void main(String[] args) { //base class
		
		Hayvan h = new Hayvan(10,"Ay�","Erkek");
		//h.setYas(10);
		//h.setTur("Ay�");
		//h.setCinsiyet("Erkek");		
		
		
		//set ile de�er atamas� yap�l�r
		// get ile de�er atamas� yap�lm�� de�erlerler �a��r�l�r.
		System.out.println(h.getCinsiyet());
		System.out.println(h.getYas());
		System.out.println(h.getTur());
		h.konus();

	}
	

}