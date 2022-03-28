package condition;

public class ForEx6 {

	public static void main(String[] args) {
		// 1 ~ 100 정수중에서 3의 배수 더하기 (단, 9의배수는 빼기) 
	
		int sum=0;
		for (int i=1; i<101; i++) {
			if(i % 3 == 0 && i % 9 !=0) {
				sum +=i;
				
			}
		}
		System.out.println("3의 배수 (단,9의 배수 제외) : "+sum);
			
		
		
		// 1 ~ 100 정수 중에서 3의배수와 5의 배수 총합
		sum = 0;
		for (int i=1; i<101; i++) {
			if(i % 3 == 0 || i % 5 ==0) {
				sum +=i;
			}
		}
		System.out.println("3 , 5 의 배수 합 : "+sum);
			
		
	}

}
