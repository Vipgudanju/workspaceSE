// 2022-12-07

public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintSharedObject sharedObject=
				new SynchronizeUpperLowerPrintSharedObject();
		SynchronzeUpperThread upperThread=
				new SynchronzeUpperThread(sharedObject);
		SynchronzeLowerThread lowerThread=
				new SynchronzeLowerThread(sharedObject);
		upperThread.start();
		lowerThread.start();
	}

}
