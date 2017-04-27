import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DosyaIslemleriOrnek6 {

	
	public static void main(String[] args) {
		//DOSYA OKUMA ÖRNEÐÝ
		File f = new File("D:\\serifgungor\\android.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			int ch=0;
			try {
				while((ch=fis.read())!=-1){
					System.out.print((char)ch);
				}
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
