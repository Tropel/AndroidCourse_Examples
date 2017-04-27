
public class Tavuk {
	/*
	 * Bir objenin ger�ekten ��p olup olmad���na karar veren
	 * mekanizma, ��p toplay�c�s�d�r (garbage collector)
	 * 
	 * Uygulamada bir obje, kullan�lm�yorsa ��p toplay�c�s� taraf�ndan
	 * haf�zadan silinir. Bu i�lem kodu yazan ki�i bak�m�ndan 
	 * rahatl�kla olu�turulabilir.
	 * 
	 * finalize() metodu ��p toplay�c� tarf�ndan objeyi haf�zadan
	 * silmeden �nce �al��t�r�r.
	 * 
	 * Ayn� idam mahkumlar�n�n son iste�i gibi, finalize() metodunun
	 * objenin yapmas� gereken son i�lemi olarak d���nebiliriz.
	 */
	
	
	int yumurta=0;
	
	public Tavuk(int deger){
		this.yumurta=deger;
		System.out.println("Yumurta olu�turuldu"+this.yumurta);
	}
	
	public void finalize(){
		System.out.println("Yumurta yok ediliyor"+this.yumurta);
	}
	
}
