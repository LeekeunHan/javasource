package api;

public class StringEx1 {

	public static void main(String[] args) {

		//문자열 만들 때 2가지 방법 
		//1. 문자열 리터럴을 지정 
		//2. String 클래스 생성자 이용 
		String str1 = "Hello";	//리터럴
		String str2 = "Hello";
		String str3 = new String("Hello"); //new
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		
		//내용비교 equals()
		
	}

}
