package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 << Object >>
		 Class Object is the root of the class hierarchy. 
		 Every class has Object as a superclass. 
		 All objects, including arrays, implement the methods of this class.
		 */
		Object o1 =  new Object();
		Object o2 =  new Object();
		Object o3 = o1;
		/*
		 * << Object >>
		 * public String toString()
		 * Returns:
		 * 		a string representation of the object.
		 */
		String str1 = o1.toString();
		System.out.println(str1);
		System.out.println(o2);
		
		/*
		 
		 */
		if(o1.equals(o2)) {
			System.out.println("o1 과 o2 주소가동일하다.[equals]");
		}else {
			System.out.println("o1 과 o2 주소가동일하지않다.[equals]");
			
			
		}
		if(o1==o2){
			System.out.println("o1 ==o2 주소가동일하다.[==]");
		}else {
			System.out.println("o1 과 o2 주소가동일하지않다.[==]");
		}
		
		System.out.println(" --------------- ObjectChild -----------------");
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = oc1;
		System.out.println("---- 상속받은 Object.equals");
		if(oc1.equals(oc3)) {
			System.out.println("oc1과 oc3 주소가 동일하다.");
		}
		System.out.println("---- 상속받은 Object.equals ==> 재정의 ----");
		System.out.println(oc1.toString());
		System.out.println(oc2);
		System.out.println(oc3);
		
		

	}

}
