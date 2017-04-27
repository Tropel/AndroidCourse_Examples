
public class Baslangic {

	
	public static void main(String[] args) { //base class
		
		Hayvan h = new Hayvan(10,"Ayý","Erkek");
		//h.setYas(10);
		//h.setTur("Ayý");
		//h.setCinsiyet("Erkek");		
		
		
		//set ile deðer atamasý yapýlýr
		// get ile deðer atamasý yapýlmýþ deðerlerler çaðýrýlýr.
		System.out.println(h.getCinsiyet());
		System.out.println(h.getYas());
		System.out.println(h.getTur());
		h.konus();

	}
	

}