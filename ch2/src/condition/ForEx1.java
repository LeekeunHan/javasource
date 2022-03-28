package condition;

/*
 * 반복문 
 * 어떤 작업이 반복적으로 실행되도록 할때 사용 
 * for / while / do ~ while
 * 
 * 
 * */

public class ForEx1 {

	public static void main(String[] args) {
		
		//1. int i=0; 처음 한번만 실행 
		//2. i<10; ( 0 < 10 )
		//3. for 블럭 안으로 진입 { } 안 구문 실행 
		//4. i++ ( i=i+1 ) i = 1
		
		//5. i<10;( 1 < 10 ) 
		//6. for 블럭 안으로 진입 { } 안 구문 실행 
		
		// .........
		// i++  i = 10 
		//i < 10 ( 11 < 10 ) false 가 뜨는순간 반복문 종료 
		
		for (int i=0; i<10; i++) {
			System.out.println("안녕하세요");
		}

	}

}
