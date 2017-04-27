import java.io.File;
import java.io.IOException;


public class DosyaIslemleriOrnek3 {

	
	public static void main(String[] args) {
		File f = null;
		boolean bool = false;	
			
			try {
				//20 ADET DOSYA OLUÞTURDU
				for (int i = 0; i < 20; i++) {
					f = new File("D://serifgungor//java"+i+".txt");
					bool = f.createNewFile();
					System.out.println("Dosya "+i+" oluþturuldu mu ?"+bool);
				}
				//TEKLERÝ SÝLDÝ
				for (int i = 0; i < 20; i++) {
					f = new File("D://serifgungor//java"+i+".txt");
					if(i%2==1){
						bool = f.delete();
						System.out.println("Dosya "+i+" silindi mi ?"+bool);
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
