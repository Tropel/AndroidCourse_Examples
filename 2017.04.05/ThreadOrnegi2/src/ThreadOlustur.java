
public class ThreadOlustur extends Thread {
	
	private String[] dizi;
	
	public ThreadOlustur(String[] dizi){
		this.dizi = dizi;
	}
	
	public void run() {		
		try {
			for (int i = 0; i < dizi.length; i++) {
				System.out.println(dizi[i]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
