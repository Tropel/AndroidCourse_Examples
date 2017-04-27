import java.util.ArrayList;

public class ArrayListOrnek3 {
	
	public static void main(String[] args){
		ArrayList liste = new ArrayList();
		liste.add(4);
		liste.add(true);
		liste.add("merhaba");
		
		//ELEMANLARI YAZDIR
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		//LÝSTEYÝ TEMÝZLE
		liste.clear();
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste);
		}
		
		//LÝSTE BOÞ MU ?
		System.out.println(liste.isEmpty());
	}
	

}
