package api;

public class Replace {

	public static void main(String[] args) {
		// String : immutable(불변) 객체 
		
		String str1= "Hello java. Hello java";
		//"java" 를 "자바"로 바꾸기 
		System.out.println(str1.replace("java", "자바")); 
		
		String str3 = str1.replace("java", "자바");
		System.out.println(str3);
		
		
		//첫번째 문자열만 "java" 를 "자바"로 바꾸기 
		String str4 = str1.replaceFirst("java", "자바"); 
		System.out.println(str4);
		
		
		String str2 = "Hello";
		str2+="안녕하세요";
		str2+="반갑습니다";
		str2+="감사합니다";
		str2+="안녕히가세요";
		System.out.println(str2);
	}

}
