// 2022-12-07

public class MainThreadCalled {
	public void main_thread_called_method() {
		System.out.println("A." +Thread.currentThread().getName()+"스레드 실행");
		System.out.println("B." +Thread.currentThread().getName()+"스레드 반환");
		return;
	}
	
	
	
	
}
