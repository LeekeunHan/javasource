package op;


//String 의 S 즉 , 처음문자가 대문자가나오면 클래스가 나오는것이다 


public class CompareOperatorEx2 {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 =new String("홍길동"); 
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println();
		
		
		//문자열(String)을 비교할때는 equals 를 사용한다 
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

	}

}
