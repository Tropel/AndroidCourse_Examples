import java.util.ArrayList;
import java.util.Iterator;


public class Ornek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int ogrenciNumarasi, String isim, String soyisim, int yas
		Ogrenci ogr1 = new Ogrenci(1,"aycan","ta�c�",20);
		Ogrenci ogr2 = new Ogrenci(2,"ferhat","aytu�",20);
		
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		ogrenciListesi.add(ogr1);
		ogrenciListesi.add(ogr2);
		
		Iterator itr = ogrenciListesi.iterator();
		
		while(itr.hasNext()){
			Ogrenci ogr = (Ogrenci)itr.next();
			System.out.println(
					"��renci Ad�: "+ogr.isim+
					"��renci Soyad�: "+ogr.soyisim+
					"��renci Ya�: "+ogr.yas+
					"��renci No: "+ogr.ogrenciNumarasi
					);
		}
		

	}

}
