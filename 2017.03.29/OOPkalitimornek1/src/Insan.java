
public class Insan extends Adem{ //Extends ile sadece bir class'dan türeyebilir.
	
	//METOT OVERRÝDE ÝÞLEMÝ YAPILDI

	public void nefesAl(){
		//System.out.println("Ýnsan nefes aldý !");
		super.nefesAl(); //Miras alýnan class'dan gelen deðer.
	}
	

	public static void main(String[] args) {
		Insan i = new Insan();
		i.nefesAl();		
	}

}
