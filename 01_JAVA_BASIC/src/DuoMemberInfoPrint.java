
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		
		System.out.println("*************************");
		
		/*
		 * 변수선언
		 */
		int Member_Num;
		String Name;
		String Address_Num;
		char Gender;
		int Marry_Count;
		boolean Smoking_YN;
		double Height;
		char Study_Credit;
		char Face;
		
		
		
		/*
		 * 변수에데이타 대입
		 */
		Member_Num = 236514  ;
		Name = "홍길동";
		Address_Num = "201212-3495039"  ;
		Gender = '남';
		Marry_Count = 0;
		Smoking_YN = true;
		Height = 178.3;
		Study_Credit = 'A';
		Face = '상';
		
		
		 
		
		/*
		 * 변수내용출력
		 */
		System.out.println("회원번호 :" + Member_Num);
		System.out.println("이름 :" + Name);
		System.out.println("주민번호 :" + Address_Num);
		System.out.println("성 별 :" +Gender);
		System.out.println("결혼횟수 :" + Marry_Count);
		System.out.println("흡연여부 :" + Smoking_YN);
		System.out.println("키 :" + Height);
		System.out.println("학 점 :" + Study_Credit);
		System.out.println("용 모 :" + Face);
		
		System.out.println("*************************");
	}

}
