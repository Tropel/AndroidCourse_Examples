import java.io.File;


public class DosyaIslemleriOrnek2 {

	public static void main(String[] args) {
		File file = new File("D:\\serifgungor\\merhaba.txt");
		
		if(file.exists()){
			System.out.println("Bu bir dosya m� ?"+file.isFile());
			System.out.println("Bu bir dizin mi ?"+file.isDirectory());
			if(file.isFile()){
				System.out.println("Dosyan�z�n karakter uzunlu�u"+file.length());
			}
			
		}else{
			System.out.println("B�yle bir dosya yok !");
		}
		
	}

}
