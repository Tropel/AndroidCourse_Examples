import java.util.Scanner;


public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Karenin kenar�n� giriniz;");
		int kenar = sc.nextInt();
		Kare kare = new Kare(kenar);
		
		System.out.println("Karenin kenar�:"+kare.getKenar());
		System.out.println("Karenin alan�:"+kare.getAlan());
		System.out.println("Karenin �evresi:"+kare.getCevre());
		

	}

}
