package exception;

public class ArithmethicExceptionEx {

	public static void main(String[] args) {
		
		
		int num1=5, num2=0;
		// 에러내용 : java.lang.ArithmeticException:
		//			0으로 나누어서 에러가 뜬다 
		
		try { //예외가 발생할 만한 코드 
			System.out.println(num1/num2);
		} catch (Exception e) {	//예외가 발생하면 처리 
			//System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();	//stack에 있는 내용을 따라가서 출력을 해줘 
		}
		
		
		
	}

}
