package classtest;

/*
 *  클래스 - 멤버변수 , 메소드를 내부에서 사용할때는 이름만 사용해서 작성 
 * 
 * 
 */


public class Calculator2 {
	int plus(int x ,int y) {		// x + y 를 plus 에 저장 / x=7 y=10
		return x+y;					// return 17 
	}
	
	double avg (int x, int y) {		 
		double sum = plus(x,y);		// plus값을 호출하여 sum 에다가 저장
		
		return sum /2;				// 17 / 2				
	}
	
	
	
	
	void execute() {
		double result = avg(7,10);	
		println("실행결과 = "+result);
		
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
