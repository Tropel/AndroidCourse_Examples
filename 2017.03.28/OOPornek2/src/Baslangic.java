import java.util.Scanner;


public class Baslangic {

	public static void main(String[] args) {
		
		/*
		
		// KULLANIM 1
		Cicek cicek = new Cicek();
		cicek.setCins("Kakt�s");
		cicek.setDikeniVarMi(true);
		cicek.setKokuluMu(false);
		cicek.setRenk("Ye�il");
		cicek.setYaprakSayisi(0);

		System.out.println(cicek.getCins());
		System.out.println(cicek.getRenk());
		System.out.println(cicek.getYaprakSayisi());
		System.out.println(cicek.isDikeniVarMi());
		System.out.println(cicek.isKokuluMu());
		
		// KULLANIM 2		
		Cicek cicek2 = new Cicek("Ye�il","Kakt�s",0,false,true);
		System.out.println(cicek2.getCins());
		System.out.println(cicek2.getRenk());
		System.out.println(cicek2.getYaprakSayisi());
		System.out.println(cicek2.isDikeniVarMi());
		System.out.println(cicek2.isKokuluMu());
		
		// KULLANIM 3		
		Cicek cicek3 = new Cicek("Ye�il","Kakt�s",0,false,true);
		cicek.hepsiniYazdir();
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�i�e�in rengini girin;");
		String renk = sc.next();
		System.out.println("�i�e�in t�r�n� girin;");
		String tur = sc.next();
		System.out.println("�i�e�in yaprak say�s�n� girin;");
		int yaprakSayisi = sc.nextInt();
		System.out.println("�i�ek kokulu mu(true,false);");
		boolean koku = sc.nextBoolean();
		System.out.println("�i�ek dikenli mi(true,false);");
		boolean diken = sc.nextBoolean();
		
		// KULLANIM 3		
		Cicek cicek4 = new Cicek(renk,tur,yaprakSayisi,koku,diken);
		cicek4.hepsiniYazdir();

	}

}
