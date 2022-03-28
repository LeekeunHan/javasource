package op;

// 논리연산자 : 결과가 true , false 
// && : 논리 곱 and / 두개다  true 면 true 로 나옴 
// || : 논리 합 or / 둘중에 하나만 true 면 true 
// ! : 부정 

public class LogicalOperatorEx1 {

	public static void main(String[] args) {
		
		boolean result = (5 > 3) && (5 > 2);
		System.out.println(result);
		
		result = (5 > 3) || (5 < 2);
		System.out.println(result);

	}

}
