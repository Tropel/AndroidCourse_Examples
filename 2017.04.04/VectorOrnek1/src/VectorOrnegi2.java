import java.util.Scanner;
import java.util.Vector;


public class VectorOrnegi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ka� eleman girilecek");
		int sayi = sc.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			System.out.println((i+1)+". eleman� giriniz;");
			v.add(sc.next());
		}
		
		System.out.println("silinecek eleman� giriniz;");
		String sil = sc.next();
		for (int i = 0; i < sayi; i++) {
			if(sil.equals(v.get(i))){
				v.remove(i);
			}
		}
		
		System.out.println("----\nListenin Son hali");
		for (String string : v) {
			System.out.println(string);
		}
		

	}

}
