import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek1 {

 public static void main(String[] args){
	 List<String> liste = new ArrayList<String>();
	 
	 liste.add("Ali �hsan");
	 liste.add("Aycan");
	 liste.add("Emir");
	 liste.add("Enes");
	 liste.add("Halil");
	 liste.add("Ferhat");
	 liste.add("Hatice");
	 liste.add("�mran");
	 liste.add("Yavuz");
	 liste.add("Zeynep");
	 liste.add("Zeynep");
	 System.out.println("Eleman say�s�: "+liste.size());
	 
	 for (int i = 0; i < liste.size(); i++) {
		System.out.println(liste.get(i));
	 }
	 liste.remove(3);
	 System.out.println("Eleman say�s�: "+liste.size());
	 
	 for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
	 }
	 
	 
	 
 }
	
}
