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
		int 1sayi = 1; // say� ile ba�layamaz
		int final = 1; // yaz�l�m diline ait �zel kelimeler i�eremez.
		String ad-soyad = "�erif"; // �zel karakterler kullan�lamaz.
		*/
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			
		}
		
		String ad = "�erif";
		int age = 1;
		boolean b = true;
		char c = 'a';
		
		/*
		List<String> liste = new ArrayList<String>();
		
		System.out.println("say�");
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
		dizi[1] = "K��";
		dizi[2] = "�lkbahar";
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
			System.out.println("Yanl�� de�er girdiniz");
			break;
		}
		
		
		
		
		
		
	}

}
