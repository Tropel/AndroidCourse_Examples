import java.util.HashMap;
import java.util.Scanner;


public class HashMapOrnegi2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ka� tane veri girilecek ?");
		int sayi = sc.nextInt();
		
		HashMap<String,String> hash = new HashMap<String,String>();
		
		String key="";
		String value="";
		
		for (int i = 0; i < sayi; i++) {
			System.out.println("L�tfen anahtar giriniz");
			key = sc.next();
			System.out.println("L�tfen de�er giriniz");
			value = sc.next();
			hash.put(key,value);
		}
		
		System.out.println("Aramak istedi�ini gir");
		String aranan = sc.next();
		if(hash.containsKey(aranan)){
			System.out.println(hash.get(aranan));
		}else{
			System.out.println("Kelime yok");
		}
			
	}

}
