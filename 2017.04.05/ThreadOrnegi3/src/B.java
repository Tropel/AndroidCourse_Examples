
public class B implements Runnable {
	
	public B(){}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("B'deyim.");
		}
	}

}
