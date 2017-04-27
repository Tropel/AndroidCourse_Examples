import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListOrnek2 {
	
	public static void main(String[] args){
		System.out.println("Kaç eleman gireceksiniz ?");
		Scanner sc = new Scanner(System.in);
		int elemanSayisi = sc.nextInt();
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println(i+". elemaný gir;");
			list.add(sc.next());
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			if ("ismek".equals(list.get(i))) {
				list.remove(i);
			}
		}
		
		for (int i
				
				= 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
