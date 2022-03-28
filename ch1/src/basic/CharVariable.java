package basic;

// 컴퓨터 : 0 , 1 
//		: A => ? , 가 => ? 
// 컴퓨터 내부에서 문자를 표현하기 위한 문자 코드 set : 문자 인코딩 
// A => 비트로 변환 
// 문자 디코딩 : 비트 => 문자 로 표현 
// ASCII (기본 문자 인코딩 방식)
// 유니코드 : 각 나라의 표준 인코딩(UTF-8)
//			: 1byte 는 아스키 코드값과 일치 

// 문자형 : 	1. char(2byte) : 홑따옴표('') 안에 표현(문자는 하나만 가능)
// 			2. String : 쌍따옴표 ("") : 문자를 여러개 쓸 수 있음  
// A : 65 , a : 97 <-- ASCII 값 


public class CharVariable {

	public static void main(String[] args) {
		char ch1 = 'A';
		//char ch2 = 'AB'; // Invalid character constant : 문자를 하나만 써야함 2개써서 에러남 
		System.out.println("ch1= "+ch1);
		
		char ch2 = 65;
		System.out.println("ch2= "+ch2); //정수값에 해당하는 문자 출력 
		
		int i = 65;
		System.out.println("i= "+i);
		
		
		
//		String str1 ="A";
//		String str2 ="Abcded";
		

	}

}
