package op;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 화씨온도 => 섭씨 온도 
		// 화씨온도 입력받은후 섭씨온도로 변환하기
		// 섭씨 온도 = (화씨온도 - 32) * 5/9
		
		Scanner sc =new Scanner(System.in);
		System.out.println("화씨 온도 입력");
		int fahr = sc.nextInt(); //fahr : 화씨온도
		
		// 5/9 => 몫 (0)
		// 5/9.0 => 
		double celsius = 5/9.0*(fahr-32); 
		System.out.println("변환된 섭씨온도 :"+celsius);
		//format 지정 : %f(실수형) , %d(정수형) , %c(문자열 - ' ') , %s(문자열 - ," ") 
		System.out.printf("변환된 섭씨온도 :%.3f\n",celsius); // 소수점 3자리까지나오게하겠다
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
