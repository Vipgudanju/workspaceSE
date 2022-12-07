// 2022-12-07

public class ConCurrentPrintThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
		System.out.println("띵!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  }
	}
}
