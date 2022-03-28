package arrey;

// 향상된 for : 배열 , 리스트 
// for (타입 변수명 : 배열명(or 리스트명)){
//	수행문;
// } 
// 

public class ArreyEx4 {

	public static void main(String[] args) {
		char charr[]= {'a','b','c','d','e'};
		
		for (int i=0; i<charr.length; i++) {	//charr.length: charr배열의 길이만큼 !! 
			System.out.println(charr[i]);
		}
		
		// 향상된for문 
		for(char ch: charr) {	//charr 배열에서 차례로 하나씩 가져와서 ch라는 변수에 담아라
			System.out.println(ch);
		}
		
		
		// 예외 - char 배열인 경우에는 문자 자체가 출력됨 => 예외사항 !!
		System.out.println(charr);
		
		
		
		String str[]= {"a","b","c","d","e"};
		for (int i=0; i<str.length; i++) {	
			System.out.println(str[i]);
		}
		
		// 향상된for문 
		for(String sh:str) {
			System.out.println(sh);
		}

		System.out.println(str);
	}

}
