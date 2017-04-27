import java.util.Scanner;


public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Karenin kenarýný giriniz;");
		int kenar = sc.nextInt();
		Kare kare = new Kare(kenar);
		
		System.out.println("Karenin kenarý:"+kare.getKenar());
		System.out.println("Karenin alaný:"+kare.getAlan());
		System.out.println("Karenin çevresi:"+kare.getCevre());
		

	}

}
