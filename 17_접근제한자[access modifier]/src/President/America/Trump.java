// 2022-11-29

package President.America;

import President.Korea.YS;

public class Trump {
	
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("Trump.method1()");
	}
	protected void method2() {
		System.out.println("Trump.method2()");
	}
	void method3() {
		System.out.println("Trump.method3()");
	}
	private void method4() {
		System.out.println("Trump.method4()");
	}
	public void access() {
		/*
		 The constructor YS() is not visible
		 YS ys=new YS();
		 */
	}
	
}