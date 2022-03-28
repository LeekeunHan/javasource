package op;

// 논리 연산자 : true , false 
// 논리 부정연산자 : ! : true를 false로 false를 true로 바꾸어준다 


public class DenyLogicOperatorEx {

	public static void main(String[] args) {
		boolean flag = true;
		System.out.println("flag = "+flag);
		
		
		flag = !flag;
		System.out.println("flag = "+flag);
	}

}
