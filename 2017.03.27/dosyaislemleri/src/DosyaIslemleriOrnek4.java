import java.io.File;


public class DosyaIslemleriOrnek4 {
	
	public DosyaIslemleriOrnek4(){}
	
	public static void dosyalariSil(String dosyaKonumu){
		File file = new File(dosyaKonumu);
		
		File[] dizi = file.listFiles();
		for (int i = 0; i < dizi.length; i++) {
			dizi[i].delete();
		}
	}


	public static void main(String[] args) {
		dosyalariSil("D:\\serifgungor");
	}

}
