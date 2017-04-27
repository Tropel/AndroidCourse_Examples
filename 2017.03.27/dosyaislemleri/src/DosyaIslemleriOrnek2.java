import java.io.File;


public class DosyaIslemleriOrnek2 {

	public static void main(String[] args) {
		File file = new File("D:\\serifgungor\\merhaba.txt");
		
		if(file.exists()){
			System.out.println("Bu bir dosya mý ?"+file.isFile());
			System.out.println("Bu bir dizin mi ?"+file.isDirectory());
			if(file.isFile()){
				System.out.println("Dosyanýzýn karakter uzunluðu"+file.length());
			}
			
		}else{
			System.out.println("Böyle bir dosya yok !");
		}
		
	}

}
