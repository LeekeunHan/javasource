package api;

public class StringBuilderEx {

	public static void main(String[] args) {
		//String 클래스(변경불가)와 다른점은 mutable(변경가능) : append,insert,delete
		//		원본이 바뀌지않음               원본이 바뀜 
		//StringBuilder : 문자열 클래스 , 싱글 스레드
		//StringBuffer : 문자열 클래스 , 멀티 스레드 
		
		// builder = "ttt";(x)
		StringBuilder builder = new StringBuilder("Hello java");
		builder.append("안녕하세요");
		System.out.println(builder);
		
		System.out.println(builder.delete(0, 2));
		System.out.println(builder);

		builder.insert(2,"T");
		System.out.println(builder);
		
		StringBuilder builder1 = new StringBuilder("hello");
		StringBuilder builder2 = new StringBuilder("hello");
		
		//equals() : 오버라이딩 안되어 있음 --> 주소비교 
		System.out.println(builder1.equals(builder2));
		
		
		//builder(변경가능)를 쓰고 string(변경불가)으로 가져와도됨 
		String str1 = new String(builder1);
		String str2 = new String(builder2);
		System.out.println(str1.equals(str2));
		
	}

}
