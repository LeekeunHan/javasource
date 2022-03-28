package condition;

public class WhlieEx2 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 합 
		
		int i = 1 ;
		int sum = 0;
		while (i<=10) {
			sum +=i;
			i++;
			
		}
		System.out.println("10까지의 합 : "+sum);
		
		/*************************************************/
		
		sum =0;
		i = 1;
		while (i<=100) {
			sum +=i;
			i++;
			
		}
		System.out.println("100까지의 합 : "+sum);
		
	}

}
