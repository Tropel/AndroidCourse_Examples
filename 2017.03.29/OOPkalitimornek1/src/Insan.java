
public class Insan extends Adem{ //Extends ile sadece bir class'dan t�reyebilir.
	
	//METOT OVERR�DE ��LEM� YAPILDI

	public void nefesAl(){
		//System.out.println("�nsan nefes ald� !");
		super.nefesAl(); //Miras al�nan class'dan gelen de�er.
	}
	

	public static void main(String[] args) {
		Insan i = new Insan();
		i.nefesAl();		
	}

}
