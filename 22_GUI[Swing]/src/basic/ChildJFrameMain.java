// 2022-12-08

package basic;

import javax.swing.JFrame;

public class ChildJFrameMain {

	public static void main(String[] args) {
		
		/*
		 * 1. JFrame 객체 생성
		 */
		ChildJFrame childJFrame = new ChildJFrame();
		childJFrame.setSize(300, 400);
		
		/*
		 * 2. JFrame 객체 생성
		 */
		//JFrame jFrame = new JFrame();
		//jFrame.setTitle("난 그냥 프레임!");
		//jFrame.setSize(300, 400);
		
		/*
		 * JFrame 객체 화면에 보여주세요.
		 */
		//childJFrame.setVisible(true);
		
		/*
		 * Container[JFrame].setVisble(true);
		 * - 메인스레드가 호출하면 JVM GUI스레드를 생성
		 * - GUI스레드는 무한대기하면서 이벤트와 그래픽처리를 담당
		 * - Container[JFrame]는 계속떠있다.
		 *   (JVM이 종료되지 않는다.)
		 */
		
		
		/*
		JFrame jFrame = new JFrame();
		jFrame.setSize(300, 400);
		jFrame.setVisible(true);
		*/
		
	}

}
