// 2022-11-21

/*
 * 객체간의 관계
 * 
 * Car has a no(int)
 * Car has a mode(String)
 * Car has a engine(Engine)
 */

public class Car {
    public int no;			// 차량번호
    public String model;	// 차량모델명
    
    // 차량엔진
    public Engine engine;	// 차량엔진 객체주소를 저장할 멤버필드
    
    public Car() {
    	
    }
    
    public Car(int no, String model, Engine engine) {
    	this.no = no;
    	this.model = model;
    	this.engine = engine;
    }
    
    public void print() {
    	System.out.print(this.no + "\t"+ this.model +"\t");
    	/*
    	System.out.println(this.engine.type);
    	System.out.println(this.engine.cc);
    	*/
    	
    	this.engine.print();
    }
    
    
    public void setEngine(Engine engine) {
    	this.engine = engine;
    }
    public Engine getEngine()  {
    	return this.engine;
    }
    
    // getters, setters
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

    
    
}
