import java.util.Iterator;

// 2022-11-28

public class GajunGumesa {
	/*
	 * private GajunTV[] gajuns1;
	 * private GajunAudio[] gajuns2;
	 * private GajunSmartPhone[] gajuns3;
	 */
	private GajunOnOff[] gajuns;
	public GajunGumesa() {
	}
	public GajunGumesa(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public void gumsa() {
		for(GajunOnOff tempgajun : gajuns) {
			tempgajun.on();
			GajunVolume tempGajun2 = (GajunVolume)tempgajun;
			tempGajun2.volumeup();
			tempGajun2.volumedown();
			tempgajun.off();
			System.out.println("------- 검사 끝 출고 --------");
		}
	}
	
	
	
}
