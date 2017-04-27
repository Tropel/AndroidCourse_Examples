
public class Tavuk {
	/*
	 * Bir objenin gerçekten çöp olup olmadýðýna karar veren
	 * mekanizma, çöp toplayýcýsýdýr (garbage collector)
	 * 
	 * Uygulamada bir obje, kullanýlmýyorsa çöp toplayýcýsý tarafýndan
	 * hafýzadan silinir. Bu iþlem kodu yazan kiþi bakýmýndan 
	 * rahatlýkla oluþturulabilir.
	 * 
	 * finalize() metodu çöp toplayýcý tarfýndan objeyi hafýzadan
	 * silmeden önce çalýþtýrýr.
	 * 
	 * Ayný idam mahkumlarýnýn son isteði gibi, finalize() metodunun
	 * objenin yapmasý gereken son iþlemi olarak düþünebiliriz.
	 */
	
	
	int yumurta=0;
	
	public Tavuk(int deger){
		this.yumurta=deger;
		System.out.println("Yumurta oluþturuldu"+this.yumurta);
	}
	
	public void finalize(){
		System.out.println("Yumurta yok ediliyor"+this.yumurta);
	}
	
}
