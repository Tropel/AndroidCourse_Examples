import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DosyaIslemleriOrnek5 {
	
	public DosyaIslemleriOrnek5(){}
	
	public void dosyalariOlustur(String konum, String[] dizi){
		File f;
		boolean b = false;
		int uzunluk = dizi.length;
		for (int i = 0; i < uzunluk; i++) {
			f = new File(konum+dizi[i]);
			try {
				b = f.createNewFile();
				if(b==true){
					System.out.println(dizi[i]+" adlý dosya oluþturuldu.");
				}else{
					System.out.println(dizi[i]+" adlý dosya oluþturulamadý.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println("Dizi kaç elemanlý olacak ?");
		Scanner sc = new Scanner(System.in);
		int elemanSayisi = sc.nextInt();
		
		String[] strDizi = new String[elemanSayisi];
		
		for (int i = 0; i < strDizi.length; i++) {
			System.out.println(i+". dosya ismini giriniz;");
			strDizi[i] = sc.next()+".txt";
		}
		
		DosyaIslemleriOrnek5 dosya = new DosyaIslemleriOrnek5();
		dosya.dosyalariOlustur("D://serifgungor//",strDizi);
		
		

	}

}
