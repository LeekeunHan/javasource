package api;

public class Contains {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// 위치 : indexof , 있나없나 : contains
		boolean result = str1.contains("프");
		System.out.println(result);
		
		System.out.println(str1.contains("스프링"));
	}

}
