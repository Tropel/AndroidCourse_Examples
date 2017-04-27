
public class A implements Runnable{

	public A(){}
	
	public void run() {
		while(true){
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("A'dayým.");
		}
	}
}
