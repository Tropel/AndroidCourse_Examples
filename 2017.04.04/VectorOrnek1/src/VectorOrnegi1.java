import java.util.Iterator;
import java.util.Vector;


public class VectorOrnegi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.add("bir");
		vector.add("iki");
		vector.add("ьз");
		
		
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		vector.remove("iki"); // vector.remove(1)
		
		
		for (String eleman : vector) {
			System.out.println(eleman);
		}


	}

}
