import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Kedi {
	int yas = 0;
	
	public Kedi(){}
	
	public Kedi(int yas){
		this.yas = yas;
	}
	
	public void mesajDon(){
		System.out.println("Miyav...");
	}
	
	public static void main(String[] args){
		Kedi kedi = new Kedi(5);
		kedi.mesajDon();
		
		/*
		int sayi = 1;
		int 1sayi = 1; // sayý ile baþlayamaz
		int final = 1; // yazýlým diline ait özel kelimeler içeremez.
		String ad-soyad = "þerif"; // özel karakterler kullanýlamaz.
		*/
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			
		}
		
		String ad = "þerif";
		int age = 1;
		boolean b = true;
		char c = 'a';
		
		/*
		List<String> liste = new ArrayList<String>();
		
		System.out.println("sayý");
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			liste.add(sc.next());
		}
		
		for (int i = 0; i < sayi; i++) {
			if(liste.get(i).charAt(0)=='A'){
				System.out.println(liste.get(i));
			}
		}
		*/
		
		String[] dizi = new String[4];
		dizi[0] = "Sonbahar";
		dizi[1] = "Kýþ";
		dizi[2] = "Ýlkbahar";
		dizi[3] = "Yaz";
		
		Scanner sc = new Scanner(System.in);
		String deger = sc.next();
		int a = 0;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i] == deger){
				a = i;
			}
		}
		
	    switch (deger) {
		case "Sonbahar":
			System.out.println(deger);
			break;

		default:
			System.out.println("Yanlýþ deðer girdiniz");
			break;
		}
		
		
		
		
		
		
	}

}
