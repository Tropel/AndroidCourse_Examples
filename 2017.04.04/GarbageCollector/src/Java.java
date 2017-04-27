
public class Java {

	public static void main(String[] args){
		for (int i = 0; i < 10; i++) {
			Tavuk tavuk = new Tavuk(i);
		}
		System.out.println("--");
		System.gc();
		
		
		System.out.println("--");
		for (int i = 0; i < 20; i++) {
			Tavuk tavuk = new Tavuk(i);
		}
	}
}
