// 2022-12-07

public class ConCurrentBeepPrintMain extends Thread {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		System.out.println("2.main thread ConCurrentBeepThread 객체생성");
		ConCurrentBeepThread beepThread = new ConCurrentBeepThread();
		System.out.println("3.main thread ");
		beepThread.start();
		System.out.println("4.main thread ConCurrentPrintThread 객체생성");
		ConCurrentPrintThread printThread = new ConCurrentPrintThread();
		System.out.println("5.main thread ConCurrentPrintThread 객체.start()메소드");
		printThread.start();
		System.out.println("9.main thread end jvm return");

	}

}
