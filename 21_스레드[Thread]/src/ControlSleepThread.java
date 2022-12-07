// 2022-12-07

import java.util.Date;

public class ControlSleepThread extends Thread{
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("ControlSleepThread--> 1초마다 1번씩~");
				Date now = new Date();
				System.out.println(now.toLocaleString());
				/*
				 현재실행되고 있는 스레드를 1000ms동안 실행을 중지(sleep)
				 */
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	

}
