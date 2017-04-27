
public class ThreadOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] dizi = new String[5];
		dizi[0]="a";
		dizi[1]="b";
		dizi[2]="c";
		dizi[3]="d";
		dizi[4]="e";
		
		String[] dizi2 = {"1","2","3","a","b"};
		
		
		ThreadOlustur t = new ThreadOlustur(dizi);
		t.start();
		
		ThreadOlustur t3 = new ThreadOlustur(dizi2);
		t3.start();

	}

}
