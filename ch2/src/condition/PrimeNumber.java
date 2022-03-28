package condition;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1 ~ 100 숫자 중에서 소수 구하기 
		// 1과 자기자신으로만 나누어지는 수 
		
		int count = 0;
		for (int i=2; i<=100; i++) { 		// 소수는 2부터 시작이니 i=2 
			for ( int j=1; j<=i; j++) {		// 1 <= 2 , 2<=2 / j가 3이 되면서 밑에 if문실행
				if (i % j ==0) {			// i % j 나머지가 0이면 count 1 증가 
					count++;
				}
			}
			if(count == 2) {				// 1과 자기자신 밖에 없다면 count = 2 
				System.out.print(i+" ");
			}
			count =0;
		}
		
			//3 
			// 1 <= 3  , 2 <= 3 , 3 <= 3
			// count (i % j ==0) => 1 <= 3 3 <= 3 => count = 2
			// 따라서 count=2이므로 1과 자신밖에 없으므로 3은 소수이다 
			// 그리고 count 를 다시 0으로 초기화 
		
	}

}
