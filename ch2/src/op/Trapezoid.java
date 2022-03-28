package op;

public class Trapezoid {

	public static void main(String[] args) {
		// 사다리꼴 넓이 구하기 
		// 윗변 = 5 , 아랫변 = 10 , 높이 = 7 로 변수 선언하기  
		// 사다리꼴 넓이 구하는공식 : ( 윗변 + 아랫변 )  * 높이 / 2
		
		
		int up = 5; 	//윗변
		int down = 10;	//아랫변
		int height = 7;	//높이
		
		double area = (double)(up+down) * height /2;
		System.out.println("사다리꼴의 넓이 : "+area);

	}

}
