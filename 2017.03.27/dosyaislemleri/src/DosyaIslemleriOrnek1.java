import java.io.File;
import java.io.IOException;


public class DosyaIslemleriOrnek1 {

	
	public static void main(String[] args) {
		File f = null;
		boolean bool = false;	
			
			try {
				//D�Z�N OLU�TURUR
				f = new File("D://serifgungor");
				bool = f.mkdir();
				System.out.println("Dizin olu�turuldu mu ?"+bool);
				System.out.println("\n----\n");
				//DOSYA OLU�TURUR
				f = new File("D://serifgungor//java.txt");
				bool = f.createNewFile();
				System.out.println("Dosya olu�turuldu mu ?"+bool);
				System.out.println("\n----\n");
				//DOSYAYI S�LER
				bool = f.delete();
				System.out.println("Dosya silindi mi ?"+bool);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
