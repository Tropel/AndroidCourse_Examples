import java.util.HashMap;
import java.util.Scanner;


public class HashMapOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Araba", 1);
		map.put("Kedi", 2);
		map.put("Elma", 3);
		
		Scanner sc = new Scanner(System.in);
		String kelime = sc.next();
		
		if(map.containsKey(kelime)){
			System.out.println(map.get(kelime));
		}else{
			System.out.println("Kelime bulunamadý !");
		}
		
	}

}
