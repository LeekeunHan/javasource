package condition;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 0 ~ 10 까지의 숫자 중에서 짝수만 출력 (continue)
		for (int i=0; i<=10; i++) {
			if(i % 2 != 0) {
				continue;	// 홀수이면 출력문이 실행 안됨 
			}
			System.out.print(i+" ");
		}
		
		System.out.println(" "); // 한줄띄기
		
		// 1 ~ 100 까지 숫자 중에서 홀수의 합만 출력 
		int sum =0;
		for (int i=1; i<=100; i++) {
			if (i % 2 == 0) {	
				continue;
			}
			sum+=i;
		}
		System.out.println("1에서 100까지 홀수 합은 : "+sum);
		
		
		
	}

}
